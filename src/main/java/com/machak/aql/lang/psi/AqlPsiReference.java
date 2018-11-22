package com.machak.aql.lang.psi;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiUtilCore;
import com.intellij.util.IncorrectOperationException;
import com.machak.aql.file.AqlFile;
import com.machak.aql.file.AqlFileType;
import com.machak.aql.grammar.psi.AqlNamedElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class AqlPsiReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {


    protected <T extends AqlNamedElement> ResolveResult[] asArray(final Set<T> data) {
        return data.stream().map(PsiElementResolveResult::new).toArray(ResolveResult[]::new);
    }

    public AqlPsiReference(final PsiElement element, final TextRange rangeInElement) {
        super(element, rangeInElement);
    }


    @NotNull
    @Override
    public ResolveResult[] multiResolve(final boolean incompleteCode) {
        if (myElement instanceof AqlNamedElement) {
            final AqlNamedElement namedElement = (AqlNamedElement) myElement;

            final IElementType elementType = PsiUtilCore.getElementType(myElement);
            if (elementType == null) {
                return ResolveResult.EMPTY_ARRAY;
            }
            return asArray(findAll(namedElement.getProject()));
        }
        return ResolveResult.EMPTY_ARRAY;

    }

    @Nullable
    @Override
    public PsiElement resolve() {
        final ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length > 0 ? resolveResults[0].getElement() : null;
    }

    @Override
    public PsiElement handleElementRename(@NotNull String newElementName) throws IncorrectOperationException {
        ((PsiNamedElement) myElement).setName(newElementName);
        return myElement;
    }

    public <T extends AqlNamedElement> Set<T> findAll(final Project project) {
        final Set<T> result = findInjected(project);
        final GlobalSearchScope scope = GlobalSearchScope.allScope(project);
        final Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(AqlFileType.INSTANCE, scope);
        for (VirtualFile virtualFile : virtualFiles) {
            final AqlFile file = (AqlFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (file != null) {
                final Set<T> found = processFile(file);
                result.addAll(found);
            }
        }
        return result;
    }

    private <T extends AqlNamedElement> Set<T> findInjected(final Project project) {
        // TODO find injected references
        return new HashSet<>();
    }


    @SuppressWarnings("unchecked")
    public <T extends PsiElement> Set<T> processFile(final AqlFile file) {
        final ASTNode rootNode = file.getNode();
        final Set<ASTNode> nodes = new HashSet<>();
        populateASTNodes(nodes, rootNode);
        return nodes.stream().map(node -> (T) node.getPsi()).collect(Collectors.toSet());
    }

    public void populateASTNodes(final Set<ASTNode> nodes, ASTNode rootNode) {
        final PsiElement psi = rootNode.getPsi();
        if (psi instanceof AqlNamedElement) {
            final AqlNamedElement node = (AqlNamedElement) psi;
            final AqlNamedElement me = (AqlNamedElement) myElement;
            if (node.getAqlType() == me.getAqlType()) {
                final String name = node.getName();
                if (name != null && name.equals(me.getName())) {
                    nodes.add(rootNode);
                }
            }
        }
        ASTNode childNode = rootNode.getFirstChildNode();
        while (childNode != null) {
            populateASTNodes(nodes, childNode);
            childNode = childNode.getTreeNext();
        }
    }


}
