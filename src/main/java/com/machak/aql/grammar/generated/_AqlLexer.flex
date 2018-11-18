package com.machak.aql.grammar.generated;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.machak.aql.grammar.generated.psi.AqlTypes.*;

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
T_PHRASE=([Pp])([Hh])([Rr])([Aa])([Ss])([Ee])
T_SHORTEST_PATH=([Ss])([Hh])([Oo])([Rr])([Tt])([Ee])([Ss])([Pp])([Aa])([Tt])([Hh])
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
F_INTERSECTION=([Oo])([Uu])([Tt])([Ee])([Rr])([Ss])([Ee])([Cc])([Tt])([Ii])([Oo])([Nn])
T_OUTBOUND=([Oo])([Uu])([Tt])([Bb])([Aa])([Nn])([Dd])
T_INBOUND=([Ii])([Nn])([Bb])([Aa])([Nn])([Dd])
T_ANY=([Aa])([Nn])([Yy])
T_ALL=([Aa])([Ll])([Ll])
T_NULL=([Nn])([Uu])([Ll])([Ll])
T_AND=([Aa])([Nn])([Dd])
F_HAS=([Hh])([Aa])([Ss])
F_LENGTH=([Ll])([Ee])([Nn])([Nn])([Gg])([Tt])([Hh])
F_COLLECTIONS=([Cc])([Oo])([Ll])([Ll])([Ee])([Cc])([Tt])([Ii])([Oo])([Nn])([Ss])
F_COUNT=([Cc])([Oo])([Uu])([Nn])([Tt])
F_UNION=([Uu])([Nn])([Ii])([Oo])([Nn])
F_UNION_DISTINCT=([Uu])([Nn])([Ii])([Oo])([Nn])([_])([Dd])([Ii])([Ss])([Tt])([Ii])([Nn])([Cc])([Tt])
F_FIRST=([Ff])([Ii])([Rr])([Ss])([Tt])
F_LAST=([Ll])([Aa])([Ss])([Tt])
F_NTH=([Nn])([Tt])([Hh])
F_REMOVE_NTH=([Rr])([Ee])([Mm])([Oo])([Vv])([Ee])([_])([Nn])([Tt])([Hh])
F_REMOVE_VALUE=([Rr])([Ee])([Mm])([Oo])([Vv])([Ee])([_])([Vv])([Aa])([Ll])([Uu])([Ee])
F_REMOVE_VALUES=([Rr])([Ee])([Mm])([Oo])([Vv])([Ee])([_])([Vv])([Aa])([Ll])([Uu])([Ee])([Ss])
F_POP=([Pp])([Oo])([Pp])
F_PUSH=([Pp])([Uu])([Ss])([Hh])
F_SHIFT=([Ss])([Hh])([Ii])([Ff])([Tt])
F_UNSHIFT=([Uu])([Nn])([Ss])([Hh])([Ii])([Ff])([Tt])
F_SLICE=([Ss])([Ll])([Ii])([Cc])([Ee])
F_SORTED=([Ss])([Oo])([Rr])([Tt])([Ee])([Dd])
F_SORTED_UNIQUE=([Ss])([Oo])([Rr])([Tt])([Ee])([Dd])([_])([Uu])([Nn])([Ii])([Qq])([Uu])([Ee])
F_POSITION=([Pp])([Oo])([Ss])([Ii])([Tt])([Ii])([Oo])([Nn])
F_REVERSE=([Rr])([Ee])([Vv])([Ee])([Rr])([Ss])([Ee])
F_MINUS=([Mm])([Ii])([Nn])([Uu])([Ss])
F_COUNT_DISTINCT=([Cc])([Oo])([Uu])([Nn])([Tt])([_])([Dd])([Ii])([Ss])([Tt])([Ii])([Nn])([Cc])([Tt])
F_COUNT_UNIQUE=([Cc])([Oo])([Uu])([Nn])([Tt])([_])([Uu])([Nn])([Ii])([Qq])([Uu])([Ee])
F_UNIQUE=([Uu])([Nn])([Ii])([Qq])([Uu])([Ee])
NUMBER_INTEGER=[0-9]+
SPACE=[ \t\n\x0B\f\r]+
B_COMMENT="/"\*(.|\n)*\*"/"
L_COMMENT="//".*
TEXT_SINGLE='(''|[^']*)'
TEXT_DOUBLE=\".*\"
ID=[:letter:][a-zA-Z_0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}           { return WHITE_SPACE; }

  "_key"                  { return T_KEY; }
  "_id"                   { return T_ID; }
  "_from"                 { return T_SYS_FROM; }
  "_to"                   { return T_SYS_TO; }
  "@"                     { return T_AT; }
  "true"                  { return T_TRUE; }
  "false"                 { return T_FALSE; }
  "not"                   { return T_NOT; }
  "&&"                    { return T_LOGICAL_AND; }
  "||"                    { return T_OR; }
  "~="                    { return T_REGEX_MATCH; }
  "~!"                    { return T_REGEX_NON_MATCH; }
  "=="                    { return T_EQ; }
  "="                     { return T_IS; }
  "!="                    { return T_NE; }
  "<"                     { return T_LT; }
  ">"                     { return T_GT; }
  "<="                    { return T_LE; }
  ">="                    { return T_GE; }
  "like"                  { return T_LIKE; }
  "+"                     { return T_PLUS; }
  "-"                     { return T_MINUS; }
  "*"                     { return T_TIMES; }
  "/"                     { return T_DIV; }
  "%"                     { return T_MOD; }
  "?"                     { return T_QUESTION; }
  ":"                     { return T_COLON; }
  "::"                    { return T_SCOPE; }
  ".."                    { return T_RANGE; }
  ","                     { return T_COMMA; }
  "("                     { return T_OPEN; }
  ")"                     { return T_CLOSE; }
  "{"                     { return T_OBJECT_OPEN; }
  "}"                     { return T_OBJECT_CLOSE; }
  "["                     { return T_ARRAY_OPEN; }
  "]"                     { return T_ARRAY_CLOSE; }
  "none"                  { return T_NONE; }
  "'"                     { return SINGLE_QUOTE; }
  "\""                    { return DOUBLE_QUOTE; }
  "$"                     { return DOLLAR; }
  "${"                    { return OBJECT_START; }
  "F_OUTERSECTION"        { return F_OUTERSECTION; }
  "T_NIN"                 { return T_NIN; }

  {T_SEARCH}              { return T_SEARCH; }
  {T_PHRASE}              { return T_PHRASE; }
  {T_SHORTEST_PATH}       { return T_SHORTEST_PATH; }
  {T_REPLACE}             { return T_REPLACE; }
  {T_ASC}                 { return T_ASC; }
  {T_AGGREGATE}           { return T_AGGREGATE; }
  {T_FILTER}              { return T_FILTER; }
  {T_DESC}                { return T_DESC; }
  {T_IN}                  { return T_IN; }
  {T_INTO}                { return T_INTO; }
  {T_LIMIT}               { return T_LIMIT; }
  {T_UPDATE}              { return T_UPDATE; }
  {T_SORT}                { return T_SORT; }
  {T_GRAPH}               { return T_GRAPH; }
  {T_FOR}                 { return T_FOR; }
  {T_LET}                 { return T_LET; }
  {T_COLLECT}             { return T_COLLECT; }
  {T_WITH}                { return T_WITH; }
  {T_DISTINCT}            { return T_DISTINCT; }
  {T_RETURN}              { return T_RETURN; }
  {T_UPSERT}              { return T_UPSERT; }
  {T_REMOVE}              { return T_REMOVE; }
  {T_INSERT}              { return T_INSERT; }
  {F_INTERSECTION}        { return F_INTERSECTION; }
  {T_OUTBOUND}            { return T_OUTBOUND; }
  {T_INBOUND}             { return T_INBOUND; }
  {T_ANY}                 { return T_ANY; }
  {T_ALL}                 { return T_ALL; }
  {T_NULL}                { return T_NULL; }
  {T_AND}                 { return T_AND; }
  {F_HAS}                 { return F_HAS; }
  {F_LENGTH}              { return F_LENGTH; }
  {F_COLLECTIONS}         { return F_COLLECTIONS; }
  {F_COUNT}               { return F_COUNT; }
  {F_UNION}               { return F_UNION; }
  {F_UNION_DISTINCT}      { return F_UNION_DISTINCT; }
  {F_FIRST}               { return F_FIRST; }
  {F_LAST}                { return F_LAST; }
  {F_NTH}                 { return F_NTH; }
  {F_REMOVE_NTH}          { return F_REMOVE_NTH; }
  {F_REMOVE_VALUE}        { return F_REMOVE_VALUE; }
  {F_REMOVE_VALUES}       { return F_REMOVE_VALUES; }
  {F_POP}                 { return F_POP; }
  {F_PUSH}                { return F_PUSH; }
  {F_SHIFT}               { return F_SHIFT; }
  {F_UNSHIFT}             { return F_UNSHIFT; }
  {F_SLICE}               { return F_SLICE; }
  {F_SORTED}              { return F_SORTED; }
  {F_SORTED_UNIQUE}       { return F_SORTED_UNIQUE; }
  {F_POSITION}            { return F_POSITION; }
  {F_REVERSE}             { return F_REVERSE; }
  {F_MINUS}               { return F_MINUS; }
  {F_COUNT_DISTINCT}      { return F_COUNT_DISTINCT; }
  {F_COUNT_UNIQUE}        { return F_COUNT_UNIQUE; }
  {F_UNIQUE}              { return F_UNIQUE; }
  {NUMBER_INTEGER}        { return NUMBER_INTEGER; }
  {SPACE}                 { return SPACE; }
  {B_COMMENT}             { return B_COMMENT; }
  {L_COMMENT}             { return L_COMMENT; }
  {TEXT_SINGLE}           { return TEXT_SINGLE; }
  {TEXT_DOUBLE}           { return TEXT_DOUBLE; }
  {ID}                    { return ID; }

}

[^] { return BAD_CHARACTER; }
