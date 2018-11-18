// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.psi.AqlKeywordFunctions;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.machak.aql.grammar.generated.psi.AqlTypes.*;

public class AqlKeywordFunctionsImpl extends ASTWrapperPsiElement implements AqlKeywordFunctions {

    public AqlKeywordFunctionsImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitKeywordFunctions(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof AqlVisitor) {
            accept((AqlVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

    @Override
    @Nullable
    public PsiElement getFCollections() {
        return findChildByType(F_COLLECTIONS);
    }

    @Override
    @Nullable
    public PsiElement getFCount() {
        return findChildByType(F_COUNT);
    }

    @Override
    @Nullable
    public PsiElement getFCountDistinct() {
        return findChildByType(F_COUNT_DISTINCT);
    }

    @Override
    @Nullable
    public PsiElement getFCountUnique() {
        return findChildByType(F_COUNT_UNIQUE);
    }

    @Override
    @Nullable
    public PsiElement getFFirst() {
        return findChildByType(F_FIRST);
    }

    @Override
    @Nullable
    public PsiElement getFHas() {
        return findChildByType(F_HAS);
    }

    @Override
    @Nullable
    public PsiElement getFLast() {
        return findChildByType(F_LAST);
    }

    @Override
    @Nullable
    public PsiElement getFLength() {
        return findChildByType(F_LENGTH);
    }

    @Override
    @Nullable
    public PsiElement getFMinus() {
        return findChildByType(F_MINUS);
    }

    @Override
    @Nullable
    public PsiElement getFNth() {
        return findChildByType(F_NTH);
    }

    @Override
    @Nullable
    public PsiElement getFPop() {
        return findChildByType(F_POP);
    }

    @Override
    @Nullable
    public PsiElement getFPosition() {
        return findChildByType(F_POSITION);
    }

    @Override
    @Nullable
    public PsiElement getFPush() {
        return findChildByType(F_PUSH);
    }

    @Override
    @Nullable
    public PsiElement getFRemoveNth() {
        return findChildByType(F_REMOVE_NTH);
    }

    @Override
    @Nullable
    public PsiElement getFRemoveValue() {
        return findChildByType(F_REMOVE_VALUE);
    }

    @Override
    @Nullable
    public PsiElement getFRemoveValues() {
        return findChildByType(F_REMOVE_VALUES);
    }

    @Override
    @Nullable
    public PsiElement getFReverse() {
        return findChildByType(F_REVERSE);
    }

    @Override
    @Nullable
    public PsiElement getFShift() {
        return findChildByType(F_SHIFT);
    }

    @Override
    @Nullable
    public PsiElement getFSlice() {
        return findChildByType(F_SLICE);
    }

    @Override
    @Nullable
    public PsiElement getFSorted() {
        return findChildByType(F_SORTED);
    }

    @Override
    @Nullable
    public PsiElement getFSortedUnique() {
        return findChildByType(F_SORTED_UNIQUE);
    }

    @Override
    @Nullable
    public PsiElement getFUnion() {
        return findChildByType(F_UNION);
    }

    @Override
    @Nullable
    public PsiElement getFUnionDistinct() {
        return findChildByType(F_UNION_DISTINCT);
    }

    @Override
    @Nullable
    public PsiElement getFUnique() {
        return findChildByType(F_UNIQUE);
    }

    @Override
    @Nullable
    public PsiElement getFUnshift() {
        return findChildByType(F_UNSHIFT);
    }

}
