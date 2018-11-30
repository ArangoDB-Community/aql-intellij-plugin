// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlKeywordMixin;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlKeywordStatements;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlKeywordStatementsImpl extends AqlKeywordMixin implements AqlKeywordStatements {

  public AqlKeywordStatementsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitKeywordStatements(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getTAggregate() {
    return findChildByType(T_AGGREGATE);
  }

  @Override
  @Nullable
  public PsiElement getTAll() {
    return findChildByType(T_ALL);
  }

  @Override
  @Nullable
  public PsiElement getTAny() {
    return findChildByType(T_ANY);
  }

  @Override
  @Nullable
  public PsiElement getTAsc() {
    return findChildByType(T_ASC);
  }

  @Override
  @Nullable
  public PsiElement getTCollect() {
    return findChildByType(T_COLLECT);
  }

  @Override
  @Nullable
  public PsiElement getTDesc() {
    return findChildByType(T_DESC);
  }

  @Override
  @Nullable
  public PsiElement getTDistinct() {
    return findChildByType(T_DISTINCT);
  }

  @Override
  @Nullable
  public PsiElement getTFilter() {
    return findChildByType(T_FILTER);
  }

  @Override
  @Nullable
  public PsiElement getTFor() {
    return findChildByType(T_FOR);
  }

  @Override
  @Nullable
  public PsiElement getTGraph() {
    return findChildByType(T_GRAPH);
  }

  @Override
  @Nullable
  public PsiElement getTIn() {
    return findChildByType(T_IN);
  }

  @Override
  @Nullable
  public PsiElement getTInbound() {
    return findChildByType(T_INBOUND);
  }

  @Override
  @Nullable
  public PsiElement getTInsert() {
    return findChildByType(T_INSERT);
  }

  @Override
  @Nullable
  public PsiElement getTInto() {
    return findChildByType(T_INTO);
  }

  @Override
  @Nullable
  public PsiElement getTLet() {
    return findChildByType(T_LET);
  }

  @Override
  @Nullable
  public PsiElement getTLimit() {
    return findChildByType(T_LIMIT);
  }

  @Override
  @Nullable
  public PsiElement getTOutbound() {
    return findChildByType(T_OUTBOUND);
  }

  @Override
  @Nullable
  public PsiElement getTRemove() {
    return findChildByType(T_REMOVE);
  }

  @Override
  @Nullable
  public PsiElement getTReplace() {
    return findChildByType(T_REPLACE);
  }

  @Override
  @Nullable
  public PsiElement getTReturn() {
    return findChildByType(T_RETURN);
  }

  @Override
  @Nullable
  public PsiElement getTSearch() {
    return findChildByType(T_SEARCH);
  }

  @Override
  @Nullable
  public PsiElement getTShortestPath() {
    return findChildByType(T_SHORTEST_PATH);
  }

  @Override
  @Nullable
  public PsiElement getTSort() {
    return findChildByType(T_SORT);
  }

  @Override
  @Nullable
  public PsiElement getTUpdate() {
    return findChildByType(T_UPDATE);
  }

  @Override
  @Nullable
  public PsiElement getTUpsert() {
    return findChildByType(T_UPSERT);
  }

  @Override
  @Nullable
  public PsiElement getTWith() {
    return findChildByType(T_WITH);
  }

  public String getName() {
    return AqlPsiUtil.getName(this);
  }

  public AqlNamedElement setName(String newName) {
    return AqlPsiUtil.setName(this, newName);
  }

}
