package com.wsick.wsl.psi;

import com.intellij.psi.tree.IElementType;
import com.wsick.wsl.WslLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class WslElementType extends IElementType {
    public WslElementType(@NotNull @NonNls String debugName) {
        super(debugName, WslLanguage.INSTANCE);
    }
}
