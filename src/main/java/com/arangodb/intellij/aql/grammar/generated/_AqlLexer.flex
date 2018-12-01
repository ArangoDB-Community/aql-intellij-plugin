package com.arangodb.intellij.aql.grammar.generated;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

%%

%{
  public _AqlLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _AqlLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

T_SEARCH=([Ss])([Ee])([Aa])([Rr])([Cc])([Hh])
T_SHORTEST_PATH=([Ss])([Hh])([Oo])([Rr])([Tt])([Ee])([Ss])([Tt])([Pp])([Aa])([Tt])([Hh])
T_REPLACE=([Rr])([Ee])([Pp])([Ll])([Aa])([Cc])([Ee])
T_ASC=([Aa])([Ss])([Cc])
T_AGGREGATE=([Aa])([Gg])([Gg])([Rr])([Ee])([Gg])([Aa])([Tt])([Ee])
T_FILTER=([Ff])([Ii])([Ll])([Tt])([Ee])([Rr])
T_DESC=([Dd])([Ee])([Ss])([Cc])
T_IN=([Ii])([Nn])
T_INTO=([Ii])([Nn])([Tt])([Oo])
T_LIMIT=([Ll])([Ii])([Mm])([Ii])([Tt])
T_UPDATE=([Uu])([Pp])([Dd])([Aa])([Tt])([Ee])
T_SORT=([Ss])([Oo])([Rr])([Tt])
T_GRAPH=([Gg])([Rr])([Aa])([Pp])([Hh])
T_FOR=([Ff])([Oo])([Rr])
T_LET=([Ll])([Ee])([Tt])
T_COLLECT=([Cc])([Oo])([Ll])([Ll])([Ee])([Cc])([Tt])
T_WITH=([Ww])([Ii])([Tt])([Hh])
T_DISTINCT=([Dd])([Ii])([Ss])([Tt])([Ii])([Nn])([Cc])([Tt])
T_RETURN=([Rr])([Ee])([Tt])([Uu])([Rr])([Nn])
T_UPSERT=([Uu])([Pp])([Ss])([Ee])([Rr])([Tt])
T_REMOVE=([Rr])([Ee])([Mm])([Oo])([Vv])([Ee])
T_INSERT=([Ii])([Nn])([Ss])([Ee])([Rr])([Tt])
T_OUTBOUND=([Oo])([Uu])([Tt])([Bb])([Oo])([Uu])([Nn])([Dd])
T_INBOUND=([Ii])([Nn])([Bb])([Ou])([Uu])([Nn])([Dd])
T_ANY=([Aa])([Nn])([Yy])
T_ALL=([Aa])([Ll])([Ll])
T_NULL=([n])([u])([l])([l])
T_AND=([Aa])([Nn])([Dd])
F_TFIDF=([Tt])([Ff])([Ii])([Dd])([Ff])
F_MIN_MATCH=([Mm])([Ii])([Nn])([_])([Mm])([Aa])([Tt])([Cc])([Hh])
F_PHRASE=([Pp])([Hh])([Rr])([Aa])([Ss])([Ee])
F_EXISTS=([Ee])([Xx])([Ii])([Ss])([Tt])([Ss])
F_TOKENS=([Tt])([Oo])([Kk])([Ee])([Nn])([Ss])
F_WARN=([Ww])([Aa])([Rr])([Nn])
F_PREGEL_RESULT=([Pp])([Rr])([Ee])([Gg])([Ee])([Ll])([_])([Rr])([Ee])([Ss])([Uu])([Ll])([Tt])
F_NOOPT=([Nn])([Oo])([Oo])([Pp])([Tt])
F_VERSION=([Vv])([Ee])([Rr])([Ss])([Ii])([Oo])([Nn])
F_FULLTEXT=([Ff])([Uu])([Ll])([Ll])([Tt])([Ee])([Xx])([Tt])
F_COLLECTIONS=([Cc])([Oo])([Ll])([Ll])([Ee])([Cc])([Tt])([Ii])([Oo])([Nn])([Ss])
F_PARSE_IDENTIFIER=([Pp])([Aa])([Rr])([Ss])([Ee])([_])([Ii])([Dd])([Ee])([Nn])([Tt])([Ii])([Ff])([Ii])([Ee])([Rr])
F_FIRST_DOCUMENT=([Ff])([Ii])([Rr])([Ss])([Tt])([_])([Dd])([Oo])([Cc])([Uu])([Mm])([Ee])([Nn])([Tt])
F_NOT_NULL=([Nn])([Oo])([Tt])([_])([Nn])([Uu])([Ll])([Ll])
F_DATE_COMPARE=([Dd])([Aa])([Tt])([Ee])([_])([Cc])([Oo])([Mm])([Pp])([Aa])([Rr])([Ee])
F_DATE_ADD=([Dd])([Aa])([Tt])([Ee])([_])([Aa])([Dd])([Dd])
F_DATE_DAYS_IN_MONTH=([Dd])([Aa])([Tt])([Ee])([_])([Dd])([Aa])([Yy])([Ss])([_])([Ii])([Nn])([_])([Mm])([Oo])([Nn])([Tt])([Hh])
F_DATE_FORMAT=([Dd])([Aa])([Tt])([Ee])([_])([Ff])([Oo])([Rr])([Mm])([Aa])([Tt])
F_DATE_LEAPYEAR=([Dd])([Aa])([Tt])([Ee])([_])([Ll])([Ee])([Aa])([Pp])([Yy])([Ee])([Aa])([Rr])
F_DATE_DAYOFYEAR=([Dd])([Aa])([Tt])([Ee])([_])([Dd])([Aa])([Yy])([Oo])([Ff])([Yy])([Ee])([Aa])([Rr])
F_DATE_SECOND=([Dd])([Aa])([Tt])([Ee])([_])([Ss])([Ee])([Cc])([Oo])([Nn])([Dd])
F_DATE_YEAR=([Dd])([Aa])([Tt])([Ee])([_])([Yy])([Ee])([Aa])([Rr])
F_ASSERT=([Aa])([Ss])([Ss])([Ee])([Rr])([Tt])
F_DATE_TIMESTAMP=([Dd])([Aa])([Tt])([Ee])([_])([Tt])([Ii])([Mm])([Ee])([Ss])([Tt])([Aa])([Mm])([Pp])
F_GEO_MULTILINESTRING=([Gg])([Ee])([Oo])([_])([Mm])([Uu])([Ll])([Tt])([Ii])([Ll])([Ii])([Nn])([Ee])([Ss])([Tt])([Rr])([Ii])([Nn])([Gg])
F_GEO_LINESTRING=([Gg])([Ee])([Oo])([_])([Ll])([Ii])([Nn])([Ee])([Ss])([Tt])([Rr])([Ii])([Nn])([Gg])
F_GEO_POLYGON=([Gg])([Ee])([Oo])([_])([Pp])([Oo])([Ll])([Yy])([Gg])([Oo])([Nn])
F_DISTANCE=([Dd])([Ii])([Ss])([Tt])([Aa])([Nn])([Cc])([Ee])
F_DOCUMENT=([Dd])([Oo])([Cc])([Uu])([Mm])([Ee])([Nn])([Tt])
F_ZIP=([Zz])([Ii])([Pp])
F_TRANSLATE=([Tt])([Rr])([Aa])([Nn])([Ss])([Ll])([Aa])([Tt])([Ee])
F_KEEP=([Kk])([Ee])([Ee])([Pp])
F_UNSET_RECURSIVE=([Uu])([Nn])([Ss])([Ee])([Tt])([_])([Rr])([Ee])([Cc])([Uu])([Rr])([Ss])([Ii])([Vv])([Ee])
F_GEO_EQUALS=([Gg])([Ee])([Oo])([_])([Ee])([Qq])([Uu])([Aa])([Ll])([Ss])
F_UNSET=([Uu])([Nn])([Ss])([Ee])([Tt])
F_MATCHES=([Mm])([Aa])([Tt])([Cc])([Hh])([Ee])([Ss])
F_BOOST=([Bb])([Oo])([Oo])([Ss])([Tt])
F_MERGE=([Mm])([Ee])([Rr])([Gg])([Ee])
F_CURRENT_DATABASE=([Cc])([Uu])([Rr])([Rr])([Ee])([Nn])([Tt])([_])([Dd])([Aa])([Tt])([Aa])([Bb])([Aa])([Ss])([Ee])
F_KEYS=([Kk])([Ee])([Yy])([Ss])
F_HAS=([Hh])([Aa])([Ss])
F_DATE_DAYOFWEEK=([Dd])([Aa])([Tt])([Ee])([_])([Dd])([Aa])([Yy])([Oo])([Ff])([Ww])([Ee])([Ee])([Kk])
F_CALL=([Cc])([Aa])([Ll])([Ll])
F_REMOVE_NTH=([Rr])([Ee])([Mm])([Oo])([Vv])([Ee])([_])([Nn])([Tt])([Hh])
F_REMOVE_VALUES=([Rr])([Ee])([Mm])([Oo])([Vv])([Ee])([_])([Vv])([Aa])([Ll])([Uu])([Ee])([Ss])
F_SHIFT=([Ss])([Hh])([Ii])([Ff])([Tt])
F_CONTAINS_ARRAY=([Cc])([Oo])([Nn])([Tt])([Aa])([Ii])([Nn])([Ss])([_])([Aa])([Rr])([Rr])([Aa])([Yy])
F_POSITION=([Pp])([Oo])([Ss])([Ii])([Tt])([Ii])([Oo])([Nn])
F_GEO_DISTANCE=([Gg])([Ee])([Oo])([_])([Dd])([Ii])([Ss])([Tt])([Aa])([Nn])([Cc])([Ee])
F_NTH=([Nn])([Tt])([Hh])
F_REMOVE_VALUE=([Rr])([Ee])([Mm])([Oo])([Vv])([Ee])([_])([Vv])([Aa])([Ll])([Uu])([Ee])
F_FIRST=([Ff])([Ii])([Rr])([Ss])([Tt])
F_DATE_HOUR=([Dd])([Aa])([Tt])([Ee])([_])([Hh])([Oo])([Uu])([Rr])
F_REVERSE=([Rr])([Ee])([Vv])([Ee])([Rr])([Ss])([Ee])
F_SLICE=([Ss])([Ll])([Ii])([Cc])([Ee])
F_ANALYZER=([Aa])([Nn])([Aa])([Ll])([Yy])([Zz])([Ee])([Rr])
F_LEVENSHTEIN_DISTANCE=([Ll])([Ee])([Vv])([Ee])([Nn])([Ss])([Hh])([Tt])([Ee])([Ii])([Nn])([_])([Dd])([Ii])([Ss])([Tt])([Aa])([Nn])([Cc])([Ee])
F_DATE_ISOWEEK=([Dd])([Aa])([Tt])([Ee])([_])([Ii])([Ss])([Oo])([Ww])([Ee])([Ee])([Kk])
F_SOUNDEX=([Ss])([Oo])([Uu])([Nn])([Dd])([Ee])([Xx])
F_SIN=([Ss])([Ii])([Nn])
F_EXP2=([Ee])([Xx])([Pp])([2])
F_ENCODE_URI_COMPONENT=([Ee])([Nn])([Cc])([Oo])([Dd])([Ee])([_])([Uu])([Rr])([Ii])([_])([Cc])([Oo])([Mm])([Pp])([Oo])([Nn])([Ee])([Nn])([Tt])
F_SHA512=([Ss])([Hh])([Aa])([5])([1])([2])
F_PUSH=([Pp])([Uu])([Ss])([Hh])
F_SHA1=([Ss])([Hh])([Aa])([1])
F_SUBSTITUTE=([Ss])([Uu])([Bb])([Ss])([Tt])([Ii])([Tt])([Uu])([Tt])([Ee])
F_FLOOR=([Ff])([Ll])([Oo])([Oo])([Rr])
F_DATE_MILLISECOND=([Dd])([Aa])([Tt])([Ee])([_])([Mm])([Ii])([Ll])([Ll])([Ii])([Ss])([Ee])([Cc])([Oo])([Nn])([Dd])
F_TO_BASE64=([Tt])([Oo])([_])([Bb])([Aa])([Ss])([Ee])([6])([4])
F_HASH=([Hh])([Aa])([Ss])([Hh])
F_IS_SAME_COLLECTION=([Ii])([Ss])([_])([Ss])([Aa])([Mm])([Ee])([_])([Cc])([Oo])([Ll])([Ll])([Ee])([Cc])([Tt])([Ii])([Oo])([Nn])
F_PASSTHRU=([Pp])([Aa])([Ss])([Ss])([Tt])([Hh])([Rr])([Uu])
F_GEO_CONTAINS=([Gg])([Ee])([Oo])([_])([Cc])([Oo])([Nn])([Tt])([Aa])([Ii])([Nn])([Ss])
F_LTRIM=([Ll])([Tt])([Rr])([Ii])([Mm])
F_FIND_FIRST=([Ff])([Ii])([Nn])([Dd])([_])([Ff])([Ii])([Rr])([Ss])([Tt])
F_RTRIM=([Rr])([Tt])([Rr])([Ii])([Mm])
F_UNION=([Uu])([Nn])([Ii])([Oo])([Nn])
F_UNIQUE=([Uu])([Nn])([Ii])([Qq])([Uu])([Ee])
F_SUM=([Ss])([Uu])([Mm])
F_REGEX_REPLACE=([Rr])([Ee])([Gg])([Ee])([Xx])([_])([Rr])([Ee])([Pp])([Ll])([Aa])([Cc])([Ee])
F_REGEX_SPLIT=([Rr])([Ee])([Gg])([Ee])([Xx])([_])([Ss])([Pp])([Ll])([Ii])([Tt])
F_DATE_DIFF=([Dd])([Aa])([Tt])([Ee])([_])([Dd])([Ii])([Ff])([Ff])
F_APPLY=([Aa])([Pp])([Pp])([Ll])([Yy])
F_SQRT=([Ss])([Qq])([Rr])([Tt])
F_LIKE=([Ll])([Ii])([Kk])([Ee])
F_SPLIT=([Ss])([Pp])([Ll])([Ii])([Tt])
F_REGEX_MATCHES=([Rr])([Ee])([Gg])([Ee])([Xx])([_])([Mm])([Aa])([Tt])([Cc])([Hh])([Ee])([Ss])
F_CONTAINS=([Cc])([Oo])([Nn])([Tt])([Aa])([Ii])([Nn])([Ss])
F_DATE_NOW=([Dd])([Aa])([Tt])([Ee])([_])([Nn])([Oo])([Ww])
F_VARIANCE_POPULATION=([Vv])([Aa])([Rr])([Ii])([Aa])([Nn])([Cc])([Ee])([_])([Pp])([Oo])([Pp])([Uu])([Ll])([Aa])([Tt])([Ii])([Oo])([Nn])
F_FAIL=([Ff])([Aa])([Ii])([Ll])
F_VARIANCE=([Vv])([Aa])([Rr])([Ii])([Aa])([Nn])([Cc])([Ee])
F_SORTED_UNIQUE=([Ss])([Oo])([Rr])([Tt])([Ee])([Dd])([_])([Uu])([Nn])([Ii])([Qq])([Uu])([Ee])
F_VALUES=([Vv])([Aa])([Ll])([Uu])([Ee])([Ss])
F_LEFT=([Ll])([Ee])([Ff])([Tt])
F_V8=([Vv])([8])
F_IS_BOOL=([Ii])([Ss])([_])([Bb])([Oo])([Oo])([Ll])
F_DATE_ISO8601=([Dd])([Aa])([Tt])([Ee])([_])([Ii])([Ss])([Oo])([8])([6])([0])([1])
F_ASIN=([Aa])([Ss])([Ii])([Nn])
F_IS_ARRAY=([Ii])([Ss])([_])([Aa])([Rr])([Rr])([Aa])([Yy])
F_TO_NUMBER=([Tt])([Oo])([_])([Nn])([Uu])([Mm])([Bb])([Ee])([Rr])
F_COLLECTION_COUNT=([Cc])([Oo])([Ll])([Ll])([Ee])([Cc])([Tt])([Ii])([Oo])([Nn])([_])([Cc])([Oo])([Uu])([Nn])([Tt])
F_IS_STRING=([Ii])([Ss])([_])([Ss])([Tt])([Rr])([Ii])([Nn])([Gg])
F_MD5=([Mm])([Dd])([5])
F_CEIL=([Cc])([Ee])([Ii])([Ll])
F_TYPENAME=([Tt])([Yy])([Pp])([Ee])([Nn])([Aa])([Mm])([Ee])
F_STARTS_WITH=([Ss])([Tt])([Aa])([Rr])([Tt])([Ss])([_])([Ww])([Ii])([Tt])([Hh])
F_JSON_PARSE=([Jj])([Ss])([Oo])([Nn])([_])([Pp])([Aa])([Rr])([Ss])([Ee])
F_FLATTEN=([Ff])([Ll])([Aa])([Tt])([Tt])([Ee])([Nn])
F_APPEND=([Aa])([Pp])([Pp])([Ee])([Nn])([Dd])
F_UPPER=([Uu])([Pp])([Pp])([Ee])([Rr])
F_RIGHT=([Rr])([Ii])([Gg])([Hh])([Tt])
F_ROUND=([Rr])([Oo])([Uu])([Nn])([Dd])
F_TAN=([Tt])([Aa])([Nn])
F_TAN2=([Tt])([Aa])([Nn])([2])
F_MAX=([Mm])([Aa])([Xx])
F_TO_BOOL=([Tt])([Oo])([_])([Bb])([Oo])([Oo])([Ll])
F_IS_NUMBER=([Ii])([Ss])([_])([Nn])([Uu])([Mm])([Bb])([Ee])([Rr])
F_TO_ARRAY=([Tt])([Oo])([_])([Aa])([Rr])([Rr])([Aa])([Yy])
F_STDDEV_POPULATION=([Ss])([Tt])([Dd])([Dd])([Ee])([Vv])([_])([Pp])([Oo])([Pp])([Uu])([Ll])([Aa])([Tt])([Ii])([Oo])([Nn])
F_MEDIAN=([Mm])([Ee])([Dd])([Ii])([Aa])([Nn])
F_IS_KEY=([Ii])([Ss])([_])([Kk])([Ee])([Yy])
F_IS_NULL=([Ii])([Ss])([_])([Nn])([Uu])([Ll])([Ll])
F_DATE_DAY=([Dd])([Aa])([Tt])([Ee])([_])([Dd])([Aa])([Yy])
F_TO_LIST=([Tt])([Oo])([_])([Ll])([Ii])([Ss])([Tt])
F_JSON_STRINGIFY=([Jj])([Ss])([Oo])([Nn])([_])([Ss])([Tt])([Rr])([Ii])([Nn])([Gg])([Ii])([Ff])([Yy])
F_FIND_LAST=([Ff])([Ii])([Nn])([Dd])([_])([Ll])([Aa])([Ss])([Tt])
F_GEO_POINT=([Gg])([Ee])([Oo])([_])([Pp])([Oo])([Ii])([Nn])([Tt])
F_TO_STRING=([Tt])([Oo])([_])([Ss])([Tt])([Rr])([Ii])([Nn])([Gg])
F_CONCAT=([Cc])([Oo])([Nn])([Cc])([Aa])([Tt])
F_GEO_MULTIPOINT=([Gg])([Ee])([Oo])([_])([Mm])([Uu])([Ll])([Tt])([Ii])([Pp])([Oo])([Ii])([Nn])([Tt])
F_SORTED=([Ss])([Oo])([Rr])([Tt])([Ee])([Dd])
F_CHAR_LENGTH=([Cc])([Hh])([Aa])([Rr])([_])([Ll])([Ee])([Nn])([Gg])([Tt])([Hh])
F_CONCAT_SEPARATOR=([Cc])([Oo])([Nn])([Cc])([Aa])([Tt])([_])([Ss])([Ee])([Pp])([Aa])([Rr])([Aa])([Tt])([Oo])([Rr])
F_SUBSTRING=([Ss])([Uu])([Bb])([Ss])([Tt])([Rr])([Ii])([Nn])([Gg])
F_COS=([Cc])([Oo])([Ss])
F_MIN=([Mm])([Ii])([Nn])
F_LOWER=([Ll])([Oo])([Ww])([Ee])([Rr])
F_COUNT_UNIQUE=([Cc])([Oo])([Uu])([Nn])([Tt])([_])([Uu])([Nn])([Ii])([Qq])([Uu])([Ee])
F_RANDOM_TOKEN=([Rr])([Aa])([Nn])([Dd])([Oo])([Mm])([_])([Tt])([Oo])([Kk])([Ee])([Nn])
F_UUID=([Uu])([Uu])([Ii])([Dd])
F_ABS=([Aa])([Bb])([Ss])
F_LOG=([Ll])([Oo])([Gg])
F_RADIANS=([Rr])([Aa])([Dd])([Ii])([Aa])([Nn])([Ss])
F_VARIANCE_SAMPLE=([Vv])([Aa])([Rr])([Ii])([Aa])([Nn])([Cc])([Ee])([_])([Ss])([Aa])([Mm])([Pp])([Ll])([Ee])
F_LOG2=([Ll])([Oo])([Gg])([2])
F_GEO_INTERSECTS=([Gg])([Ee])([Oo])([_])([Ii])([Nn])([Tt])([Ee])([Rr])([Ss])([Ee])([Cc])([Tt])([Ss])
F_POW=([Pp])([Oo])([Ww])
F_LOG10=([Ll])([Oo])([Gg])([1])([0])
F_ATTRIBUTES=([Aa])([Tt])([Tt])([Rr])([Ii])([Bb])([Uu])([Tt])([Ee])([Ss])
F_LAST=([Ll])([Aa])([Ss])([Tt])
F_TRIM=([Tt])([Rr])([Ii])([Mm])
F_EXP=([Ee])([Xx])([Pp])
F_FIRST_LIST=([Ff])([Ii])([Rr])([Ss])([Tt])([_])([Ll])([Ii])([Ss])([Tt])
F_LENGTH=([Ll])([Ee])([Nn])([Gg])([Tt])([Hh])
F_IS_LIST=([Ii])([Ss])([_])([Ll])([Ii])([Ss])([Tt])
F_ACOS=([Aa])([Cc])([Oo])([Ss])
F_ATAN=([Aa])([Tt])([Aa])([Nn])
F_ATAN2=([Aa])([Tt])([Aa])([Nn])([2])
F_DATE_QUARTER=([Dd])([Aa])([Tt])([Ee])([_])([Qq])([Uu])([Aa])([Rr])([Tt])([Ee])([Rr])
F_COUNT=([Cc])([Oo])([Uu])([Nn])([Tt])
F_CURRENT_USER=([Cc])([Uu])([Rr])([Rr])([Ee])([Nn])([Tt])([_])([Uu])([Ss])([Ee])([Rr])
F_MERGE_RECURSIVE=([Mm])([Ee])([Rr])([Gg])([Ee])([_])([Rr])([Ee])([Cc])([Uu])([Rr])([Ss])([Ii])([Vv])([Ee])
F_DEGREES=([Dd])([Ee])([Gg])([Rr])([Ee])([Ee])([Ss])
F_PI=([Pp])([Ii])
F_RAND=([Rr])([Aa])([Nn])([Dd])
F_PERCENTILE=([Pp])([Ee])([Rr])([Cc])([Ee])([Nn])([Tt])([Ii])([Ll])([Ee])
F_BM25=([Bb])([Mm])([2])([5])
F_RANGE=([Rr])([Aa])([Nn])([Gg])([Ee])
F_SLEEP=([Ss])([Ll])([Ee])([Ee])([Pp])
F_UNION_DISTINCT=([Uu])([Nn])([Ii])([Oo])([Nn])([_])([Dd])([Ii])([Ss])([Tt])([Ii])([Nn])([Cc])([Tt])
F_STDDEV=([Ss])([Tt])([Dd])([Dd])([Ee])([Vv])
F_DATE_MONTH=([Dd])([Aa])([Tt])([Ee])([_])([Mm])([Oo])([Nn])([Tt])([Hh])
F_IS_DOCUMENT=([Ii])([Ss])([_])([Dd])([Oo])([Cc])([Uu])([Mm])([Ee])([Nn])([Tt])
F_MINUS=([Mm])([Ii])([Nn])([Uu])([Ss])
F_UNSHIFT=([Uu])([Nn])([Ss])([Hh])([Ii])([Ff])([Tt])
F_POP=([Pp])([Oo])([Pp])
F_REGEX_TEST=([Rr])([Ee])([Gg])([Ee])([Xx])([_])([Tt])([Ee])([Ss])([Tt])
F_OUTERSECTION=([Oo])([Uu])([Tt])([Ee])([Rr])([Ss])([Ee])([Cc])([Tt])([Ii])([Oo])([Nn])
F_DATE_SUBTRACT=([Dd])([Aa])([Tt])([Ee])([_])([Ss])([Uu])([Bb])([Tt])([Rr])([Aa])([Cc])([Tt])
F_TO_HEX=([Tt])([Oo])([_])([Hh])([Ee])([Xx])
F_INTERSECTION=([Ii])([Nn])([Tt])([Ee])([Rr])([Ss])([Ee])([Cc])([Tt])([Ii])([Oo])([Nn])
F_AVERAGE=([Aa])([Vv])([Ee])([Rr])([Aa])([Gg])([Ee])
F_DATE_MINUTE=([Dd])([Aa])([Tt])([Ee])([_])([Mm])([Ii])([Nn])([Uu])([Tt])([Ee])
F_IS_DATESTRING=([Ii])([Ss])([_])([Dd])([Aa])([Tt])([Ee])([Ss])([Tt])([Rr])([Ii])([Nn])([Gg])
F_AVG=([Aa])([Vv])([Gg])
F_DATE_TRUNC=([Dd])([Aa])([Tt])([Ee])([_])([Tt])([Rr])([Uu])([Nn])([Cc])
F_IS_OBJECT=([Ii])([Ss])([_])([Oo])([Bb])([Jj])([Ee])([Cc])([Tt])
F_STDDEV_SAMPLE=([Ss])([Tt])([Dd])([Dd])([Ee])([Vv])([_])([Ss])([Aa])([Mm])([Pp])([Ll])([Ee])
F_COUNT_DISTINCT=([Cc])([Oo])([Uu])([Nn])([Tt])([_])([Dd])([Ii])([Ss])([Tt])([Ii])([Nn])([Cc])([Tt])
A_IDENTITY=('identity')|(\"identity\")
A_TEXT_DE=('text_de')|(\"text_de\")
A_TEXT_EN=('text_en')|(\"text_en\")
A_TEXT_ES=('text_es')|(\"text_es\")
A_TEXT_FI=('text_fi')|(\"text_fi\")
TEXT_FR=('text_fr')|(\"text_fr\")
A_TEXT_IT=('text_it')|(\"text_it\")
A_TEXT_NL=('text_nl')|(\"text_nl\")
A_TEXT_NO=('text_no')|(\"text_no\")
A_TEXT_PT=('text_pt')|(\"text_pt\")
A_TEXT_RU=('text_ru')|(\"text_ru\")
A_TEXT_SV=('text_sv')|(\"text_sv\")
A_TEXT_ZH=('text_zh')|(\"text_zh\")
NUMBER_INTEGER=[0-9]+
B_COMMENT="/"\*([^*]|\*+[^*/])*(\*+"/")?
L_COMMENT="//".*
TEXT_SINGLE='(''|[^']*)'
TEXT_DOUBLE=\"([^\\\"\r\n]|\\[^\r\n])*\"?
NUMBER=-?(0|[1-9][0-9]*)(\.[0-9]+)?([eE][+-]?[0-9]*)?
ID=[a-zA-Z_]([[a-zA-Z_0-9]][a-zA-Z_0-9]*)?
SPACE=[ \t\n\x0B\f\r]+

%%
<YYINITIAL> {
  {WHITE_SPACE}                 { return WHITE_SPACE; }

  "."                           { return DOT; }
  "_key"                        { return T_KEY; }
  "_id"                         { return T_ID; }
  "_from"                       { return T_SYS_FROM; }
  "_to"                         { return T_SYS_TO; }
  "@"                           { return N_AT; }
  "true"                        { return T_TRUE; }
  "false"                       { return T_FALSE; }
  "not"                         { return T_NOT; }
  "&&"                          { return T_LOGICAL_AND; }
  "||"                          { return T_OR; }
  "~="                          { return T_REGEX_MATCH; }
  "~!"                          { return T_REGEX_NON_MATCH; }
  "=="                          { return T_EQ; }
  "="                           { return T_IS; }
  "!="                          { return T_NE; }
  "<"                           { return T_LT; }
  ">"                           { return T_GT; }
  "<="                          { return T_LE; }
  ">="                          { return T_GE; }
  "like"                        { return T_LIKE; }
  "+"                           { return T_PLUS; }
  "-"                           { return T_MINUS; }
  "*"                           { return T_TIMES; }
  "/"                           { return T_DIV; }
  "%"                           { return T_MOD; }
  "?"                           { return T_QUESTION; }
  ":"                           { return T_COLON; }
  "::"                          { return T_SCOPE; }
  ".."                          { return T_RANGE; }
  ","                           { return T_COMMA; }
  "("                           { return T_OPEN; }
  ")"                           { return T_CLOSE; }
  "{"                           { return T_OBJECT_OPEN; }
  "}"                           { return T_OBJECT_CLOSE; }
  "["                           { return T_ARRAY_OPEN; }
  "]"                           { return T_ARRAY_CLOSE; }
  "none"                        { return T_NONE; }
  "'"                           { return SINGLE_QUOTE; }
  "\""                          { return DOUBLE_QUOTE; }
  "$"                           { return DOLLAR; }
  "${"                          { return T_PLACHOLDER_START; }
  "T_NIN"                       { return T_NIN; }
  "A_TEXT_FR"                   { return A_TEXT_FR; }

  {T_SEARCH}                    { return T_SEARCH; }
  {T_SHORTEST_PATH}             { return T_SHORTEST_PATH; }
  {T_REPLACE}                   { return T_REPLACE; }
  {T_ASC}                       { return T_ASC; }
  {T_AGGREGATE}                 { return T_AGGREGATE; }
  {T_FILTER}                    { return T_FILTER; }
  {T_DESC}                      { return T_DESC; }
  {T_IN}                        { return T_IN; }
  {T_INTO}                      { return T_INTO; }
  {T_LIMIT}                     { return T_LIMIT; }
  {T_UPDATE}                    { return T_UPDATE; }
  {T_SORT}                      { return T_SORT; }
  {T_GRAPH}                     { return T_GRAPH; }
  {T_FOR}                       { return T_FOR; }
  {T_LET}                       { return T_LET; }
  {T_COLLECT}                   { return T_COLLECT; }
  {T_WITH}                      { return T_WITH; }
  {T_DISTINCT}                  { return T_DISTINCT; }
  {T_RETURN}                    { return T_RETURN; }
  {T_UPSERT}                    { return T_UPSERT; }
  {T_REMOVE}                    { return T_REMOVE; }
  {T_INSERT}                    { return T_INSERT; }
  {T_OUTBOUND}                  { return T_OUTBOUND; }
  {T_INBOUND}                   { return T_INBOUND; }
  {T_ANY}                       { return T_ANY; }
  {T_ALL}                       { return T_ALL; }
  {T_NULL}                      { return T_NULL; }
  {T_AND}                       { return T_AND; }
  {F_TFIDF}                     { return F_TFIDF; }
  {F_MIN_MATCH}                 { return F_MIN_MATCH; }
  {F_PHRASE}                    { return F_PHRASE; }
  {F_EXISTS}                    { return F_EXISTS; }
  {F_TOKENS}                    { return F_TOKENS; }
  {F_WARN}                      { return F_WARN; }
  {F_PREGEL_RESULT}             { return F_PREGEL_RESULT; }
  {F_NOOPT}                     { return F_NOOPT; }
  {F_VERSION}                   { return F_VERSION; }
  {F_FULLTEXT}                  { return F_FULLTEXT; }
  {F_COLLECTIONS}               { return F_COLLECTIONS; }
  {F_PARSE_IDENTIFIER}          { return F_PARSE_IDENTIFIER; }
  {F_FIRST_DOCUMENT}            { return F_FIRST_DOCUMENT; }
  {F_NOT_NULL}                  { return F_NOT_NULL; }
  {F_DATE_COMPARE}              { return F_DATE_COMPARE; }
  {F_DATE_ADD}                  { return F_DATE_ADD; }
  {F_DATE_DAYS_IN_MONTH}        { return F_DATE_DAYS_IN_MONTH; }
  {F_DATE_FORMAT}               { return F_DATE_FORMAT; }
  {F_DATE_LEAPYEAR}             { return F_DATE_LEAPYEAR; }
  {F_DATE_DAYOFYEAR}            { return F_DATE_DAYOFYEAR; }
  {F_DATE_SECOND}               { return F_DATE_SECOND; }
  {F_DATE_YEAR}                 { return F_DATE_YEAR; }
  {F_ASSERT}                    { return F_ASSERT; }
  {F_DATE_TIMESTAMP}            { return F_DATE_TIMESTAMP; }
  {F_GEO_MULTILINESTRING}       { return F_GEO_MULTILINESTRING; }
  {F_GEO_LINESTRING}            { return F_GEO_LINESTRING; }
  {F_GEO_POLYGON}               { return F_GEO_POLYGON; }
  {F_DISTANCE}                  { return F_DISTANCE; }
  {F_DOCUMENT}                  { return F_DOCUMENT; }
  {F_ZIP}                       { return F_ZIP; }
  {F_TRANSLATE}                 { return F_TRANSLATE; }
  {F_KEEP}                      { return F_KEEP; }
  {F_UNSET_RECURSIVE}           { return F_UNSET_RECURSIVE; }
  {F_GEO_EQUALS}                { return F_GEO_EQUALS; }
  {F_UNSET}                     { return F_UNSET; }
  {F_MATCHES}                   { return F_MATCHES; }
  {F_BOOST}                     { return F_BOOST; }
  {F_MERGE}                     { return F_MERGE; }
  {F_CURRENT_DATABASE}          { return F_CURRENT_DATABASE; }
  {F_KEYS}                      { return F_KEYS; }
  {F_HAS}                       { return F_HAS; }
  {F_DATE_DAYOFWEEK}            { return F_DATE_DAYOFWEEK; }
  {F_CALL}                      { return F_CALL; }
  {F_REMOVE_NTH}                { return F_REMOVE_NTH; }
  {F_REMOVE_VALUES}             { return F_REMOVE_VALUES; }
  {F_SHIFT}                     { return F_SHIFT; }
  {F_CONTAINS_ARRAY}            { return F_CONTAINS_ARRAY; }
  {F_POSITION}                  { return F_POSITION; }
  {F_GEO_DISTANCE}              { return F_GEO_DISTANCE; }
  {F_NTH}                       { return F_NTH; }
  {F_REMOVE_VALUE}              { return F_REMOVE_VALUE; }
  {F_FIRST}                     { return F_FIRST; }
  {F_DATE_HOUR}                 { return F_DATE_HOUR; }
  {F_REVERSE}                   { return F_REVERSE; }
  {F_SLICE}                     { return F_SLICE; }
  {F_ANALYZER}                  { return F_ANALYZER; }
  {F_LEVENSHTEIN_DISTANCE}      { return F_LEVENSHTEIN_DISTANCE; }
  {F_DATE_ISOWEEK}              { return F_DATE_ISOWEEK; }
  {F_SOUNDEX}                   { return F_SOUNDEX; }
  {F_SIN}                       { return F_SIN; }
  {F_EXP2}                      { return F_EXP2; }
  {F_ENCODE_URI_COMPONENT}      { return F_ENCODE_URI_COMPONENT; }
  {F_SHA512}                    { return F_SHA512; }
  {F_PUSH}                      { return F_PUSH; }
  {F_SHA1}                      { return F_SHA1; }
  {F_SUBSTITUTE}                { return F_SUBSTITUTE; }
  {F_FLOOR}                     { return F_FLOOR; }
  {F_DATE_MILLISECOND}          { return F_DATE_MILLISECOND; }
  {F_TO_BASE64}                 { return F_TO_BASE64; }
  {F_HASH}                      { return F_HASH; }
  {F_IS_SAME_COLLECTION}        { return F_IS_SAME_COLLECTION; }
  {F_PASSTHRU}                  { return F_PASSTHRU; }
  {F_GEO_CONTAINS}              { return F_GEO_CONTAINS; }
  {F_LTRIM}                     { return F_LTRIM; }
  {F_FIND_FIRST}                { return F_FIND_FIRST; }
  {F_RTRIM}                     { return F_RTRIM; }
  {F_UNION}                     { return F_UNION; }
  {F_UNIQUE}                    { return F_UNIQUE; }
  {F_SUM}                       { return F_SUM; }
  {F_REGEX_REPLACE}             { return F_REGEX_REPLACE; }
  {F_REGEX_SPLIT}               { return F_REGEX_SPLIT; }
  {F_DATE_DIFF}                 { return F_DATE_DIFF; }
  {F_APPLY}                     { return F_APPLY; }
  {F_SQRT}                      { return F_SQRT; }
  {F_LIKE}                      { return F_LIKE; }
  {F_SPLIT}                     { return F_SPLIT; }
  {F_REGEX_MATCHES}             { return F_REGEX_MATCHES; }
  {F_CONTAINS}                  { return F_CONTAINS; }
  {F_DATE_NOW}                  { return F_DATE_NOW; }
  {F_VARIANCE_POPULATION}       { return F_VARIANCE_POPULATION; }
  {F_FAIL}                      { return F_FAIL; }
  {F_VARIANCE}                  { return F_VARIANCE; }
  {F_SORTED_UNIQUE}             { return F_SORTED_UNIQUE; }
  {F_VALUES}                    { return F_VALUES; }
  {F_LEFT}                      { return F_LEFT; }
  {F_V8}                        { return F_V8; }
  {F_IS_BOOL}                   { return F_IS_BOOL; }
  {F_DATE_ISO8601}              { return F_DATE_ISO8601; }
  {F_ASIN}                      { return F_ASIN; }
  {F_IS_ARRAY}                  { return F_IS_ARRAY; }
  {F_TO_NUMBER}                 { return F_TO_NUMBER; }
  {F_COLLECTION_COUNT}          { return F_COLLECTION_COUNT; }
  {F_IS_STRING}                 { return F_IS_STRING; }
  {F_MD5}                       { return F_MD5; }
  {F_CEIL}                      { return F_CEIL; }
  {F_TYPENAME}                  { return F_TYPENAME; }
  {F_STARTS_WITH}               { return F_STARTS_WITH; }
  {F_JSON_PARSE}                { return F_JSON_PARSE; }
  {F_FLATTEN}                   { return F_FLATTEN; }
  {F_APPEND}                    { return F_APPEND; }
  {F_UPPER}                     { return F_UPPER; }
  {F_RIGHT}                     { return F_RIGHT; }
  {F_ROUND}                     { return F_ROUND; }
  {F_TAN}                       { return F_TAN; }
  {F_TAN2}                      { return F_TAN2; }
  {F_MAX}                       { return F_MAX; }
  {F_TO_BOOL}                   { return F_TO_BOOL; }
  {F_IS_NUMBER}                 { return F_IS_NUMBER; }
  {F_TO_ARRAY}                  { return F_TO_ARRAY; }
  {F_STDDEV_POPULATION}         { return F_STDDEV_POPULATION; }
  {F_MEDIAN}                    { return F_MEDIAN; }
  {F_IS_KEY}                    { return F_IS_KEY; }
  {F_IS_NULL}                   { return F_IS_NULL; }
  {F_DATE_DAY}                  { return F_DATE_DAY; }
  {F_TO_LIST}                   { return F_TO_LIST; }
  {F_JSON_STRINGIFY}            { return F_JSON_STRINGIFY; }
  {F_FIND_LAST}                 { return F_FIND_LAST; }
  {F_GEO_POINT}                 { return F_GEO_POINT; }
  {F_TO_STRING}                 { return F_TO_STRING; }
  {F_CONCAT}                    { return F_CONCAT; }
  {F_GEO_MULTIPOINT}            { return F_GEO_MULTIPOINT; }
  {F_SORTED}                    { return F_SORTED; }
  {F_CHAR_LENGTH}               { return F_CHAR_LENGTH; }
  {F_CONCAT_SEPARATOR}          { return F_CONCAT_SEPARATOR; }
  {F_SUBSTRING}                 { return F_SUBSTRING; }
  {F_COS}                       { return F_COS; }
  {F_MIN}                       { return F_MIN; }
  {F_LOWER}                     { return F_LOWER; }
  {F_COUNT_UNIQUE}              { return F_COUNT_UNIQUE; }
  {F_RANDOM_TOKEN}              { return F_RANDOM_TOKEN; }
  {F_UUID}                      { return F_UUID; }
  {F_ABS}                       { return F_ABS; }
  {F_LOG}                       { return F_LOG; }
  {F_RADIANS}                   { return F_RADIANS; }
  {F_VARIANCE_SAMPLE}           { return F_VARIANCE_SAMPLE; }
  {F_LOG2}                      { return F_LOG2; }
  {F_GEO_INTERSECTS}            { return F_GEO_INTERSECTS; }
  {F_POW}                       { return F_POW; }
  {F_LOG10}                     { return F_LOG10; }
  {F_ATTRIBUTES}                { return F_ATTRIBUTES; }
  {F_LAST}                      { return F_LAST; }
  {F_TRIM}                      { return F_TRIM; }
  {F_EXP}                       { return F_EXP; }
  {F_FIRST_LIST}                { return F_FIRST_LIST; }
  {F_LENGTH}                    { return F_LENGTH; }
  {F_IS_LIST}                   { return F_IS_LIST; }
  {F_ACOS}                      { return F_ACOS; }
  {F_ATAN}                      { return F_ATAN; }
  {F_ATAN2}                     { return F_ATAN2; }
  {F_DATE_QUARTER}              { return F_DATE_QUARTER; }
  {F_COUNT}                     { return F_COUNT; }
  {F_CURRENT_USER}              { return F_CURRENT_USER; }
  {F_MERGE_RECURSIVE}           { return F_MERGE_RECURSIVE; }
  {F_DEGREES}                   { return F_DEGREES; }
  {F_PI}                        { return F_PI; }
  {F_RAND}                      { return F_RAND; }
  {F_PERCENTILE}                { return F_PERCENTILE; }
  {F_BM25}                      { return F_BM25; }
  {F_RANGE}                     { return F_RANGE; }
  {F_SLEEP}                     { return F_SLEEP; }
  {F_UNION_DISTINCT}            { return F_UNION_DISTINCT; }
  {F_STDDEV}                    { return F_STDDEV; }
  {F_DATE_MONTH}                { return F_DATE_MONTH; }
  {F_IS_DOCUMENT}               { return F_IS_DOCUMENT; }
  {F_MINUS}                     { return F_MINUS; }
  {F_UNSHIFT}                   { return F_UNSHIFT; }
  {F_POP}                       { return F_POP; }
  {F_REGEX_TEST}                { return F_REGEX_TEST; }
  {F_OUTERSECTION}              { return F_OUTERSECTION; }
  {F_DATE_SUBTRACT}             { return F_DATE_SUBTRACT; }
  {F_TO_HEX}                    { return F_TO_HEX; }
  {F_INTERSECTION}              { return F_INTERSECTION; }
  {F_AVERAGE}                   { return F_AVERAGE; }
  {F_DATE_MINUTE}               { return F_DATE_MINUTE; }
  {F_IS_DATESTRING}             { return F_IS_DATESTRING; }
  {F_AVG}                       { return F_AVG; }
  {F_DATE_TRUNC}                { return F_DATE_TRUNC; }
  {F_IS_OBJECT}                 { return F_IS_OBJECT; }
  {F_STDDEV_SAMPLE}             { return F_STDDEV_SAMPLE; }
  {F_COUNT_DISTINCT}            { return F_COUNT_DISTINCT; }
  {A_IDENTITY}                  { return A_IDENTITY; }
  {A_TEXT_DE}                   { return A_TEXT_DE; }
  {A_TEXT_EN}                   { return A_TEXT_EN; }
  {A_TEXT_ES}                   { return A_TEXT_ES; }
  {A_TEXT_FI}                   { return A_TEXT_FI; }
  {TEXT_FR}                     { return TEXT_FR; }
  {A_TEXT_IT}                   { return A_TEXT_IT; }
  {A_TEXT_NL}                   { return A_TEXT_NL; }
  {A_TEXT_NO}                   { return A_TEXT_NO; }
  {A_TEXT_PT}                   { return A_TEXT_PT; }
  {A_TEXT_RU}                   { return A_TEXT_RU; }
  {A_TEXT_SV}                   { return A_TEXT_SV; }
  {A_TEXT_ZH}                   { return A_TEXT_ZH; }
  {NUMBER_INTEGER}              { return NUMBER_INTEGER; }
  {B_COMMENT}                   { return B_COMMENT; }
  {L_COMMENT}                   { return L_COMMENT; }
  {TEXT_SINGLE}                 { return TEXT_SINGLE; }
  {TEXT_DOUBLE}                 { return TEXT_DOUBLE; }
  {NUMBER}                      { return NUMBER; }
  {ID}                          { return ID; }
  {SPACE}                       { return SPACE; }

}

[^] { return BAD_CHARACTER; }
