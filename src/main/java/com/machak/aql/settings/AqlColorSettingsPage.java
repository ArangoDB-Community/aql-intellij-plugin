package com.machak.aql.settings;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.machak.aql.lang.AqlSyntaxColors;
import com.machak.aql.lang.AqlSyntaxHighlighter;
import com.machak.aql.util.Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class AqlColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Line comment", AqlSyntaxColors.LINE_COMMENT),
            new AttributesDescriptor("Block comment", AqlSyntaxColors.BLOCK_COMMENT),
            new AttributesDescriptor("Keyword", AqlSyntaxColors.KEYWORD),
            new AttributesDescriptor("Variable", AqlSyntaxColors.VARIABLE),
            new AttributesDescriptor("Parameter", AqlSyntaxColors.PARAMETER),
            new AttributesDescriptor("Function", AqlSyntaxColors.FUNCTION),
            new AttributesDescriptor("Operation sign", AqlSyntaxColors.OPERATION_SIGN),
            new AttributesDescriptor("Parentheses", AqlSyntaxColors.PARENTHESES),
            new AttributesDescriptor("Square braces", AqlSyntaxColors.SQUARE_BRACES),
            new AttributesDescriptor("Comma", AqlSyntaxColors.COMMA),
            new AttributesDescriptor("Dot", AqlSyntaxColors.DOT),
            new AttributesDescriptor("String", AqlSyntaxColors.STRING),
            new AttributesDescriptor("Number", AqlSyntaxColors.NUMBER)};

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.ICON_ARANGO_SMALL;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new AqlSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "FOR doc IN viewScales SEARCH PHRASE(doc.name,'A','text_en')\n" +
                "FILTER doc.key =='A'\n" +
                "SORT doc.score DESC\n" +
                "LIMIT 320,10 RETURN doc\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Aql";
    }
}
