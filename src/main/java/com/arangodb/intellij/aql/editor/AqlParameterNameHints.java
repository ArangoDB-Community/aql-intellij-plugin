package com.arangodb.intellij.aql.editor;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlNamedFunctions;
import com.arangodb.intellij.aql.intentions.AqlLanguageBundle;
import com.intellij.codeInsight.hints.HintInfo;
import com.intellij.codeInsight.hints.InlayInfo;
import com.intellij.codeInsight.hints.InlayParameterHintsProvider;
import com.intellij.codeInsight.hints.Option;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;
import java.util.Set;

// TODO implement
public class AqlParameterNameHints implements InlayParameterHintsProvider {

    private static final String HINTS_NON_LITERALS = "aql.paramHints.nonLiterals";
    private static final Option OPTION_HINTS_NON_LITERALS = new Option(HINTS_NON_LITERALS, AqlLanguageBundle.message(HINTS_NON_LITERALS), false);

    @NotNull
    @Override
    public List<InlayInfo> getParameterHints(PsiElement element) {
        if (element instanceof AqlNamedFunctions) {
            return getParameters((AqlNamedFunctions) element);
        } else {
            return Collections.emptyList();
        }
    }

    @Nullable
    @Override
    public HintInfo getHintInfo(PsiElement psiElement) {
        return null;
    }

    @NotNull
    @Override
    public Set<String> getDefaultBlackList() {
        return Collections.emptySet();
    }

    @NotNull
    @Override
    public List<Option> getSupportedOptions() {
        return Collections.singletonList(OPTION_HINTS_NON_LITERALS);
    }

    @Override
    public boolean isBlackListSupported() {
        return false;
    }

    private List<InlayInfo> getParameters(AqlNamedFunctions functions) {
        return Collections.emptyList();
    }


}
