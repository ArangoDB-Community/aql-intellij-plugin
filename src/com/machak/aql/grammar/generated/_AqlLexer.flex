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

ASC=([Aa])([Aa])([Cc])
DESC=([Dd])([Es])([Ss])([Cc])
FILTER=([Ff])([Ii])([Ll])([Tt])([Ee])([Rr])
FOR=([Ff])([Oo])([Rr])
IN=([Ii])([Nn])
LET=([Ll])([Ee])([Tt])
LIMIT=([Ll])([Ii])([Mm])([Ii])([Tt])
RETURN=([Rr])([Ee])([Tt])([Uu])([Rr])([Nn])
SORT=([Ss])([Oo])([Rr])([Tt])
NUMBER_INTEGER=[0-9]+
SPACE=[ \t\n\x0B\f\r]+
B_COMMENT="/"\*(.|\n)*\*"/"
L_COMMENT="//".*
ID=[:letter:][a-zA-Z_0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "="                   { return OP_EQ; }
  "::="                 { return OP_IS; }
  "|"                   { return OP_OR; }
  "?"                   { return OP_OPT; }
  "+"                   { return OP_ONEMORE; }
  "*"                   { return OP_ZEROMORE; }
  "&"                   { return OP_AND; }
  "!"                   { return OP_NOT; }
  ";"                   { return SEMICOLON; }
  "{"                   { return LEFT_BRACE; }
  "}"                   { return RIGHT_BRACE; }
  "["                   { return LEFT_BRACKET; }
  "]"                   { return RIGHT_BRACKET; }
  "("                   { return LEFT_PAREN; }
  ")"                   { return RIGHT_PAREN; }
  "'"                   { return SINGLE_QUOTE; }
  "\""                  { return DOUBLE_QUOTE; }

  {ASC}                 { return ASC; }
  {DESC}                { return DESC; }
  {FILTER}              { return FILTER; }
  {FOR}                 { return FOR; }
  {IN}                  { return IN; }
  {LET}                 { return LET; }
  {LIMIT}               { return LIMIT; }
  {RETURN}              { return RETURN; }
  {SORT}                { return SORT; }
  {NUMBER_INTEGER}      { return NUMBER_INTEGER; }
  {SPACE}               { return SPACE; }
  {B_COMMENT}           { return B_COMMENT; }
  {L_COMMENT}           { return L_COMMENT; }
  {ID}                  { return ID; }

}

[^] { return BAD_CHARACTER; }
