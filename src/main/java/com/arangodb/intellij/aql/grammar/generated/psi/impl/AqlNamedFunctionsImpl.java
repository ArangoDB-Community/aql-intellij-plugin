// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlNamedFunctionMixin;
import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AqlNamedFunctionsImpl extends AqlNamedFunctionMixin implements AqlNamedFunctions {

    public AqlNamedFunctionsImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitNamedFunctions(this);
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
    public AqlFunAbs getFunAbs() {
        return findChildByClass(AqlFunAbs.class);
    }

    @Override
    @Nullable
    public AqlFunAcos getFunAcos() {
        return findChildByClass(AqlFunAcos.class);
    }

    @Override
    @Nullable
    public AqlFunAsin getFunAsin() {
        return findChildByClass(AqlFunAsin.class);
    }

    @Override
    @Nullable
    public AqlFunAtan getFunAtan() {
        return findChildByClass(AqlFunAtan.class);
    }

    @Override
    @Nullable
    public AqlFunAtan2 getFunAtan2() {
        return findChildByClass(AqlFunAtan2.class);
    }

    @Override
    @Nullable
    public AqlFunAverage getFunAverage() {
        return findChildByClass(AqlFunAverage.class);
    }

    @Override
    @Nullable
    public AqlFunAvg getFunAvg() {
        return findChildByClass(AqlFunAvg.class);
    }

    @Override
    @Nullable
    public AqlFunCeil getFunCeil() {
        return findChildByClass(AqlFunCeil.class);
    }

    @Override
    @Nullable
    public AqlFunConcatSeparator getFunConcatSeparator() {
        return findChildByClass(AqlFunConcatSeparator.class);
    }

    @Override
    @Nullable
    public AqlFunCos getFunCos() {
        return findChildByClass(AqlFunCos.class);
    }

    @Override
    @Nullable
    public AqlFunDegrees getFunDegrees() {
        return findChildByClass(AqlFunDegrees.class);
    }

    @Override
    @Nullable
    public AqlFunExp getFunExp() {
        return findChildByClass(AqlFunExp.class);
    }

    @Override
    @Nullable
    public AqlFunExp2 getFunExp2() {
        return findChildByClass(AqlFunExp2.class);
    }

    @Override
    @Nullable
    public AqlFunFloor getFunFloor() {
        return findChildByClass(AqlFunFloor.class);
    }

    @Override
    @Nullable
    public AqlFunLog getFunLog() {
        return findChildByClass(AqlFunLog.class);
    }

    @Override
    @Nullable
    public AqlFunLog10 getFunLog10() {
        return findChildByClass(AqlFunLog10.class);
    }

    @Override
    @Nullable
    public AqlFunLog2 getFunLog2() {
        return findChildByClass(AqlFunLog2.class);
    }

    @Override
    @Nullable
    public AqlFunMax getFunMax() {
        return findChildByClass(AqlFunMax.class);
    }

    @Override
    @Nullable
    public AqlFunMedian getFunMedian() {
        return findChildByClass(AqlFunMedian.class);
    }

    @Override
    @Nullable
    public AqlFunMin getFunMin() {
        return findChildByClass(AqlFunMin.class);
    }

    @Override
    @Nullable
    public AqlFunPercentile getFunPercentile() {
        return findChildByClass(AqlFunPercentile.class);
    }

    @Override
    @Nullable
    public AqlFunPi getFunPi() {
        return findChildByClass(AqlFunPi.class);
    }

    @Override
    @Nullable
    public AqlFunPow getFunPow() {
        return findChildByClass(AqlFunPow.class);
    }

    @Override
    @Nullable
    public AqlFunRadians getFunRadians() {
        return findChildByClass(AqlFunRadians.class);
    }

    @Override
    @Nullable
    public AqlFunRand getFunRand() {
        return findChildByClass(AqlFunRand.class);
    }

    @Override
    @Nullable
    public AqlFunRange getFunRange() {
        return findChildByClass(AqlFunRange.class);
    }

    @Override
    @Nullable
    public AqlFunRound getFunRound() {
        return findChildByClass(AqlFunRound.class);
    }

    @Override
    @Nullable
    public AqlFunSQRT getFunSQRT() {
        return findChildByClass(AqlFunSQRT.class);
    }

    @Override
    @Nullable
    public AqlFunSin getFunSin() {
        return findChildByClass(AqlFunSin.class);
    }

    @Override
    @Nullable
    public AqlFunStddev getFunStddev() {
        return findChildByClass(AqlFunStddev.class);
    }

    @Override
    @Nullable
    public AqlFunStddevPopulation getFunStddevPopulation() {
        return findChildByClass(AqlFunStddevPopulation.class);
    }

    @Override
    @Nullable
    public AqlFunSum getFunSum() {
        return findChildByClass(AqlFunSum.class);
    }

    @Override
    @Nullable
    public AqlFunTan getFunTan() {
        return findChildByClass(AqlFunTan.class);
    }

    @Override
    @Nullable
    public AqlFunTan2 getFunTan2() {
        return findChildByClass(AqlFunTan2.class);
    }

    @Override
    @Nullable
    public AqlFunVariance getFunVariance() {
        return findChildByClass(AqlFunVariance.class);
    }

    @Override
    @Nullable
    public AqlFunVariancePopulation getFunVariancePopulation() {
        return findChildByClass(AqlFunVariancePopulation.class);
    }

    @Override
    @Nullable
    public AqlFunVarianceSample getFunVarianceSample() {
        return findChildByClass(AqlFunVarianceSample.class);
    }

    public String getName() {
        return AqlPsiUtil.getName(this);
    }

    public AqlNamedElement setName(String newName) {
        return AqlPsiUtil.setName(this, newName);
    }

}
