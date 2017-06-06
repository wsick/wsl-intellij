package com.wsick.wsl;

import com.intellij.lang.Language;

public class WslLanguage extends Language {
    public static final WslLanguage INSTANCE = new WslLanguage();

    private WslLanguage() {
        super("wsl");
    }
}
