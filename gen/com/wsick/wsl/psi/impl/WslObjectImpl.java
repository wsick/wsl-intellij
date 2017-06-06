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

public class WslObjectImpl extends ASTWrapperPsiElement implements WslObject {

  public WslObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WslVisitor visitor) {
    visitor.visitObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WslVisitor) accept((WslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WslAttrBlock getAttrBlock() {
    return findChildByClass(WslAttrBlock.class);
  }

  @Override
  @Nullable
  public WslContentBlock getContentBlock() {
    return findChildByClass(WslContentBlock.class);
  }

  @Override
  @NotNull
  public WslIdentifier getIdentifier() {
    return findNotNullChildByClass(WslIdentifier.class);
  }

}
