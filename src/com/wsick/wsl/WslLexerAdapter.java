package com.wsick.wsl;

import com.intellij.lexer.FlexAdapter;
import java.io.Reader;

public class WslLexerAdapter extends FlexAdapter {
    public WslLexerAdapter() {
        super(new _WslLexer((Reader)null));
    }
}
