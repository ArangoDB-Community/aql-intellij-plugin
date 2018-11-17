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

FOR=([Ff])([Oo])([Rr])
ASC=([Aa])([Aa])([Cc])
DESC=([Dd])([Es])([Ss])([Cc])
IN=([Ii])([Nn])
RETURN=([Rr])([Ee])([Tt])([Uu])([Rr])([Nn])
SPACE=[ \t\n\x0B\f\r]+
COMMENT="//".*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"
ID=[:letter:][a-zA-Z_0-9]*
PROPERTID=[a-zA-Z_$0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "="                  { return OP_EQ; }
  "::="                { return OP_IS; }
  "|"                  { return OP_OR; }
  "?"                  { return OP_OPT; }
  "+"                  { return OP_ONEMORE; }
  "*"                  { return OP_ZEROMORE; }
  "&"                  { return OP_AND; }
  "!"                  { return OP_NOT; }
  ";"                  { return SEMICOLON; }
  "{"                  { return LEFT_BRACE; }
  "}"                  { return RIGHT_BRACE; }
  "["                  { return LEFT_BRACKET; }
  "]"                  { return RIGHT_BRACKET; }
  "("                  { return LEFT_PAREN; }
  ")"                  { return RIGHT_PAREN; }

  {FOR}                { return FOR; }
  {ASC}                { return ASC; }
  {DESC}               { return DESC; }
  {IN}                 { return IN; }
  {RETURN}             { return RETURN; }
  {SPACE}              { return SPACE; }
  {COMMENT}            { return COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
  {ID}                 { return ID; }
  {PROPERTID}          { return PROPERTID; }

}

[^] { return BAD_CHARACTER; }
