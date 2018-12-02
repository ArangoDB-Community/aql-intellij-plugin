package com.arangodb.intellij.aql.lang;

import com.arangodb.intellij.aql.file.AqlFile;
import com.arangodb.intellij.aql.util.Icons;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AqlStructureViewElement implements  StructureViewTreeElement, SortableTreeElement {
    private static final Logger log = LoggerFactory.getLogger(AqlStructureViewElement.class);
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
        if (presentation != null) {
            return presentation;
        }
        return  new ItemPresentation() {
            @NotNull
            @Override
            public String getPresentableText() {
                return element.getText();
            }

            @NotNull
            @Override
            public String getLocationString() {
                return element.getContainingFile().getName();
            }

            @NotNull
            @Override
            public Icon getIcon(boolean unused) {
                return Icons.ICON_ARANGO_SMALL;
            }
        };

    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        if (element instanceof AqlFile) {
            final ASTWrapperPsiElement[] elements = PsiTreeUtil.getChildrenOfType(element, ASTWrapperPsiElement.class);
            if (elements == null) {
                return EMPTY_ARRAY;
            }
            final List<TreeElement> treeElements = new ArrayList<>(elements.length);
            for (ASTWrapperPsiElement element : elements) {
                treeElements.add(new AqlStructureViewElement(element));
            }
            return treeElements.toArray(new TreeElement[treeElements.size()]);
        } else {
            return EMPTY_ARRAY;
        }
    }
}
