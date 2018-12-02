package com.arangodb.intellij.aql.lang;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.util.AqlUtils;
import com.intellij.navigation.ChooseByNameContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AqlChooseByNameContributor implements ChooseByNameContributor {


    public static final String[] EMPTY_ARRAY = new String[0];
    public static final NavigationItem[] EMPTY_NAV_ITEMS = new NavigationItem[0];

    @NotNull
        @Override
        public String[] getNames(final Project project, final boolean includeNonProjectItems) {
            final List<AqlNamedElement> namedElements = AqlUtils.findNamedElements(project);
            final List<String> names = new ArrayList<>(namedElements.size());
            for (final AqlNamedElement element : namedElements) {
                final String name = element.getName();
                if (name != null && name.length() > 0) {
                    names.add(name);
                }
            }
            return names.toArray(EMPTY_ARRAY);
        }

        @NotNull
        @Override
        public NavigationItem[] getItemsByName(String name, String pattern, Project project, boolean includeNonProjectItems) {
            // todo include non project items
            final List<AqlNamedElement> properties = AqlUtils.findNamedElements(project, name);
            return properties.toArray(EMPTY_NAV_ITEMS);
        }
}
