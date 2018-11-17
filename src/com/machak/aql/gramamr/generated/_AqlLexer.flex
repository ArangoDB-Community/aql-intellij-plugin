package com.machak.aql.gramamr.generated;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static generated.GeneratedTypes.*;

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

SPACE=[ \t\n\x0B\f\r]+
COMMENT="//".*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"
NUMBER=[0-9]+(\.[0-9]*)?
ID=[:letter:][a-zA-Z_0-9]*

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
  "<<"                 { return EXTERNAL_START; }
  ">>"                 { return EXTERNAL_END; }
  "FOR"                { return FOR; }
  "IN"                 { return IN; }
  "RETURN"             { return RETURN; }

  {SPACE}              { return SPACE; }
  {COMMENT}            { return COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
  {NUMBER}             { return NUMBER; }
  {ID}                 { return ID; }

}

[^] { return BAD_CHARACTER; }
