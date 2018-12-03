// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlNamedFunctionMixin;
import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

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

  @Override
  @Nullable
  public PsiElement getFAbs() {
    return findChildByType(F_ABS);
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
  public PsiElement getFConcatSeparator() {
    return findChildByType(F_CONCAT_SEPARATOR);
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
  public PsiElement getFZip() {
    return findChildByType(F_ZIP);
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

  public ItemPresentation getPresentation() {
    return AqlPsiUtil.getPresentation(this);
  }

}
