// This is a generated file. Not intended for manual editing.
package com.wsick.wsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WslIdentifier extends PsiElement {

  @Nullable
  WslLocator getLocator();

  @Nullable
  WslNsAlias getNsAlias();

  @NotNull
  PsiElement getWord();

}
