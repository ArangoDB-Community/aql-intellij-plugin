package com.machak.aql.lang.psi;

import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.machak.aql.util.Icons;
import org.jetbrains.annotations.NotNull;

public class AqlPropertyParameterReference extends AqlPsiReference {


    public AqlPropertyParameterReference(final PsiElement element, final TextRange rangeInElement) {
        super(element, rangeInElement);
    }


    @NotNull
    @Override
    public Object[] getVariants() {

        return findAll(myElement.getProject()).stream()
                .map(name -> LookupElementBuilder
                        .create(name)
                        .withIcon(Icons.ICON_PLACEHOLDER)
                        .withTypeText("placeholder " + name + "()")
                        .bold()
                )
                .toArray(Object[]::new);
    }


}
