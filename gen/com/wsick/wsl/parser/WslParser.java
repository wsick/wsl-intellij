// This is a generated file. Not intended for manual editing.
package com.wsick.wsl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.wsick.wsl.psi.WslTypes.*;
import static com.wsick.wsl.parser.WslParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class WslParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ATTR) {
      r = attr(b, 0);
    }
    else if (t == ATTR_BLOCK) {
      r = attr_block(b, 0);
    }
    else if (t == ATTR_KEY) {
      r = attr_key(b, 0);
    }
    else if (t == ATTR_SET) {
      r = attr_set(b, 0);
    }
    else if (t == CONTENT) {
      r = content(b, 0);
    }
    else if (t == CONTENT_BLOCK) {
      r = content_block(b, 0);
    }
    else if (t == EXTENSION) {
      r = extension(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = identifier(b, 0);
    }
    else if (t == LOCATOR) {
      r = locator(b, 0);
    }
    else if (t == NS_ALIAS) {
      r = ns_alias(b, 0);
    }
    else if (t == NUMBER) {
      r = number(b, 0);
    }
    else if (t == OBJECT) {
      r = object(b, 0);
    }
    else if (t == VALUE) {
      r = value(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return File(b, l + 1);
  }

  /* ********************************************************** */
  // (object)*
  static boolean File(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File")) return false;
    int c = current_position_(b);
    while (true) {
      if (!File_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "File", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (object)
  private static boolean File_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ whitespace ] attr_key [ whitespace ] (attr_set | content_block)
  public static boolean attr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTR, "<attr>");
    r = attr_0(b, l + 1);
    r = r && attr_key(b, l + 1);
    r = r && attr_2(b, l + 1);
    r = r && attr_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ whitespace ]
  private static boolean attr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // [ whitespace ]
  private static boolean attr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // attr_set | content_block
  private static boolean attr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attr_set(b, l + 1);
    if (!r) r = content_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ whitespace ] LATTR (attr)* [ whitespace ] RATTR
  public static boolean attr_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_block")) return false;
    if (!nextTokenIs(b, "<attr block>", LATTR, WHITESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTR_BLOCK, "<attr block>");
    r = attr_block_0(b, l + 1);
    r = r && consumeToken(b, LATTR);
    r = r && attr_block_2(b, l + 1);
    r = r && attr_block_3(b, l + 1);
    r = r && consumeToken(b, RATTR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ whitespace ]
  private static boolean attr_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_block_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (attr)*
  private static boolean attr_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_block_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!attr_block_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attr_block_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (attr)
  private static boolean attr_block_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_block_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ whitespace ]
  private static boolean attr_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_block_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // [ EVENT ] identifier
  public static boolean attr_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTR_KEY, "<attr key>");
    r = attr_key_0(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ EVENT ]
  private static boolean attr_key_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_key_0")) return false;
    consumeToken(b, EVENT);
    return true;
  }

  /* ********************************************************** */
  // '=' [ whitespace ] value
  public static boolean attr_set(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_set")) return false;
    if (!nextTokenIs(b, EQUALS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && attr_set_1(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, ATTR_SET, r);
    return r;
  }

  // [ whitespace ]
  private static boolean attr_set_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_set_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // [ whitespace ] value
  public static boolean content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTENT, "<content>");
    r = content_0(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ whitespace ]
  private static boolean content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // [ whitespace ] LCONT (content)* [ whitespace ] RCONT
  public static boolean content_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_block")) return false;
    if (!nextTokenIs(b, "<content block>", LCONT, WHITESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTENT_BLOCK, "<content block>");
    r = content_block_0(b, l + 1);
    r = r && consumeToken(b, LCONT);
    r = r && content_block_2(b, l + 1);
    r = r && content_block_3(b, l + 1);
    r = r && consumeToken(b, RCONT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ whitespace ]
  private static boolean content_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_block_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (content)*
  private static boolean content_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_block_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!content_block_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "content_block_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (content)
  private static boolean content_block_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_block_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = content(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ whitespace ]
  private static boolean content_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_block_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // LEXT REXT
  public static boolean extension(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension")) return false;
    if (!nextTokenIs(b, LEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEXT, REXT);
    exit_section_(b, m, EXTENSION, r);
    return r;
  }

  /* ********************************************************** */
  // [ ns_alias ] [ locator ] word
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = identifier_0(b, l + 1);
    r = r && identifier_1(b, l + 1);
    r = r && consumeToken(b, WORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ns_alias ]
  private static boolean identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_0")) return false;
    ns_alias(b, l + 1);
    return true;
  }

  // [ locator ]
  private static boolean identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1")) return false;
    locator(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [ word ] DOT
  public static boolean locator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "locator")) return false;
    if (!nextTokenIs(b, "<locator>", DOT, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCATOR, "<locator>");
    r = locator_0(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ word ]
  private static boolean locator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "locator_0")) return false;
    consumeToken(b, WORD);
    return true;
  }

  /* ********************************************************** */
  // [ word ] ALIAS
  public static boolean ns_alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ns_alias")) return false;
    if (!nextTokenIs(b, "<ns alias>", ALIAS, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NS_ALIAS, "<ns alias>");
    r = ns_alias_0(b, l + 1);
    r = r && consumeToken(b, ALIAS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ word ]
  private static boolean ns_alias_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ns_alias_0")) return false;
    consumeToken(b, WORD);
    return true;
  }

  /* ********************************************************** */
  // int | float | hex | oct
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER, "<number>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, HEX);
    if (!r) r = consumeToken(b, OCT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier [ attr_block ] [ content_block ]
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT, "<object>");
    r = identifier(b, l + 1);
    r = r && object_1(b, l + 1);
    r = r && object_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ attr_block ]
  private static boolean object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1")) return false;
    attr_block(b, l + 1);
    return true;
  }

  // [ content_block ]
  private static boolean object_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_2")) return false;
    content_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // object | number | string | extension
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = object(b, l + 1);
    if (!r) r = number(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = extension(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
