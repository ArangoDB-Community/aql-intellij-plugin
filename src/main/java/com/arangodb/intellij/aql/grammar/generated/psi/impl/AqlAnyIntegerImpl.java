// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlAnyInteger;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlIntegerType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlSignedInteger;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AqlAnyIntegerImpl extends ASTWrapperPsiElement implements AqlAnyInteger {

    public AqlAnyIntegerImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitAnyInteger(this);
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
    public AqlIntegerType getIntegerType() {
        return findChildByClass(AqlIntegerType.class);
    }

    @Override
    @Nullable
    public AqlSignedInteger getSignedInteger() {
        return findChildByClass(AqlSignedInteger.class);
    }

}
