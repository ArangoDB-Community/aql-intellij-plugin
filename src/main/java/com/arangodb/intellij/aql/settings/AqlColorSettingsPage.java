package com.arangodb.intellij.aql.settings;

import com.arangodb.intellij.aql.lang.AqlSyntaxColors;
import com.arangodb.intellij.aql.lang.AqlSyntaxHighlighter;
import com.arangodb.intellij.aql.util.AqlConst;
import com.arangodb.intellij.aql.util.Icons;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class AqlColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Line comment", AqlSyntaxColors.LINE_COMMENT),
            new AttributesDescriptor("Block comment", AqlSyntaxColors.BLOCK_COMMENT),
            new AttributesDescriptor("Keyword", AqlSyntaxColors.KEYWORD),
            new AttributesDescriptor("Variable", AqlSyntaxColors.VARIABLE_PLACE_HOLDER),
            new AttributesDescriptor("Parameter", AqlSyntaxColors.PARAMETER),
            new AttributesDescriptor("Function", AqlSyntaxColors.FUNCTION),
            new AttributesDescriptor("Operation sign", AqlSyntaxColors.OPERATION_SIGN),
            new AttributesDescriptor("Parentheses", AqlSyntaxColors.PARENTHESES),
            new AttributesDescriptor("Braces", AqlSyntaxColors.SQUARE_BRACES),
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
        return "/* ccc*/\n" +
                "\n" +
                "/**\n" +
                "* block comment\n" +
                "*/\n" +
                "// single line comment\n" +
                "LET isNotify = (FOR doc IN config\n" +
                "\t\t\tFILTER doc.id=='notify'\n" +
                "\t\t\tRETURN doc.value)\n" +
                "\t\tLET promotionsBefore = (\n" +
                "\n" +
                "\t\t\t\tFOR doc1 IN promotions\n" +
                "\t\t\t\t\tFILTER doc1.watched ANY == ${userId} && doc1.active==true && doc1.weekdays ANY == ${weekday}\n" +
                "\t\t\t\t\t&& doc1.startdate <= ${myData} && doc1.finishdate >= ${myData}\n" +
                "\t\t\t\t\tRETURN doc1.id_beonit)\n" +
                "\t\tLET beaconsBefore = (\n" +
                "\t\t\t\tFOR doc1 IN accesspoints\n" +
                "\n" +
                "\t\t\t\t    FILTER POSITION(doc1.users, ${userId}) && doc1.startdate <= ${myData} && doc1.finishdate >= ${myData}\n" +
                "\t\t\tRETURN doc1.id_beonit)\n" +
                "\t\tLET apList = (\n" +
                "\n" +
                "\t\t\t\t\tFOR doc IN accesspoints\n" +
                "\t\t\t\t\tFILTER doc.accesspoint_id == ${minor} && doc.type == \"beacon\"\n" +
                "\t\t\t\t\tRETURN doc.id_beonit)\n" +
                "\t    LET apUpdate = (\n" +
                "\t        FOR doc IN accesspoints\n" +
                "\t\t        FOR ap IN apList\n" +
                "\t\t\t        FILTER doc.id_beonit == ap && doc.startdate <= ${myData} && doc.finishdate >= @myData\n" +
                "\t\t\t            UPDATE\n" +
                "\t\t                doc WITH {'users':PUSH(doc.users, ${userId},true)} IN accesspoints\n" +
                "\t\t                    RETURN NEW.id_beonit)\n" +
                "\t\tLET promotionsList = (\n" +
                "\t\t    FOR doc IN promotions\n" +
                "\n" +
                "\t\t     FOR acp IN doc.accesspoints\n" +
                "\t\t        FILTER acp IN apList && doc.id_beonit != NULL\n" +
                "\t\t          RETURN doc.id_beonit)\n" +
                "\t\tLET promotionsUpdate = (FOR doc IN promotions\n" +
                "\t\t   FOR pl IN promotionsList\n" +
                "\t\t\tFILTER doc.id_beonit==pl && doc.active==true && doc.weekdays ANY == ${weekday} && doc.startdate <= ${myData} && doc.finishdate >= ${myData}\n" +
                "\t\t\tUPDATE\n" +
                "\t\tdoc WITH {'watched':PUSH(doc.watched, ${userId},true)} IN promotions\n" +
                "\t\tRETURN NEW.id_beonit)\n" +
                "\t\tINSERT ${req.body} INTO tracking\n" +
                "\t\tRETURN {'notificationsActive': isNotify[0],'unchangedPromotions': promotionsUpdate ALL IN promotionsBefore, 'unchangedBeacons': apUpdate ALL IN beaconsBefore}\n"
                ;
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
        return AqlConst.AQL_LANGUAGE_ID;
    }
}
