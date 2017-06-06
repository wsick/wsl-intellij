package com.wsick.wsl.psi;

import com.intellij.psi.tree.IElementType;
import com.wsick.wsl.WslLanguage;
import org.jetbrains.annotations.NotNull;

public class WslTokenType extends IElementType {
    public WslTokenType(@NotNull String debugName) {
        super(debugName, WslLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "WslTokenType." + super.toString();
    }
}
