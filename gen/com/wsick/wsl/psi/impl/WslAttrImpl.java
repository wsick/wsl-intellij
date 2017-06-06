// This is a generated file. Not intended for manual editing.
package com.wsick.wsl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.wsick.wsl.psi.WslTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.wsick.wsl.psi.*;

public class WslAttrImpl extends ASTWrapperPsiElement implements WslAttr {

  public WslAttrImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WslVisitor visitor) {
    visitor.visitAttr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WslVisitor) accept((WslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WslAttrKey getAttrKey() {
    return findNotNullChildByClass(WslAttrKey.class);
  }

  @Override
  @Nullable
  public WslAttrSet getAttrSet() {
    return findChildByClass(WslAttrSet.class);
  }

  @Override
  @Nullable
  public WslContentBlock getContentBlock() {
    return findChildByClass(WslContentBlock.class);
  }

}
