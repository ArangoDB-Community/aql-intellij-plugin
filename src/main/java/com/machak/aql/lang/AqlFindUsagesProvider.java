package com.machak.aql.lang;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.lang.HelpID;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.machak.aql.grammar.psi.AqlPsiNamedIdentifier;

public class AqlFindUsagesProvider implements FindUsagesProvider {
    @Nullable
    @Override
    public WordsScanner getWordsScanner() {
        return new AqlWordsScanner();
    }

    @Override
    public boolean canFindUsagesFor(@NotNull final PsiElement psiElement) {
        return psiElement instanceof PsiNamedElement;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull final PsiElement psiElement) {
        return HelpID.FIND_OTHER_USAGES;
    }

    @NotNull
    @Override
    public String getType(@NotNull final PsiElement element) {
        final String name = extractName(element);
        if (name != null) {
            return name;
        }
        return "";
    }

    @Nullable
    private String extractName(@NotNull final PsiElement element) {
        if (element instanceof AqlPsiNamedIdentifier) {
            final String name = ((AqlPsiNamedIdentifier) element).getName();
            if (name == null) {
                return "";
            }
            return name;
        }
        return null;
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull final PsiElement element) {
        final String name = extractName(element);
        if (name != null) {
            return name;
        }
        return "";
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull final PsiElement element, final boolean useFullName) {
        return getDescriptiveName(element);
        
    }
}
