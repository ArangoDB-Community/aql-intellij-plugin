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
NUMBER_INTEGER=[0-9]+
SPACE=[ \t\n\x0B\f\r]+
B_COMMENT="/"\*(.|\n)*\*"/"
L_COMMENT="//".*
TEXT_SINGLE='.*'
TEXT_DOUBLE=\".*\"
ID=[:letter:][a-zA-Z_0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}          { return WHITE_SPACE; }

  "null"                 { return T_NULL; }
  "true"                 { return T_TRUE; }
  "false"                { return T_FALSE; }
  "not"                  { return T_NOT; }
  "and"                  { return T_AND; }
  "&&"                   { return T_LOGICAL_AND; }
  "or"                   { return T_OR; }
  "not"                  { return T_NIN; }
  "~="                   { return T_REGEX_MATCH; }
  "~!"                   { return T_REGEX_NON_MATCH; }
  "=="                   { return T_EQ; }
  "="                    { return T_IS; }
  "!="                   { return T_NE; }
  "<"                    { return T_LT; }
  ">"                    { return T_GT; }
  "<="                   { return T_LE; }
  ">="                   { return T_GE; }
  "like"                 { return T_LIKE; }
  "+"                    { return T_PLUS; }
  "-"                    { return T_MINUS; }
  "*"                    { return T_TIMES; }
  "/"                    { return T_DIV; }
  "%"                    { return T_MOD; }
  "?"                    { return T_QUESTION; }
  ":"                    { return T_COLON; }
  "::"                   { return T_SCOPE; }
  ".."                   { return T_RANGE; }
  ","                    { return T_COMMA; }
  "("                    { return T_OPEN; }
  ")"                    { return T_CLOSE; }
  "{"                    { return T_OBJECT_OPEN; }
  "}"                    { return T_OBJECT_CLOSE; }
  "["                    { return T_ARRAY_OPEN; }
  "]"                    { return T_ARRAY_CLOSE; }
  "outbound"             { return T_OUTBOUND; }
  "inbound"              { return T_INBOUND; }
  "any"                  { return T_ANY; }
  "all"                  { return T_ALL; }
  "none"                 { return T_NONE; }
  "'"                    { return SINGLE_QUOTE; }
  "\""                   { return DOUBLE_QUOTE; }
  "$"                    { return DOLLAR; }

  {T_SEARCH}             { return T_SEARCH; }
  {T_PHRASE}             { return T_PHRASE; }
  {T_SHORTEST_PATH}      { return T_SHORTEST_PATH; }
  {T_REPLACE}            { return T_REPLACE; }
  {T_ASC}                { return T_ASC; }
  {T_AGGREGATE}          { return T_AGGREGATE; }
  {T_FILTER}             { return T_FILTER; }
  {T_DESC}               { return T_DESC; }
  {T_IN}                 { return T_IN; }
  {T_INTO}               { return T_INTO; }
  {T_LIMIT}              { return T_LIMIT; }
  {T_UPDATE}             { return T_UPDATE; }
  {T_SORT}               { return T_SORT; }
  {T_GRAPH}              { return T_GRAPH; }
  {T_FOR}                { return T_FOR; }
  {T_LET}                { return T_LET; }
  {T_COLLECT}            { return T_COLLECT; }
  {T_WITH}               { return T_WITH; }
  {T_DISTINCT}           { return T_DISTINCT; }
  {T_RETURN}             { return T_RETURN; }
  {T_UPSERT}             { return T_UPSERT; }
  {T_REMOVE}             { return T_REMOVE; }
  {T_INSERT}             { return T_INSERT; }
  {NUMBER_INTEGER}       { return NUMBER_INTEGER; }
  {SPACE}                { return SPACE; }
  {B_COMMENT}            { return B_COMMENT; }
  {L_COMMENT}            { return L_COMMENT; }
  {TEXT_SINGLE}          { return TEXT_SINGLE; }
  {TEXT_DOUBLE}          { return TEXT_DOUBLE; }
  {ID}                   { return ID; }

}

[^] { return BAD_CHARACTER; }
