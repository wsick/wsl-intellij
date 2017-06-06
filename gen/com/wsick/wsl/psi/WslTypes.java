// This is a generated file. Not intended for manual editing.
package com.wsick.wsl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.wsick.wsl.psi.impl.*;

public interface WslTypes {

  IElementType ATTR = new WslElementType("ATTR");
  IElementType ATTR_BLOCK = new WslElementType("ATTR_BLOCK");
  IElementType ATTR_KEY = new WslElementType("ATTR_KEY");
  IElementType ATTR_SET = new WslElementType("ATTR_SET");
  IElementType CONTENT = new WslElementType("CONTENT");
  IElementType CONTENT_BLOCK = new WslElementType("CONTENT_BLOCK");
  IElementType EXTENSION = new WslElementType("EXTENSION");
  IElementType IDENTIFIER = new WslElementType("IDENTIFIER");
  IElementType LOCATOR = new WslElementType("LOCATOR");
  IElementType NS_ALIAS = new WslElementType("NS_ALIAS");
  IElementType NUMBER = new WslElementType("NUMBER");
  IElementType OBJECT = new WslElementType("OBJECT");
  IElementType VALUE = new WslElementType("VALUE");

  IElementType ALIAS = new WslTokenType(":");
  IElementType DOT = new WslTokenType(".");
  IElementType EQUALS = new WslTokenType("=");
  IElementType EVENT = new WslTokenType("@");
  IElementType FLOAT = new WslTokenType("float");
  IElementType HEX = new WslTokenType("hex");
  IElementType INT = new WslTokenType("int");
  IElementType LATTR = new WslTokenType("[");
  IElementType LCONT = new WslTokenType("{");
  IElementType LEXT = new WslTokenType("{{");
  IElementType OCT = new WslTokenType("oct");
  IElementType RATTR = new WslTokenType("]");
  IElementType RCONT = new WslTokenType("}");
  IElementType REXT = new WslTokenType("}}");
  IElementType STRING = new WslTokenType("string");
  IElementType WHITESPACE = new WslTokenType("whitespace");
  IElementType WORD = new WslTokenType("word");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ATTR) {
        return new WslAttrImpl(node);
      }
      else if (type == ATTR_BLOCK) {
        return new WslAttrBlockImpl(node);
      }
      else if (type == ATTR_KEY) {
        return new WslAttrKeyImpl(node);
      }
      else if (type == ATTR_SET) {
        return new WslAttrSetImpl(node);
      }
      else if (type == CONTENT) {
        return new WslContentImpl(node);
      }
      else if (type == CONTENT_BLOCK) {
        return new WslContentBlockImpl(node);
      }
      else if (type == EXTENSION) {
        return new WslExtensionImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new WslIdentifierImpl(node);
      }
      else if (type == LOCATOR) {
        return new WslLocatorImpl(node);
      }
      else if (type == NS_ALIAS) {
        return new WslNsAliasImpl(node);
      }
      else if (type == NUMBER) {
        return new WslNumberImpl(node);
      }
      else if (type == OBJECT) {
        return new WslObjectImpl(node);
      }
      else if (type == VALUE) {
        return new WslValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
