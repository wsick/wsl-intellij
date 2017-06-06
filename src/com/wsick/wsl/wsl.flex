package com.wsick.wsl;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.wsick.wsl.psi.WslTypes.*;

%%

%{
  public _WslLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _WslLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

WHITESPACE=[ \t\n\x0B\f\r]+
WORD=[:letter:]([a-zA-Z_0-9]|-)*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
INT=0|([1-9][0-9]*)
FLOAT=((([0-9]+\.[0-9]*)|([0-9]*\.[0-9]+))([eE][+-]?[0-9]+)?)|([0-9]+([eE][+-]?[0-9]+))
HEX=(0x|0X)[0-9A-Fa-f]+
OCT=0[0-7]+

%%
<YYINITIAL> {
  "["                { return LATTR; }
  "]"                { return RATTR; }
  "{"                { return LCONT; }
  "}"                { return RCONT; }
  "{{"               { return LEXT; }
  "}}"               { return REXT; }
  "="                { return EQUALS; }
  "@"                { return EVENT; }
  ":"                { return ALIAS; }
  "."                { return DOT; }

  {WHITESPACE}       { return WHITESPACE; }
  {WORD}             { return WORD; }
  {STRING}           { return STRING; }
  {INT}              { return INT; }
  {FLOAT}            { return FLOAT; }
  {HEX}              { return HEX; }
  {OCT}              { return OCT; }

}

[^] { return BAD_CHARACTER; }
