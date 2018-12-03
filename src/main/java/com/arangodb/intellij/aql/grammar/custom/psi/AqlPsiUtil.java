package com.arangodb.intellij.aql.grammar.custom.psi;

import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlIdMixin;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlNamedFunctionMixin;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlSystemPropertyMixin;
import com.arangodb.intellij.aql.util.Icons;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.impl.PsiImplUtil;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class AqlPsiUtil {
    private AqlPsiUtil() {
    }

    public static ItemPresentation getPresentation(final AqlNamedElement element) {
        return new ItemPresentation() {
            @NotNull
            @Override
            public String getPresentableText() {
                return element.getAqlType().name();
            }

            @NotNull
            @Override
            public String getLocationString() {
                return element.getContainingFile().getName();
            }

            @NotNull
            @Override
            public Icon getIcon(boolean unused) {
                if (element instanceof AqlNamedFunctionMixin) {
                    return Icons.ICON_FUNCTION;
                } else if (element instanceof AqlIdMixin) {
                    return Icons.ICON_ID;
                } else if (element instanceof AqlSystemPropertyMixin) {
                    return Icons.ICON_PROPERTY;
                }
                return Icons.ICON_ARANGO_SMALL;
            }
        };
    }

    //############################################
    // BNF used methods
    //############################################
    public static String getName(final AqlNamedElement element) {
        return element.getText();
    }

    public static String getFunctionName(final AqlNamedElement element) {
        final String name = element.getText();
        final int idx = name.indexOf('(');
        if (idx > 0) {
            return name.substring(0, idx);
        }
        return name;
    }

    public static AqlNamedElement setName(final AqlNamedElement element, final String newName) {
        PsiImplUtil.setName(element, newName);
        return element;
    }

}
