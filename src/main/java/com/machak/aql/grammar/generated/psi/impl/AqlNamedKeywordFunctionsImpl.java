// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.machak.aql.grammar.generated.psi.AqlTypes.*;
import com.machak.aql.grammar.psi.impl.AqlFunctionMixin;
import com.machak.aql.grammar.generated.psi.*;
import com.machak.aql.grammar.generated.AqlPsiUtil;
import com.machak.aql.grammar.psi.AqlPsiNamedIdentifier;

public class AqlNamedKeywordFunctionsImpl extends AqlFunctionMixin implements AqlNamedKeywordFunctions {

  public AqlNamedKeywordFunctionsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitNamedKeywordFunctions(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AqlKeywordFunctions getKeywordFunctions() {
    return findNotNullChildByClass(AqlKeywordFunctions.class);
  }

  public String getName() {
    return AqlPsiUtil.getName(this);
  }

  public AqlPsiNamedIdentifier setName(String newName) {
    return AqlPsiUtil.setName(this, newName);
  }

}
