// This is a generated file. Not intended for manual editing.
package com.wsick.wsl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WslValue extends PsiElement {

  @Nullable
  WslExtension getExtension();

  @Nullable
  WslNumber getNumber();

  @Nullable
  WslObject getObject();

  @Nullable
  PsiElement getString();

}
