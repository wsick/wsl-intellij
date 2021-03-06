package com.wsick.wsl;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class WslFile extends PsiFileBase {
    public WslFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, WslLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return WslFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
