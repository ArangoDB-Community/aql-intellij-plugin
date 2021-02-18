// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.intellij.navigation.ItemPresentation;

public interface AqlKeywordStatements extends PsiElement {

  @Nullable
  PsiElement getTAggregate();

  @Nullable
  PsiElement getTAll();

  @Nullable
  PsiElement getTAny();

  @Nullable
  PsiElement getTAsc();

  @Nullable
  PsiElement getTCollect();

  @Nullable
  PsiElement getTCurrent();

  @Nullable
  PsiElement getTDesc();

  @Nullable
  PsiElement getTDistinct();

  @Nullable
  PsiElement getTFilter();

  @Nullable
  PsiElement getTFor();

  @Nullable
  PsiElement getTGraph();

  @Nullable
  PsiElement getTIn();

  @Nullable
  PsiElement getTInbound();

  @Nullable
  PsiElement getTInsert();

  @Nullable
  PsiElement getTInto();

  @Nullable
  PsiElement getTLet();

  @Nullable
  PsiElement getTLimit();

  @Nullable
  PsiElement getTOutbound();

  @Nullable
  PsiElement getTPrune();

  @Nullable
  PsiElement getTRemove();

  @Nullable
  PsiElement getTReplace();

  @Nullable
  PsiElement getTReturn();

  @Nullable
  PsiElement getTSearch();

  @Nullable
  PsiElement getTShortestPath();

  @Nullable
  PsiElement getTSort();

  @Nullable
  PsiElement getTUpdate();

  @Nullable
  PsiElement getTUpsert();

  @Nullable
  PsiElement getTWith();

  String getName();

  AqlNamedElement setName(String newName);

  ItemPresentation getPresentation();

}
