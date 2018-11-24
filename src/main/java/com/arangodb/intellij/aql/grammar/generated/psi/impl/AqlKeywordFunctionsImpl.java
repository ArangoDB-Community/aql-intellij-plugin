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
  public PsiElement getFAcos() {
    return findChildByType(F_ACOS);
  }

  @Override
  @Nullable
  public PsiElement getFAnalyzer() {
    return findChildByType(F_ANALYZER);
  }

  @Override
  @Nullable
  public PsiElement getFAppend() {
    return findChildByType(F_APPEND);
  }

  @Override
  @Nullable
  public PsiElement getFApply() {
    return findChildByType(F_APPLY);
  }

  @Override
  @Nullable
  public PsiElement getFAsin() {
    return findChildByType(F_ASIN);
  }

  @Override
  @Nullable
  public PsiElement getFAssert() {
    return findChildByType(F_ASSERT);
  }

  @Override
  @Nullable
  public PsiElement getFAtan() {
    return findChildByType(F_ATAN);
  }

  @Override
  @Nullable
  public PsiElement getFAtan2() {
    return findChildByType(F_ATAN2);
  }

  @Override
  @Nullable
  public PsiElement getFAttributes() {
    return findChildByType(F_ATTRIBUTES);
  }

  @Override
  @Nullable
  public PsiElement getFAverage() {
    return findChildByType(F_AVERAGE);
  }

  @Override
  @Nullable
  public PsiElement getFAvg() {
    return findChildByType(F_AVG);
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
  public PsiElement getFCall() {
    return findChildByType(F_CALL);
  }

  @Override
  @Nullable
  public PsiElement getFCeil() {
    return findChildByType(F_CEIL);
  }

  @Override
  @Nullable
  public PsiElement getFCharLength() {
    return findChildByType(F_CHAR_LENGTH);
  }

  @Override
  @Nullable
  public PsiElement getFCollections() {
    return findChildByType(F_COLLECTIONS);
  }

  @Override
  @Nullable
  public PsiElement getFCollectionCount() {
    return findChildByType(F_COLLECTION_COUNT);
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
  public PsiElement getFContainsArray() {
    return findChildByType(F_CONTAINS_ARRAY);
  }

  @Override
  @Nullable
  public PsiElement getFCos() {
    return findChildByType(F_COS);
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
  public PsiElement getFCurrentDatabase() {
    return findChildByType(F_CURRENT_DATABASE);
  }

  @Override
  @Nullable
  public PsiElement getFCurrentUser() {
    return findChildByType(F_CURRENT_USER);
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
  public PsiElement getFDegrees() {
    return findChildByType(F_DEGREES);
  }

  @Override
  @Nullable
  public PsiElement getFDistance() {
    return findChildByType(F_DISTANCE);
  }

  @Override
  @Nullable
  public PsiElement getFDocument() {
    return findChildByType(F_DOCUMENT);
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
  public PsiElement getFExp() {
    return findChildByType(F_EXP);
  }

  @Override
  @Nullable
  public PsiElement getFExp2() {
    return findChildByType(F_EXP2);
  }

  @Override
  @Nullable
  public PsiElement getFFail() {
    return findChildByType(F_FAIL);
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
  public PsiElement getFFirst() {
    return findChildByType(F_FIRST);
  }

  @Override
  @Nullable
  public PsiElement getFFirstDocument() {
    return findChildByType(F_FIRST_DOCUMENT);
  }

  @Override
  @Nullable
  public PsiElement getFFirstList() {
    return findChildByType(F_FIRST_LIST);
  }

  @Override
  @Nullable
  public PsiElement getFFlatten() {
    return findChildByType(F_FLATTEN);
  }

  @Override
  @Nullable
  public PsiElement getFFloor() {
    return findChildByType(F_FLOOR);
  }

  @Override
  @Nullable
  public PsiElement getFFulltext() {
    return findChildByType(F_FULLTEXT);
  }

  @Override
  @Nullable
  public PsiElement getFGeoContains() {
    return findChildByType(F_GEO_CONTAINS);
  }

  @Override
  @Nullable
  public PsiElement getFGeoDistance() {
    return findChildByType(F_GEO_DISTANCE);
  }

  @Override
  @Nullable
  public PsiElement getFGeoEquals() {
    return findChildByType(F_GEO_EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getFGeoIntersects() {
    return findChildByType(F_GEO_INTERSECTS);
  }

  @Override
  @Nullable
  public PsiElement getFGeoLinestring() {
    return findChildByType(F_GEO_LINESTRING);
  }

  @Override
  @Nullable
  public PsiElement getFGeoMultilinestring() {
    return findChildByType(F_GEO_MULTILINESTRING);
  }

  @Override
  @Nullable
  public PsiElement getFGeoMultipoint() {
    return findChildByType(F_GEO_MULTIPOINT);
  }

  @Override
  @Nullable
  public PsiElement getFGeoPoint() {
    return findChildByType(F_GEO_POINT);
  }

  @Override
  @Nullable
  public PsiElement getFGeoPolygon() {
    return findChildByType(F_GEO_POLYGON);
  }

  @Override
  @Nullable
  public PsiElement getFHas() {
    return findChildByType(F_HAS);
  }

  @Override
  @Nullable
  public PsiElement getFHash() {
    return findChildByType(F_HASH);
  }

  @Override
  @Nullable
  public PsiElement getFIntersection() {
    return findChildByType(F_INTERSECTION);
  }

  @Override
  @Nullable
  public PsiElement getFIsArray() {
    return findChildByType(F_IS_ARRAY);
  }

  @Override
  @Nullable
  public PsiElement getFIsBool() {
    return findChildByType(F_IS_BOOL);
  }

  @Override
  @Nullable
  public PsiElement getFIsDatestring() {
    return findChildByType(F_IS_DATESTRING);
  }

  @Override
  @Nullable
  public PsiElement getFIsDocument() {
    return findChildByType(F_IS_DOCUMENT);
  }

  @Override
  @Nullable
  public PsiElement getFIsInPolygon() {
    return findChildByType(F_IS_IN_POLYGON);
  }

  @Override
  @Nullable
  public PsiElement getFIsKey() {
    return findChildByType(F_IS_KEY);
  }

  @Override
  @Nullable
  public PsiElement getFIsList() {
    return findChildByType(F_IS_LIST);
  }

  @Override
  @Nullable
  public PsiElement getFIsNull() {
    return findChildByType(F_IS_NULL);
  }

  @Override
  @Nullable
  public PsiElement getFIsNumber() {
    return findChildByType(F_IS_NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getFIsObject() {
    return findChildByType(F_IS_OBJECT);
  }

  @Override
  @Nullable
  public PsiElement getFIsSameCollection() {
    return findChildByType(F_IS_SAME_COLLECTION);
  }

  @Override
  @Nullable
  public PsiElement getFIsString() {
    return findChildByType(F_IS_STRING);
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
  public PsiElement getFKeep() {
    return findChildByType(F_KEEP);
  }

  @Override
  @Nullable
  public PsiElement getFKeys() {
    return findChildByType(F_KEYS);
  }

  @Override
  @Nullable
  public PsiElement getFLast() {
    return findChildByType(F_LAST);
  }

  @Override
  @Nullable
  public PsiElement getFLeft() {
    return findChildByType(F_LEFT);
  }

  @Override
  @Nullable
  public PsiElement getFLength() {
    return findChildByType(F_LENGTH);
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
  public PsiElement getFLog() {
    return findChildByType(F_LOG);
  }

  @Override
  @Nullable
  public PsiElement getFLog10() {
    return findChildByType(F_LOG10);
  }

  @Override
  @Nullable
  public PsiElement getFLog2() {
    return findChildByType(F_LOG2);
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
  public PsiElement getFMatches() {
    return findChildByType(F_MATCHES);
  }

  @Override
  @Nullable
  public PsiElement getFMax() {
    return findChildByType(F_MAX);
  }

  @Override
  @Nullable
  public PsiElement getFMd5() {
    return findChildByType(F_MD5);
  }

  @Override
  @Nullable
  public PsiElement getFMedian() {
    return findChildByType(F_MEDIAN);
  }

  @Override
  @Nullable
  public PsiElement getFMerge() {
    return findChildByType(F_MERGE);
  }

  @Override
  @Nullable
  public PsiElement getFMergeRecursive() {
    return findChildByType(F_MERGE_RECURSIVE);
  }

  @Override
  @Nullable
  public PsiElement getFMin() {
    return findChildByType(F_MIN);
  }

  @Override
  @Nullable
  public PsiElement getFMinus() {
    return findChildByType(F_MINUS);
  }

  @Override
  @Nullable
  public PsiElement getFMinMatch() {
    return findChildByType(F_MIN_MATCH);
  }

  @Override
  @Nullable
  public PsiElement getFNear() {
    return findChildByType(F_NEAR);
  }

  @Override
  @Nullable
  public PsiElement getFNoopt() {
    return findChildByType(F_NOOPT);
  }

  @Override
  @Nullable
  public PsiElement getFNotNull() {
    return findChildByType(F_NOT_NULL);
  }

  @Override
  @Nullable
  public PsiElement getFNth() {
    return findChildByType(F_NTH);
  }

  @Override
  @Nullable
  public PsiElement getFOutersection() {
    return findChildByType(F_OUTERSECTION);
  }

  @Override
  @Nullable
  public PsiElement getFParseIdentifier() {
    return findChildByType(F_PARSE_IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getFPassthru() {
    return findChildByType(F_PASSTHRU);
  }

  @Override
  @Nullable
  public PsiElement getFPercentile() {
    return findChildByType(F_PERCENTILE);
  }

  @Override
  @Nullable
  public PsiElement getFPhrase() {
    return findChildByType(F_PHRASE);
  }

  @Override
  @Nullable
  public PsiElement getFPi() {
    return findChildByType(F_PI);
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
  public PsiElement getFPow() {
    return findChildByType(F_POW);
  }

  @Override
  @Nullable
  public PsiElement getFPregelResult() {
    return findChildByType(F_PREGEL_RESULT);
  }

  @Override
  @Nullable
  public PsiElement getFPush() {
    return findChildByType(F_PUSH);
  }

  @Override
  @Nullable
  public PsiElement getFRadians() {
    return findChildByType(F_RADIANS);
  }

  @Override
  @Nullable
  public PsiElement getFRand() {
    return findChildByType(F_RAND);
  }

  @Override
  @Nullable
  public PsiElement getFRandomToken() {
    return findChildByType(F_RANDOM_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getFRange() {
    return findChildByType(F_RANGE);
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
  public PsiElement getFRight() {
    return findChildByType(F_RIGHT);
  }

  @Override
  @Nullable
  public PsiElement getFRound() {
    return findChildByType(F_ROUND);
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
  public PsiElement getFShift() {
    return findChildByType(F_SHIFT);
  }

  @Override
  @Nullable
  public PsiElement getFSin() {
    return findChildByType(F_SIN);
  }

  @Override
  @Nullable
  public PsiElement getFSleep() {
    return findChildByType(F_SLEEP);
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
  public PsiElement getFSqrt() {
    return findChildByType(F_SQRT);
  }

  @Override
  @Nullable
  public PsiElement getFStartsWith() {
    return findChildByType(F_STARTS_WITH);
  }

  @Override
  @Nullable
  public PsiElement getFStddev() {
    return findChildByType(F_STDDEV);
  }

  @Override
  @Nullable
  public PsiElement getFStddevPopulation() {
    return findChildByType(F_STDDEV_POPULATION);
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
  public PsiElement getFSum() {
    return findChildByType(F_SUM);
  }

  @Override
  @Nullable
  public PsiElement getFTan() {
    return findChildByType(F_TAN);
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
  public PsiElement getFToArray() {
    return findChildByType(F_TO_ARRAY);
  }

  @Override
  @Nullable
  public PsiElement getFToBase64() {
    return findChildByType(F_TO_BASE64);
  }

  @Override
  @Nullable
  public PsiElement getFToBool() {
    return findChildByType(F_TO_BOOL);
  }

  @Override
  @Nullable
  public PsiElement getFToHex() {
    return findChildByType(F_TO_HEX);
  }

  @Override
  @Nullable
  public PsiElement getFToList() {
    return findChildByType(F_TO_LIST);
  }

  @Override
  @Nullable
  public PsiElement getFToNumber() {
    return findChildByType(F_TO_NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getFToString() {
    return findChildByType(F_TO_STRING);
  }

  @Override
  @Nullable
  public PsiElement getFTranslate() {
    return findChildByType(F_TRANSLATE);
  }

  @Override
  @Nullable
  public PsiElement getFTrim() {
    return findChildByType(F_TRIM);
  }

  @Override
  @Nullable
  public PsiElement getFTypename() {
    return findChildByType(F_TYPENAME);
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
  public PsiElement getFUnset() {
    return findChildByType(F_UNSET);
  }

  @Override
  @Nullable
  public PsiElement getFUnsetRecursive() {
    return findChildByType(F_UNSET_RECURSIVE);
  }

  @Override
  @Nullable
  public PsiElement getFUnshift() {
    return findChildByType(F_UNSHIFT);
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

  @Override
  @Nullable
  public PsiElement getFV8() {
    return findChildByType(F_V8);
  }

  @Override
  @Nullable
  public PsiElement getFValues() {
    return findChildByType(F_VALUES);
  }

  @Override
  @Nullable
  public PsiElement getFVariance() {
    return findChildByType(F_VARIANCE);
  }

  @Override
  @Nullable
  public PsiElement getFVariancePopulation() {
    return findChildByType(F_VARIANCE_POPULATION);
  }

  @Override
  @Nullable
  public PsiElement getFVarianceSample() {
    return findChildByType(F_VARIANCE_SAMPLE);
  }

  @Override
  @Nullable
  public PsiElement getFVersion() {
    return findChildByType(F_VERSION);
  }

  @Override
  @Nullable
  public PsiElement getFWarn() {
    return findChildByType(F_WARN);
  }

  @Override
  @Nullable
  public PsiElement getFWithin() {
    return findChildByType(F_WITHIN);
  }

  @Override
  @Nullable
  public PsiElement getFWithinRectangle() {
    return findChildByType(F_WITHIN_RECTANGLE);
  }

  @Override
  @Nullable
  public PsiElement getFZip() {
    return findChildByType(F_ZIP);
  }

}
