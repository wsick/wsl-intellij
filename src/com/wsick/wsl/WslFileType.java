package com.wsick.wsl;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class WslFileType extends LanguageFileType {
    public static final WslFileType INSTANCE = new WslFileType();

    private WslFileType() {
        super(WslLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "WSL";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "WickedSick Language";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "wsl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return WslIcons.FILE;
    }
}
