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

public class WslNumberImpl extends ASTWrapperPsiElement implements WslNumber {

  public WslNumberImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WslVisitor visitor) {
    visitor.visitNumber(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WslVisitor) accept((WslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getFloat() {
    return findChildByType(FLOAT);
  }

  @Override
  @Nullable
  public PsiElement getHex() {
    return findChildByType(HEX);
  }

  @Override
  @Nullable
  public PsiElement getInt() {
    return findChildByType(INT);
  }

  @Override
  @Nullable
  public PsiElement getOct() {
    return findChildByType(OCT);
  }

}
