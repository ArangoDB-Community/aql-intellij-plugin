package com.arangodb.intellij.aql.ui.renderers;

import com.intellij.ide.util.treeView.AbstractTreeStructure;
import com.intellij.ide.util.treeView.NodeDescriptor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.ActionCallback;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.ui.JBColor;
import com.intellij.util.ArrayUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;

public class AqlTreeStructure extends AbstractTreeStructure {
    private final Project myProject;
    private final Object myRoot = new Object();

    private static final Comparator<AqlNodeModel> ourTargetComparator = (target1, target2) -> {
        final String name1 = target1.getDisplayName();
        if (name1 == null) {
            return Integer.MIN_VALUE;
        }
        final String name2 = target2.getDisplayName();
        if (name2 == null) {
            return Integer.MAX_VALUE;
        }
        return name1.compareToIgnoreCase(name2);
    };

    public AqlTreeStructure(final Project project) {
        myProject = project;
    }

    @Override
    public boolean isToBuildChildrenInBackground(@NotNull final Object element) {
        return true;
    }

    @Override
    public boolean isAlwaysLeaf(@NotNull Object element) {
        return element != myRoot && !(element instanceof AqlNodeModel);
    }

    @Override
    @NotNull
    public AqlNodeDescriptor createDescriptor(@NotNull Object element, NodeDescriptor parentDescriptor) {
        if (element == myRoot) {
            return new RootNodeDescriptor(myProject, parentDescriptor);
        }
        final AqlNodeDescriptor descriptor = (AqlNodeDescriptor) element;
        return new AqlNodeDescriptor(myProject, descriptor);
    }

    @NotNull
    @Override
    public Object[] getChildElements(@NotNull Object element) {
        // TODO

        return ArrayUtil.EMPTY_OBJECT_ARRAY;
    }

    @Override
    @Nullable
    public Object getParentElement(@NotNull Object element) {

        if (element instanceof AqlNodeModel) {
            // TODO
            return myRoot;
        }

        return null;
    }

    @Override
    public void commit() {
        PsiDocumentManager.getInstance(myProject).commitAllDocuments();
    }

    @Override
    public boolean hasSomethingToCommit() {
        return PsiDocumentManager.getInstance(myProject).hasUncommitedDocuments();
    }

    @NotNull
    @Override
    public ActionCallback asyncCommit() {
        return asyncCommitDocuments(myProject);
    }

    @NotNull
    @Override
    public Object getRootElement() {
        return myRoot;
    }


    private final class RootNodeDescriptor extends AqlNodeDescriptor {
        RootNodeDescriptor(Project project, NodeDescriptor parentDescriptor) {
            super(project, parentDescriptor);
        }


        @Override
        public Object getElement() {
            return myRoot;
        }

        @Override
        public boolean update() {
            myName = "";
            return false;
        }
    }

    private static final class TextInfoNodeDescriptor extends AqlNodeDescriptor {
        TextInfoNodeDescriptor(Project project, NodeDescriptor parentDescriptor, String text) {
            super(project, parentDescriptor);
            myName = text;
            myColor = JBColor.blue;
        }

        @Override
        public Object getElement() {
            return myName;
        }

        @Override
        public boolean update() {
            return true;
        }

    }

}
