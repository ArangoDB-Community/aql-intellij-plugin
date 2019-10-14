package com.arangodb.intellij.aql.ui.renderers;

import com.arangodb.intellij.aql.util.Icons;
import com.intellij.ide.util.treeView.NodeDescriptor;
import com.intellij.openapi.editor.markup.EffectType;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ui.CellAppearanceEx;
import com.intellij.openapi.roots.ui.util.CompositeAppearance;
import com.intellij.openapi.util.Comparing;
import com.intellij.ui.SimpleColoredComponent;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class AqlNodeDescriptor extends NodeDescriptor implements CellAppearanceEx {


    private final AqlNodeModel model;
    private CompositeAppearance myHighlightedText;

    public AqlNodeDescriptor(final Project project, final NodeDescriptor parentDescriptor, final AqlNodeModel target) {
        super(project, parentDescriptor);
        model = target;
        myHighlightedText = new CompositeAppearance();
        myHighlightedText.setIcon(Icons.ICON_DATABASE);
        myHighlightedText.customize(new AqlNodeRenderer());
    }

    public AqlNodeDescriptor(final Project project, final NodeDescriptor parentDescriptor) {
        super(project, parentDescriptor);
        model = new AqlNodeModel("root", "root", AqlNodeModel.Type.DATABASE);
    }

    @Override
    public Object getElement() {
        return model;
    }

    public AqlNodeModel getTarget() {
        return model;
    }

    @Override
    public boolean update() {
        final CompositeAppearance oldText = myHighlightedText;
        final boolean isServer = model.getType() == AqlNodeModel.Type.SERVER;
        setIcon(isServer ? Icons.ICON_DATABASE : Icons.ICON_COLLECTION);
        myHighlightedText = new CompositeAppearance();
        final Color color = isServer ? UIUtil.getLabelForeground() : UIUtil.getLabelDisabledForeground();
        final TextAttributes nameAttributes = new TextAttributes(color, null, null, EffectType.BOXED, isServer ? Font.BOLD : Font.PLAIN);
        myHighlightedText.getEnding().addText(model.getDisplayName(), nameAttributes);
        myName = myHighlightedText.getText();
        return !Comparing.equal(myHighlightedText, oldText);
    }


    public CellAppearanceEx getHighlightedText() {
        return myHighlightedText;
    }


    @Override
    public void customize(@NotNull SimpleColoredComponent component) {
        getHighlightedText().customize(component);
        component.setIcon(Icons.ICON_DATABASE);
        final String toolTipText = getTarget().getDisplayName();
        component.setToolTipText(toolTipText);
    }




    @Override
    @NotNull
    public String getText() {
        return model.getDisplayName();
    }
}
