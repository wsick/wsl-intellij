package com.wsick.wsl;

import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.*;
import com.wsick.wsl.parser.WslParser;
import com.wsick.wsl.psi.*;
import org.jetbrains.annotations.NotNull;

import static com.wsick.wsl.psi.WslTypes.*;

public class WslParserDefinition implements ParserDefinition {
    public static final TokenSet WHITESPACES = TokenSet.create(WHITESPACE);
    public static final TokenSet NUMBERS = TokenSet.create(INT, FLOAT, HEX, OCT);
    public static final TokenSet STRING_LITERALS = TokenSet.create(STRING);

    public static final IFileElementType FILE = new IFileElementType(WslLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new WslLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new WslParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITESPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRING_LITERALS;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return WslTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new WslFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
