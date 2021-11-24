// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AqlExpressionType extends PsiElement {

  @Nullable
  AqlAnalyzerType getAnalyzerType();

  @Nullable
  AqlArrayRef getArrayRef();

  @Nullable
  AqlArrayType getArrayType();

  @Nullable
  AqlBooleanType getBooleanType();

  @Nullable
  AqlFunctionExpression getFunctionExpression();

  @Nullable
  AqlNamedFunctions getNamedFunctions();

  @Nullable
  AqlNumberType getNumberType();

  @Nullable
  AqlObjectExpression getObjectExpression();

  @Nullable
  AqlParameterVariable getParameterVariable();

  @Nullable
  AqlPropertyName getPropertyName();

  @Nullable
  AqlReservedWords getReservedWords();

  @Nullable
  AqlStringType getStringType();

  @Nullable
  AqlSystemProperty getSystemProperty();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

  @Nullable
  PsiElement getFAbs();

  @Nullable
  PsiElement getFAcos();

  @Nullable
  PsiElement getFAnalyzer();

  @Nullable
  PsiElement getFAppend();

  @Nullable
  PsiElement getFApply();

  @Nullable
  PsiElement getFAsin();

  @Nullable
  PsiElement getFAssert();

  @Nullable
  PsiElement getFAtan();

  @Nullable
  PsiElement getFAtan2();

  @Nullable
  PsiElement getFAttributes();

  @Nullable
  PsiElement getFAverage();

  @Nullable
  PsiElement getFAvg();

  @Nullable
  PsiElement getFBm25();

  @Nullable
  PsiElement getFBoost();

  @Nullable
  PsiElement getFCall();

  @Nullable
  PsiElement getFCeil();

  @Nullable
  PsiElement getFCharLength();

  @Nullable
  PsiElement getFCollections();

  @Nullable
  PsiElement getFCollectionCount();

  @Nullable
  PsiElement getFConcat();

  @Nullable
  PsiElement getFConcatSeparator();

  @Nullable
  PsiElement getFContains();

  @Nullable
  PsiElement getFContainsArray();

  @Nullable
  PsiElement getFCos();

  @Nullable
  PsiElement getFCount();

  @Nullable
  PsiElement getFCountDistinct();

  @Nullable
  PsiElement getFCountUnique();

  @Nullable
  PsiElement getFCurrentDatabase();

  @Nullable
  PsiElement getFCurrentUser();

  @Nullable
  PsiElement getFDateAdd();

  @Nullable
  PsiElement getFDateCompare();

  @Nullable
  PsiElement getFDateDay();

  @Nullable
  PsiElement getFDateDayofweek();

  @Nullable
  PsiElement getFDateDayofyear();

  @Nullable
  PsiElement getFDateDaysInMonth();

  @Nullable
  PsiElement getFDateDiff();

  @Nullable
  PsiElement getFDateFormat();

  @Nullable
  PsiElement getFDateHour();

  @Nullable
  PsiElement getFDateIso8601();

  @Nullable
  PsiElement getFDateIsoweek();

  @Nullable
  PsiElement getFDateLeapyear();

  @Nullable
  PsiElement getFDateMillisecond();

  @Nullable
  PsiElement getFDateMinute();

  @Nullable
  PsiElement getFDateMonth();

  @Nullable
  PsiElement getFDateNow();

  @Nullable
  PsiElement getFDateQuarter();

  @Nullable
  PsiElement getFDateSecond();

  @Nullable
  PsiElement getFDateSubtract();

  @Nullable
  PsiElement getFDateTimestamp();

  @Nullable
  PsiElement getFDateTrunc();

  @Nullable
  PsiElement getFDateYear();

  @Nullable
  PsiElement getFDegrees();

  @Nullable
  PsiElement getFDistance();

  @Nullable
  PsiElement getFDocument();

  @Nullable
  PsiElement getFEncodeUriComponent();

  @Nullable
  PsiElement getFExists();

  @Nullable
  PsiElement getFExp();

  @Nullable
  PsiElement getFExp2();

  @Nullable
  PsiElement getFFail();

  @Nullable
  PsiElement getFFindFirst();

  @Nullable
  PsiElement getFFindLast();

  @Nullable
  PsiElement getFFirst();

  @Nullable
  PsiElement getFFirstDocument();

  @Nullable
  PsiElement getFFirstList();

  @Nullable
  PsiElement getFFlatten();

  @Nullable
  PsiElement getFFloor();

  @Nullable
  PsiElement getFFulltext();

  @Nullable
  PsiElement getFGeoContains();

  @Nullable
  PsiElement getFGeoDistance();

  @Nullable
  PsiElement getFGeoEquals();

  @Nullable
  PsiElement getFGeoIntersects();

  @Nullable
  PsiElement getFGeoLinestring();

  @Nullable
  PsiElement getFGeoMultilinestring();

  @Nullable
  PsiElement getFGeoMultipoint();

  @Nullable
  PsiElement getFGeoPoint();

  @Nullable
  PsiElement getFGeoPolygon();

  @Nullable
  PsiElement getFHas();

  @Nullable
  PsiElement getFHash();

  @Nullable
  PsiElement getFIntersection();

  @Nullable
  PsiElement getFInRange();

  @Nullable
  PsiElement getFIsArray();

  @Nullable
  PsiElement getFIsBool();

  @Nullable
  PsiElement getFIsDatestring();

  @Nullable
  PsiElement getFIsDocument();

  @Nullable
  PsiElement getFIsKey();

  @Nullable
  PsiElement getFIsList();

  @Nullable
  PsiElement getFIsNull();

  @Nullable
  PsiElement getFIsNumber();

  @Nullable
  PsiElement getFIsObject();

  @Nullable
  PsiElement getFIsSameCollection();

  @Nullable
  PsiElement getFIsString();

  @Nullable
  PsiElement getFJsonParse();

  @Nullable
  PsiElement getFJsonStringify();

  @Nullable
  PsiElement getFKeep();

  @Nullable
  PsiElement getFKeys();

  @Nullable
  PsiElement getFLast();

  @Nullable
  PsiElement getFLeft();

  @Nullable
  PsiElement getFLength();

  @Nullable
  PsiElement getFLevenshteinDistance();

  @Nullable
  PsiElement getFLike();

  @Nullable
  PsiElement getFLog();

  @Nullable
  PsiElement getFLog10();

  @Nullable
  PsiElement getFLog2();

  @Nullable
  PsiElement getFLower();

  @Nullable
  PsiElement getFLtrim();

  @Nullable
  PsiElement getFMatches();

  @Nullable
  PsiElement getFMax();

  @Nullable
  PsiElement getFMd5();

  @Nullable
  PsiElement getFMedian();

  @Nullable
  PsiElement getFMerge();

  @Nullable
  PsiElement getFMergeRecursive();

  @Nullable
  PsiElement getFMin();

  @Nullable
  PsiElement getFMinus();

  @Nullable
  PsiElement getFMinMatch();

  @Nullable
  PsiElement getFNoopt();

  @Nullable
  PsiElement getFNotNull();

  @Nullable
  PsiElement getFNth();

  @Nullable
  PsiElement getFOutersection();

  @Nullable
  PsiElement getFParseIdentifier();

  @Nullable
  PsiElement getFPassthru();

  @Nullable
  PsiElement getFPercentile();

  @Nullable
  PsiElement getFPhrase();

  @Nullable
  PsiElement getFPi();

  @Nullable
  PsiElement getFPop();

  @Nullable
  PsiElement getFPosition();

  @Nullable
  PsiElement getFPow();

  @Nullable
  PsiElement getFPregelResult();

  @Nullable
  PsiElement getFPush();

  @Nullable
  PsiElement getFRadians();

  @Nullable
  PsiElement getFRand();

  @Nullable
  PsiElement getFRandomToken();

  @Nullable
  PsiElement getFRange();

  @Nullable
  PsiElement getFRegexMatches();

  @Nullable
  PsiElement getFRegexReplace();

  @Nullable
  PsiElement getFRegexSplit();

  @Nullable
  PsiElement getFRegexTest();

  @Nullable
  PsiElement getFRemoveNth();

  @Nullable
  PsiElement getFRemoveValue();

  @Nullable
  PsiElement getFRemoveValues();

  @Nullable
  PsiElement getFReverse();

  @Nullable
  PsiElement getFRight();

  @Nullable
  PsiElement getFRound();

  @Nullable
  PsiElement getFRtrim();

  @Nullable
  PsiElement getFSha1();

  @Nullable
  PsiElement getFSha512();

  @Nullable
  PsiElement getFShift();

  @Nullable
  PsiElement getFSin();

  @Nullable
  PsiElement getFSleep();

  @Nullable
  PsiElement getFSlice();

  @Nullable
  PsiElement getFSorted();

  @Nullable
  PsiElement getFSortedUnique();

  @Nullable
  PsiElement getFSoundex();

  @Nullable
  PsiElement getFSplit();

  @Nullable
  PsiElement getFSqrt();

  @Nullable
  PsiElement getFStartsWith();

  @Nullable
  PsiElement getFStddev();

  @Nullable
  PsiElement getFStddevPopulation();

  @Nullable
  PsiElement getFStddevSample();

  @Nullable
  PsiElement getFSubstitute();

  @Nullable
  PsiElement getFSubstring();

  @Nullable
  PsiElement getFSum();

  @Nullable
  PsiElement getFTan();

  @Nullable
  PsiElement getFTfidf();

  @Nullable
  PsiElement getFTokens();

  @Nullable
  PsiElement getFToArray();

  @Nullable
  PsiElement getFToBase64();

  @Nullable
  PsiElement getFToBool();

  @Nullable
  PsiElement getFToHex();

  @Nullable
  PsiElement getFToList();

  @Nullable
  PsiElement getFToNumber();

  @Nullable
  PsiElement getFToString();

  @Nullable
  PsiElement getFTranslate();

  @Nullable
  PsiElement getFTrim();

  @Nullable
  PsiElement getFTypename();

  @Nullable
  PsiElement getFUnion();

  @Nullable
  PsiElement getFUnionDistinct();

  @Nullable
  PsiElement getFUnique();

  @Nullable
  PsiElement getFUnset();

  @Nullable
  PsiElement getFUnsetRecursive();

  @Nullable
  PsiElement getFUnshift();

  @Nullable
  PsiElement getFUpper();

  @Nullable
  PsiElement getFUuid();

  @Nullable
  PsiElement getFV8();

  @Nullable
  PsiElement getFValues();

  @Nullable
  PsiElement getFVariance();

  @Nullable
  PsiElement getFVariancePopulation();

  @Nullable
  PsiElement getFVarianceSample();

  @Nullable
  PsiElement getFVersion();

  @Nullable
  PsiElement getFWarn();

  @Nullable
  PsiElement getFZip();

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

}
