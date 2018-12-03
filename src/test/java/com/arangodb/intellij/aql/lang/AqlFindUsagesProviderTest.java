package com.arangodb.intellij.aql.lang;

/*
import com.intellij.codeInsight.CodeInsightTestCase;
import com.intellij.ide.startup.impl.StartupManagerImpl;

import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.lang.findUsages.LanguageFindUsages;
import com.intellij.openapi.startup.StartupManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.searches.ReferencesSearch;
import com.intellij.psi.util.PsiTreeUtil;



public class AqlFindUsagesProviderTest extends CodeInsightTestCase {

    private static final String BASE_PATH = "/findUsages/";

    public void testFindUsages() throws Exception {

        configureByFile(BASE_PATH + "findUsages.aql", BASE_PATH);
        init();

        final PsiReference[] references = findReferences();
        assertEquals(2, references.length);

    }

    private PsiReference[] findReferences() {
        final PsiNamedElement namedElement = getElementAtCaret();
        GlobalSearchScope searchScope = GlobalSearchScope.allScope(myProject);
        return ReferencesSearch.search(namedElement, searchScope, false).toArray(PsiReference.EMPTY_ARRAY);
    }

    private PsiNamedElement getElementAtCaret() {
        PsiElement element = myFile.findElementAt(myEditor.getCaretModel().getOffset());
        PsiNamedElement namedElement = PsiTreeUtil.getParentOfType(element, PsiNamedElement.class);
        final LanguageFindUsages instance = LanguageFindUsages.INSTANCE;
        final FindUsagesProvider single = instance.findSingle(AqlLanguage.AQL_LANGUAGE);
        assertTrue("Cannot find element at caret", single.canFindUsagesFor(namedElement));
        return namedElement;
    }

    private void init() {
        ((StartupManagerImpl) StartupManager.getInstance(myProject)).runPostStartupActivities();
    }
}

*/
