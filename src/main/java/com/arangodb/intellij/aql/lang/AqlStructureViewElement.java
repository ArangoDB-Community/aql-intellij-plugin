package com.arangodb.intellij.aql.lang;

import com.arangodb.intellij.aql.file.AqlFile;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.intellij.ide.projectView.PresentationData;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AqlStructureViewElement implements  StructureViewTreeElement, SortableTreeElement {
    private NavigatablePsiElement element;
    public AqlStructureViewElement(NavigatablePsiElement element) {
        this.element = element;
    }

    @Override
    public Object getValue() {
        return element;
    }

    @Override
    public void navigate(boolean requestFocus) {
        element.navigate(requestFocus);
    }

    @Override
    public boolean canNavigate() {
        return element.canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return element.canNavigateToSource();
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        final String name = element.getName();
        return name != null ? name : "";
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        final ItemPresentation presentation = element.getPresentation();
        return presentation != null ? presentation : new PresentationData();
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        if (element instanceof AqlFile) {
            final AqlNamedElement[] elements = PsiTreeUtil.getChildrenOfType(element, AqlNamedElement.class);
            if (elements == null) {
                return EMPTY_ARRAY;
            }
            final List<TreeElement> treeElements = new ArrayList<>(elements.length);
            for (AqlNamedElement element : elements) {
                treeElements.add(new AqlStructureViewElement(element));
            }
            return treeElements.toArray(new TreeElement[treeElements.size()]);
        } else {
            return EMPTY_ARRAY;
        }
    }
}
