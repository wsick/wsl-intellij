// This is a generated file. Not intended for manual editing.
package com.wsick.wsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WslObject extends PsiElement {

  @Nullable
  WslAttrBlock getAttrBlock();

  @Nullable
  WslContentBlock getContentBlock();

  @NotNull
  WslIdentifier getIdentifier();

}
