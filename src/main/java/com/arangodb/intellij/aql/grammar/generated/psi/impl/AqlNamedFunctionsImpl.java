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
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
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
  public AqlFunAnalyzer getFunAnalyzer() {
    return findChildByClass(AqlFunAnalyzer.class);
  }

  @Override
  @Nullable
  public AqlFunAppend getFunAppend() {
    return findChildByClass(AqlFunAppend.class);
  }

  @Override
  @Nullable
  public AqlFunApply getFunApply() {
    return findChildByClass(AqlFunApply.class);
  }

  @Override
  @Nullable
  public AqlFunAsin getFunAsin() {
    return findChildByClass(AqlFunAsin.class);
  }

  @Override
  @Nullable
  public AqlFunAssert getFunAssert() {
    return findChildByClass(AqlFunAssert.class);
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
  public AqlFunAttributes getFunAttributes() {
    return findChildByClass(AqlFunAttributes.class);
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
  public AqlFunBm25 getFunBm25() {
    return findChildByClass(AqlFunBm25.class);
  }

  @Override
  @Nullable
  public AqlFunBoost getFunBoost() {
    return findChildByClass(AqlFunBoost.class);
  }

  @Override
  @Nullable
  public AqlFunCall getFunCall() {
    return findChildByClass(AqlFunCall.class);
  }

  @Override
  @Nullable
  public AqlFunCeil getFunCeil() {
    return findChildByClass(AqlFunCeil.class);
  }

  @Override
  @Nullable
  public AqlFunCharLength getFunCharLength() {
    return findChildByClass(AqlFunCharLength.class);
  }

  @Override
  @Nullable
  public AqlFunCollectionCount getFunCollectionCount() {
    return findChildByClass(AqlFunCollectionCount.class);
  }

  @Override
  @Nullable
  public AqlFunCollections getFunCollections() {
    return findChildByClass(AqlFunCollections.class);
  }

  @Override
  @Nullable
  public AqlFunConcat getFunConcat() {
    return findChildByClass(AqlFunConcat.class);
  }

  @Override
  @Nullable
  public AqlFunConcatSeparator getFunConcatSeparator() {
    return findChildByClass(AqlFunConcatSeparator.class);
  }

  @Override
  @Nullable
  public AqlFunContains getFunContains() {
    return findChildByClass(AqlFunContains.class);
  }

  @Override
  @Nullable
  public AqlFunContainsArray getFunContainsArray() {
    return findChildByClass(AqlFunContainsArray.class);
  }

  @Override
  @Nullable
  public AqlFunCos getFunCos() {
    return findChildByClass(AqlFunCos.class);
  }

  @Override
  @Nullable
  public AqlFunCount getFunCount() {
    return findChildByClass(AqlFunCount.class);
  }

  @Override
  @Nullable
  public AqlFunCountDistinct getFunCountDistinct() {
    return findChildByClass(AqlFunCountDistinct.class);
  }

  @Override
  @Nullable
  public AqlFunCountUnique getFunCountUnique() {
    return findChildByClass(AqlFunCountUnique.class);
  }

  @Override
  @Nullable
  public AqlFunCurrentDatabase getFunCurrentDatabase() {
    return findChildByClass(AqlFunCurrentDatabase.class);
  }

  @Override
  @Nullable
  public AqlFunCurrentUser getFunCurrentUser() {
    return findChildByClass(AqlFunCurrentUser.class);
  }

  @Override
  @Nullable
  public AqlFunDateAdd getFunDateAdd() {
    return findChildByClass(AqlFunDateAdd.class);
  }

  @Override
  @Nullable
  public AqlFunDateCompare getFunDateCompare() {
    return findChildByClass(AqlFunDateCompare.class);
  }

  @Override
  @Nullable
  public AqlFunDateDay getFunDateDay() {
    return findChildByClass(AqlFunDateDay.class);
  }

  @Override
  @Nullable
  public AqlFunDateDayOfYear getFunDateDayOfYear() {
    return findChildByClass(AqlFunDateDayOfYear.class);
  }

  @Override
  @Nullable
  public AqlFunDateDaysInMonth getFunDateDaysInMonth() {
    return findChildByClass(AqlFunDateDaysInMonth.class);
  }

  @Override
  @Nullable
  public AqlFunDateDiff getFunDateDiff() {
    return findChildByClass(AqlFunDateDiff.class);
  }

  @Override
  @Nullable
  public AqlFunDateFormat getFunDateFormat() {
    return findChildByClass(AqlFunDateFormat.class);
  }

  @Override
  @Nullable
  public AqlFunDateHour getFunDateHour() {
    return findChildByClass(AqlFunDateHour.class);
  }

  @Override
  @Nullable
  public AqlFunDateISO8601 getFunDateISO8601() {
    return findChildByClass(AqlFunDateISO8601.class);
  }

  @Override
  @Nullable
  public AqlFunDateIsoWeek getFunDateIsoWeek() {
    return findChildByClass(AqlFunDateIsoWeek.class);
  }

  @Override
  @Nullable
  public AqlFunDateLeapYear getFunDateLeapYear() {
    return findChildByClass(AqlFunDateLeapYear.class);
  }

  @Override
  @Nullable
  public AqlFunDateMillisecond getFunDateMillisecond() {
    return findChildByClass(AqlFunDateMillisecond.class);
  }

  @Override
  @Nullable
  public AqlFunDateMinute getFunDateMinute() {
    return findChildByClass(AqlFunDateMinute.class);
  }

  @Override
  @Nullable
  public AqlFunDateMonth getFunDateMonth() {
    return findChildByClass(AqlFunDateMonth.class);
  }

  @Override
  @Nullable
  public AqlFunDateNow getFunDateNow() {
    return findChildByClass(AqlFunDateNow.class);
  }

  @Override
  @Nullable
  public AqlFunDateOfWeek getFunDateOfWeek() {
    return findChildByClass(AqlFunDateOfWeek.class);
  }

  @Override
  @Nullable
  public AqlFunDateQuarter getFunDateQuarter() {
    return findChildByClass(AqlFunDateQuarter.class);
  }

  @Override
  @Nullable
  public AqlFunDateSecond getFunDateSecond() {
    return findChildByClass(AqlFunDateSecond.class);
  }

  @Override
  @Nullable
  public AqlFunDateSubtract getFunDateSubtract() {
    return findChildByClass(AqlFunDateSubtract.class);
  }

  @Override
  @Nullable
  public AqlFunDateTimeStamp getFunDateTimeStamp() {
    return findChildByClass(AqlFunDateTimeStamp.class);
  }

  @Override
  @Nullable
  public AqlFunDateTrunc getFunDateTrunc() {
    return findChildByClass(AqlFunDateTrunc.class);
  }

  @Override
  @Nullable
  public AqlFunDateYear getFunDateYear() {
    return findChildByClass(AqlFunDateYear.class);
  }

  @Override
  @Nullable
  public AqlFunDegrees getFunDegrees() {
    return findChildByClass(AqlFunDegrees.class);
  }

  @Override
  @Nullable
  public AqlFunDistance getFunDistance() {
    return findChildByClass(AqlFunDistance.class);
  }

  @Override
  @Nullable
  public AqlFunDocument getFunDocument() {
    return findChildByClass(AqlFunDocument.class);
  }

  @Override
  @Nullable
  public AqlFunEncodeUriComponent getFunEncodeUriComponent() {
    return findChildByClass(AqlFunEncodeUriComponent.class);
  }

  @Override
  @Nullable
  public AqlFunExists getFunExists() {
    return findChildByClass(AqlFunExists.class);
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
  public AqlFunFail getFunFail() {
    return findChildByClass(AqlFunFail.class);
  }

  @Override
  @Nullable
  public AqlFunFindFirst getFunFindFirst() {
    return findChildByClass(AqlFunFindFirst.class);
  }

  @Override
  @Nullable
  public AqlFunFindLast getFunFindLast() {
    return findChildByClass(AqlFunFindLast.class);
  }

  @Override
  @Nullable
  public AqlFunFirst getFunFirst() {
    return findChildByClass(AqlFunFirst.class);
  }

  @Override
  @Nullable
  public AqlFunFirstDocument getFunFirstDocument() {
    return findChildByClass(AqlFunFirstDocument.class);
  }

  @Override
  @Nullable
  public AqlFunFirstList getFunFirstList() {
    return findChildByClass(AqlFunFirstList.class);
  }

  @Override
  @Nullable
  public AqlFunFlatten getFunFlatten() {
    return findChildByClass(AqlFunFlatten.class);
  }

  @Override
  @Nullable
  public AqlFunFloor getFunFloor() {
    return findChildByClass(AqlFunFloor.class);
  }

  @Override
  @Nullable
  public AqlFunFullText getFunFullText() {
    return findChildByClass(AqlFunFullText.class);
  }

  @Override
  @Nullable
  public AqlFunGeoContains getFunGeoContains() {
    return findChildByClass(AqlFunGeoContains.class);
  }

  @Override
  @Nullable
  public AqlFunGeoDistance getFunGeoDistance() {
    return findChildByClass(AqlFunGeoDistance.class);
  }

  @Override
  @Nullable
  public AqlFunGeoEquals getFunGeoEquals() {
    return findChildByClass(AqlFunGeoEquals.class);
  }

  @Override
  @Nullable
  public AqlFunGeoIntersects getFunGeoIntersects() {
    return findChildByClass(AqlFunGeoIntersects.class);
  }

  @Override
  @Nullable
  public AqlFunGeoLineString getFunGeoLineString() {
    return findChildByClass(AqlFunGeoLineString.class);
  }

  @Override
  @Nullable
  public AqlFunGeoMultiLineString getFunGeoMultiLineString() {
    return findChildByClass(AqlFunGeoMultiLineString.class);
  }

  @Override
  @Nullable
  public AqlFunGeoMultiPoint getFunGeoMultiPoint() {
    return findChildByClass(AqlFunGeoMultiPoint.class);
  }

  @Override
  @Nullable
  public AqlFunGeoPoint getFunGeoPoint() {
    return findChildByClass(AqlFunGeoPoint.class);
  }

  @Override
  @Nullable
  public AqlFunGeoPolygon getFunGeoPolygon() {
    return findChildByClass(AqlFunGeoPolygon.class);
  }

  @Override
  @Nullable
  public AqlFunHas getFunHas() {
    return findChildByClass(AqlFunHas.class);
  }

  @Override
  @Nullable
  public AqlFunHash getFunHash() {
    return findChildByClass(AqlFunHash.class);
  }

  @Override
  @Nullable
  public AqlFunInterSection getFunInterSection() {
    return findChildByClass(AqlFunInterSection.class);
  }

  @Override
  @Nullable
  public AqlFunIsArray getFunIsArray() {
    return findChildByClass(AqlFunIsArray.class);
  }

  @Override
  @Nullable
  public AqlFunIsBool getFunIsBool() {
    return findChildByClass(AqlFunIsBool.class);
  }

  @Override
  @Nullable
  public AqlFunIsDateString getFunIsDateString() {
    return findChildByClass(AqlFunIsDateString.class);
  }

  @Override
  @Nullable
  public AqlFunIsDocument getFunIsDocument() {
    return findChildByClass(AqlFunIsDocument.class);
  }

  @Override
  @Nullable
  public AqlFunIsKey getFunIsKey() {
    return findChildByClass(AqlFunIsKey.class);
  }

  @Override
  @Nullable
  public AqlFunIsList getFunIsList() {
    return findChildByClass(AqlFunIsList.class);
  }

  @Override
  @Nullable
  public AqlFunIsNull getFunIsNull() {
    return findChildByClass(AqlFunIsNull.class);
  }

  @Override
  @Nullable
  public AqlFunIsNumber getFunIsNumber() {
    return findChildByClass(AqlFunIsNumber.class);
  }

  @Override
  @Nullable
  public AqlFunIsObject getFunIsObject() {
    return findChildByClass(AqlFunIsObject.class);
  }

  @Override
  @Nullable
  public AqlFunIsSameCollection getFunIsSameCollection() {
    return findChildByClass(AqlFunIsSameCollection.class);
  }

  @Override
  @Nullable
  public AqlFunIsString getFunIsString() {
    return findChildByClass(AqlFunIsString.class);
  }

  @Override
  @Nullable
  public AqlFunJsonParse getFunJsonParse() {
    return findChildByClass(AqlFunJsonParse.class);
  }

  @Override
  @Nullable
  public AqlFunJsonStringify getFunJsonStringify() {
    return findChildByClass(AqlFunJsonStringify.class);
  }

  @Override
  @Nullable
  public AqlFunKeep getFunKeep() {
    return findChildByClass(AqlFunKeep.class);
  }

  @Override
  @Nullable
  public AqlFunKeys getFunKeys() {
    return findChildByClass(AqlFunKeys.class);
  }

  @Override
  @Nullable
  public AqlFunLast getFunLast() {
    return findChildByClass(AqlFunLast.class);
  }

  @Override
  @Nullable
  public AqlFunLeft getFunLeft() {
    return findChildByClass(AqlFunLeft.class);
  }

  @Override
  @Nullable
  public AqlFunLength getFunLength() {
    return findChildByClass(AqlFunLength.class);
  }

  @Override
  @Nullable
  public AqlFunLevenshteinDistance getFunLevenshteinDistance() {
    return findChildByClass(AqlFunLevenshteinDistance.class);
  }

  @Override
  @Nullable
  public AqlFunLike getFunLike() {
    return findChildByClass(AqlFunLike.class);
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
  public AqlFunLower getFunLower() {
    return findChildByClass(AqlFunLower.class);
  }

  @Override
  @Nullable
  public AqlFunLtrim getFunLtrim() {
    return findChildByClass(AqlFunLtrim.class);
  }

  @Override
  @Nullable
  public AqlFunMatches getFunMatches() {
    return findChildByClass(AqlFunMatches.class);
  }

  @Override
  @Nullable
  public AqlFunMax getFunMax() {
    return findChildByClass(AqlFunMax.class);
  }

  @Override
  @Nullable
  public AqlFunMd5 getFunMd5() {
    return findChildByClass(AqlFunMd5.class);
  }

  @Override
  @Nullable
  public AqlFunMedian getFunMedian() {
    return findChildByClass(AqlFunMedian.class);
  }

  @Override
  @Nullable
  public AqlFunMerge getFunMerge() {
    return findChildByClass(AqlFunMerge.class);
  }

  @Override
  @Nullable
  public AqlFunMergeRecursive getFunMergeRecursive() {
    return findChildByClass(AqlFunMergeRecursive.class);
  }

  @Override
  @Nullable
  public AqlFunMin getFunMin() {
    return findChildByClass(AqlFunMin.class);
  }

  @Override
  @Nullable
  public AqlFunMinMatch getFunMinMatch() {
    return findChildByClass(AqlFunMinMatch.class);
  }

  @Override
  @Nullable
  public AqlFunMinus getFunMinus() {
    return findChildByClass(AqlFunMinus.class);
  }

  @Override
  @Nullable
  public AqlFunNTH getFunNTH() {
    return findChildByClass(AqlFunNTH.class);
  }

  @Override
  @Nullable
  public AqlFunNoopt getFunNoopt() {
    return findChildByClass(AqlFunNoopt.class);
  }

  @Override
  @Nullable
  public AqlFunNotNull getFunNotNull() {
    return findChildByClass(AqlFunNotNull.class);
  }

  @Override
  @Nullable
  public AqlFunOuterSection getFunOuterSection() {
    return findChildByClass(AqlFunOuterSection.class);
  }

  @Override
  @Nullable
  public AqlFunParseIdentifier getFunParseIdentifier() {
    return findChildByClass(AqlFunParseIdentifier.class);
  }

  @Override
  @Nullable
  public AqlFunPassThru getFunPassThru() {
    return findChildByClass(AqlFunPassThru.class);
  }

  @Override
  @Nullable
  public AqlFunPercentile getFunPercentile() {
    return findChildByClass(AqlFunPercentile.class);
  }

  @Override
  @Nullable
  public AqlFunPhrase getFunPhrase() {
    return findChildByClass(AqlFunPhrase.class);
  }

  @Override
  @Nullable
  public AqlFunPi getFunPi() {
    return findChildByClass(AqlFunPi.class);
  }

  @Override
  @Nullable
  public AqlFunPop getFunPop() {
    return findChildByClass(AqlFunPop.class);
  }

  @Override
  @Nullable
  public AqlFunPosition getFunPosition() {
    return findChildByClass(AqlFunPosition.class);
  }

  @Override
  @Nullable
  public AqlFunPow getFunPow() {
    return findChildByClass(AqlFunPow.class);
  }

  @Override
  @Nullable
  public AqlFunPregelResult getFunPregelResult() {
    return findChildByClass(AqlFunPregelResult.class);
  }

  @Override
  @Nullable
  public AqlFunPush getFunPush() {
    return findChildByClass(AqlFunPush.class);
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
  public AqlFunRandomToken getFunRandomToken() {
    return findChildByClass(AqlFunRandomToken.class);
  }

  @Override
  @Nullable
  public AqlFunRange getFunRange() {
    return findChildByClass(AqlFunRange.class);
  }

  @Override
  @Nullable
  public AqlFunRegexMatches getFunRegexMatches() {
    return findChildByClass(AqlFunRegexMatches.class);
  }

  @Override
  @Nullable
  public AqlFunRegexReplace getFunRegexReplace() {
    return findChildByClass(AqlFunRegexReplace.class);
  }

  @Override
  @Nullable
  public AqlFunRegexSplit getFunRegexSplit() {
    return findChildByClass(AqlFunRegexSplit.class);
  }

  @Override
  @Nullable
  public AqlFunRegexTest getFunRegexTest() {
    return findChildByClass(AqlFunRegexTest.class);
  }

  @Override
  @Nullable
  public AqlFunRemoveNTH getFunRemoveNTH() {
    return findChildByClass(AqlFunRemoveNTH.class);
  }

  @Override
  @Nullable
  public AqlFunRemoveValue getFunRemoveValue() {
    return findChildByClass(AqlFunRemoveValue.class);
  }

  @Override
  @Nullable
  public AqlFunRemoveValues getFunRemoveValues() {
    return findChildByClass(AqlFunRemoveValues.class);
  }

  @Override
  @Nullable
  public AqlFunReverse getFunReverse() {
    return findChildByClass(AqlFunReverse.class);
  }

  @Override
  @Nullable
  public AqlFunRight getFunRight() {
    return findChildByClass(AqlFunRight.class);
  }

  @Override
  @Nullable
  public AqlFunRound getFunRound() {
    return findChildByClass(AqlFunRound.class);
  }

  @Override
  @Nullable
  public AqlFunRtrim getFunRtrim() {
    return findChildByClass(AqlFunRtrim.class);
  }

  @Override
  @Nullable
  public AqlFunSQRT getFunSQRT() {
    return findChildByClass(AqlFunSQRT.class);
  }

  @Override
  @Nullable
  public AqlFunSha1 getFunSha1() {
    return findChildByClass(AqlFunSha1.class);
  }

  @Override
  @Nullable
  public AqlFunSha512 getFunSha512() {
    return findChildByClass(AqlFunSha512.class);
  }

  @Override
  @Nullable
  public AqlFunShift getFunShift() {
    return findChildByClass(AqlFunShift.class);
  }

  @Override
  @Nullable
  public AqlFunSin getFunSin() {
    return findChildByClass(AqlFunSin.class);
  }

  @Override
  @Nullable
  public AqlFunSleep getFunSleep() {
    return findChildByClass(AqlFunSleep.class);
  }

  @Override
  @Nullable
  public AqlFunSlice getFunSlice() {
    return findChildByClass(AqlFunSlice.class);
  }

  @Override
  @Nullable
  public AqlFunSorted getFunSorted() {
    return findChildByClass(AqlFunSorted.class);
  }

  @Override
  @Nullable
  public AqlFunSortedUnique getFunSortedUnique() {
    return findChildByClass(AqlFunSortedUnique.class);
  }

  @Override
  @Nullable
  public AqlFunSoundex getFunSoundex() {
    return findChildByClass(AqlFunSoundex.class);
  }

  @Override
  @Nullable
  public AqlFunSplit getFunSplit() {
    return findChildByClass(AqlFunSplit.class);
  }

  @Override
  @Nullable
  public AqlFunStartsWith getFunStartsWith() {
    return findChildByClass(AqlFunStartsWith.class);
  }

  @Override
  @Nullable
  public AqlFunStdDevSample getFunStdDevSample() {
    return findChildByClass(AqlFunStdDevSample.class);
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
  public AqlFunSubstitute getFunSubstitute() {
    return findChildByClass(AqlFunSubstitute.class);
  }

  @Override
  @Nullable
  public AqlFunSubstring getFunSubstring() {
    return findChildByClass(AqlFunSubstring.class);
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
  public AqlFunTfDiff getFunTfDiff() {
    return findChildByClass(AqlFunTfDiff.class);
  }

  @Override
  @Nullable
  public AqlFunToArray getFunToArray() {
    return findChildByClass(AqlFunToArray.class);
  }

  @Override
  @Nullable
  public AqlFunToBase64 getFunToBase64() {
    return findChildByClass(AqlFunToBase64.class);
  }

  @Override
  @Nullable
  public AqlFunToBool getFunToBool() {
    return findChildByClass(AqlFunToBool.class);
  }

  @Override
  @Nullable
  public AqlFunToHex getFunToHex() {
    return findChildByClass(AqlFunToHex.class);
  }

  @Override
  @Nullable
  public AqlFunToList getFunToList() {
    return findChildByClass(AqlFunToList.class);
  }

  @Override
  @Nullable
  public AqlFunToNumber getFunToNumber() {
    return findChildByClass(AqlFunToNumber.class);
  }

  @Override
  @Nullable
  public AqlFunToString getFunToString() {
    return findChildByClass(AqlFunToString.class);
  }

  @Override
  @Nullable
  public AqlFunTokens getFunTokens() {
    return findChildByClass(AqlFunTokens.class);
  }

  @Override
  @Nullable
  public AqlFunTranslate getFunTranslate() {
    return findChildByClass(AqlFunTranslate.class);
  }

  @Override
  @Nullable
  public AqlFunTrim getFunTrim() {
    return findChildByClass(AqlFunTrim.class);
  }

  @Override
  @Nullable
  public AqlFunTypename getFunTypename() {
    return findChildByClass(AqlFunTypename.class);
  }

  @Override
  @Nullable
  public AqlFunUnShift getFunUnShift() {
    return findChildByClass(AqlFunUnShift.class);
  }

  @Override
  @Nullable
  public AqlFunUnion getFunUnion() {
    return findChildByClass(AqlFunUnion.class);
  }

  @Override
  @Nullable
  public AqlFunUnionDistinct getFunUnionDistinct() {
    return findChildByClass(AqlFunUnionDistinct.class);
  }

  @Override
  @Nullable
  public AqlFunUnique getFunUnique() {
    return findChildByClass(AqlFunUnique.class);
  }

  @Override
  @Nullable
  public AqlFunUnset getFunUnset() {
    return findChildByClass(AqlFunUnset.class);
  }

  @Override
  @Nullable
  public AqlFunUnsetRecursive getFunUnsetRecursive() {
    return findChildByClass(AqlFunUnsetRecursive.class);
  }

  @Override
  @Nullable
  public AqlFunUpper getFunUpper() {
    return findChildByClass(AqlFunUpper.class);
  }

  @Override
  @Nullable
  public AqlFunUuid getFunUuid() {
    return findChildByClass(AqlFunUuid.class);
  }

  @Override
  @Nullable
  public AqlFunV8 getFunV8() {
    return findChildByClass(AqlFunV8.class);
  }

  @Override
  @Nullable
  public AqlFunValues getFunValues() {
    return findChildByClass(AqlFunValues.class);
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

  @Override
  @Nullable
  public AqlFunVersion getFunVersion() {
    return findChildByClass(AqlFunVersion.class);
  }

  @Override
  @Nullable
  public AqlFunWarn getFunWarn() {
    return findChildByClass(AqlFunWarn.class);
  }

  @Override
  @Nullable
  public AqlFunZip getFunZip() {
    return findChildByClass(AqlFunZip.class);
  }

  public String getName() {
    return AqlPsiUtil.getName(this);
  }

  public String getFunctionName() {
    return AqlPsiUtil.getFunctionName(this);
  }

  public AqlNamedElement setName(String newName) {
    return AqlPsiUtil.setName(this, newName);
  }

}
