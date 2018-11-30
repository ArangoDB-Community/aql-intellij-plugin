// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlKeywordFunctions;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlKeywordFunctionsImpl extends ASTWrapperPsiElement implements AqlKeywordFunctions {

  public AqlKeywordFunctionsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitKeywordFunctions(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getFAnalyzer() {
    return findChildByType(F_ANALYZER);
  }

  @Override
  @Nullable
  public PsiElement getFBm25() {
    return findChildByType(F_BM25);
  }

  @Override
  @Nullable
  public PsiElement getFBoost() {
    return findChildByType(F_BOOST);
  }

  @Override
  @Nullable
  public PsiElement getFConcat() {
    return findChildByType(F_CONCAT);
  }

  @Override
  @Nullable
  public PsiElement getFContains() {
    return findChildByType(F_CONTAINS);
  }

  @Override
  @Nullable
  public PsiElement getFCurrentDatabase() {
    return findChildByType(F_CURRENT_DATABASE);
  }

  @Override
  @Nullable
  public PsiElement getFDateAdd() {
    return findChildByType(F_DATE_ADD);
  }

  @Override
  @Nullable
  public PsiElement getFDateCompare() {
    return findChildByType(F_DATE_COMPARE);
  }

  @Override
  @Nullable
  public PsiElement getFDateDay() {
    return findChildByType(F_DATE_DAY);
  }

  @Override
  @Nullable
  public PsiElement getFDateDayofweek() {
    return findChildByType(F_DATE_DAYOFWEEK);
  }

  @Override
  @Nullable
  public PsiElement getFDateDayofyear() {
    return findChildByType(F_DATE_DAYOFYEAR);
  }

  @Override
  @Nullable
  public PsiElement getFDateDaysInMonth() {
    return findChildByType(F_DATE_DAYS_IN_MONTH);
  }

  @Override
  @Nullable
  public PsiElement getFDateDiff() {
    return findChildByType(F_DATE_DIFF);
  }

  @Override
  @Nullable
  public PsiElement getFDateFormat() {
    return findChildByType(F_DATE_FORMAT);
  }

  @Override
  @Nullable
  public PsiElement getFDateHour() {
    return findChildByType(F_DATE_HOUR);
  }

  @Override
  @Nullable
  public PsiElement getFDateIso8601() {
    return findChildByType(F_DATE_ISO8601);
  }

  @Override
  @Nullable
  public PsiElement getFDateIsoweek() {
    return findChildByType(F_DATE_ISOWEEK);
  }

  @Override
  @Nullable
  public PsiElement getFDateLeapyear() {
    return findChildByType(F_DATE_LEAPYEAR);
  }

  @Override
  @Nullable
  public PsiElement getFDateMillisecond() {
    return findChildByType(F_DATE_MILLISECOND);
  }

  @Override
  @Nullable
  public PsiElement getFDateMinute() {
    return findChildByType(F_DATE_MINUTE);
  }

  @Override
  @Nullable
  public PsiElement getFDateMonth() {
    return findChildByType(F_DATE_MONTH);
  }

  @Override
  @Nullable
  public PsiElement getFDateNow() {
    return findChildByType(F_DATE_NOW);
  }

  @Override
  @Nullable
  public PsiElement getFDateQuarter() {
    return findChildByType(F_DATE_QUARTER);
  }

  @Override
  @Nullable
  public PsiElement getFDateSecond() {
    return findChildByType(F_DATE_SECOND);
  }

  @Override
  @Nullable
  public PsiElement getFDateSubtract() {
    return findChildByType(F_DATE_SUBTRACT);
  }

  @Override
  @Nullable
  public PsiElement getFDateTimestamp() {
    return findChildByType(F_DATE_TIMESTAMP);
  }

  @Override
  @Nullable
  public PsiElement getFDateTrunc() {
    return findChildByType(F_DATE_TRUNC);
  }

  @Override
  @Nullable
  public PsiElement getFDateYear() {
    return findChildByType(F_DATE_YEAR);
  }

  @Override
  @Nullable
  public PsiElement getFEncodeUriComponent() {
    return findChildByType(F_ENCODE_URI_COMPONENT);
  }

  @Override
  @Nullable
  public PsiElement getFExists() {
    return findChildByType(F_EXISTS);
  }

  @Override
  @Nullable
  public PsiElement getFFindFirst() {
    return findChildByType(F_FIND_FIRST);
  }

  @Override
  @Nullable
  public PsiElement getFFindLast() {
    return findChildByType(F_FIND_LAST);
  }

  @Override
  @Nullable
  public PsiElement getFJsonParse() {
    return findChildByType(F_JSON_PARSE);
  }

  @Override
  @Nullable
  public PsiElement getFJsonStringify() {
    return findChildByType(F_JSON_STRINGIFY);
  }

  @Override
  @Nullable
  public PsiElement getFKeys() {
    return findChildByType(F_KEYS);
  }

  @Override
  @Nullable
  public PsiElement getFLeft() {
    return findChildByType(F_LEFT);
  }

  @Override
  @Nullable
  public PsiElement getFLevenshteinDistance() {
    return findChildByType(F_LEVENSHTEIN_DISTANCE);
  }

  @Override
  @Nullable
  public PsiElement getFLike() {
    return findChildByType(F_LIKE);
  }

  @Override
  @Nullable
  public PsiElement getFLower() {
    return findChildByType(F_LOWER);
  }

  @Override
  @Nullable
  public PsiElement getFLtrim() {
    return findChildByType(F_LTRIM);
  }

  @Override
  @Nullable
  public PsiElement getFMd5() {
    return findChildByType(F_MD5);
  }

  @Override
  @Nullable
  public PsiElement getFMinMatch() {
    return findChildByType(F_MIN_MATCH);
  }

  @Override
  @Nullable
  public PsiElement getFPhrase() {
    return findChildByType(F_PHRASE);
  }

  @Override
  @Nullable
  public PsiElement getFPregelResult() {
    return findChildByType(F_PREGEL_RESULT);
  }

  @Override
  @Nullable
  public PsiElement getFRandomToken() {
    return findChildByType(F_RANDOM_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getFRegexMatches() {
    return findChildByType(F_REGEX_MATCHES);
  }

  @Override
  @Nullable
  public PsiElement getFRegexReplace() {
    return findChildByType(F_REGEX_REPLACE);
  }

  @Override
  @Nullable
  public PsiElement getFRegexSplit() {
    return findChildByType(F_REGEX_SPLIT);
  }

  @Override
  @Nullable
  public PsiElement getFRegexTest() {
    return findChildByType(F_REGEX_TEST);
  }

  @Override
  @Nullable
  public PsiElement getFRight() {
    return findChildByType(F_RIGHT);
  }

  @Override
  @Nullable
  public PsiElement getFRtrim() {
    return findChildByType(F_RTRIM);
  }

  @Override
  @Nullable
  public PsiElement getFSha1() {
    return findChildByType(F_SHA1);
  }

  @Override
  @Nullable
  public PsiElement getFSha512() {
    return findChildByType(F_SHA512);
  }

  @Override
  @Nullable
  public PsiElement getFSoundex() {
    return findChildByType(F_SOUNDEX);
  }

  @Override
  @Nullable
  public PsiElement getFSplit() {
    return findChildByType(F_SPLIT);
  }

  @Override
  @Nullable
  public PsiElement getFStartsWith() {
    return findChildByType(F_STARTS_WITH);
  }

  @Override
  @Nullable
  public PsiElement getFStddevSample() {
    return findChildByType(F_STDDEV_SAMPLE);
  }

  @Override
  @Nullable
  public PsiElement getFSubstitute() {
    return findChildByType(F_SUBSTITUTE);
  }

  @Override
  @Nullable
  public PsiElement getFSubstring() {
    return findChildByType(F_SUBSTRING);
  }

  @Override
  @Nullable
  public PsiElement getFTfidf() {
    return findChildByType(F_TFIDF);
  }

  @Override
  @Nullable
  public PsiElement getFTokens() {
    return findChildByType(F_TOKENS);
  }

  @Override
  @Nullable
  public PsiElement getFToBase64() {
    return findChildByType(F_TO_BASE64);
  }

  @Override
  @Nullable
  public PsiElement getFToHex() {
    return findChildByType(F_TO_HEX);
  }

  @Override
  @Nullable
  public PsiElement getFTrim() {
    return findChildByType(F_TRIM);
  }

  @Override
  @Nullable
  public PsiElement getFUpper() {
    return findChildByType(F_UPPER);
  }

  @Override
  @Nullable
  public PsiElement getFUuid() {
    return findChildByType(F_UUID);
  }

}
