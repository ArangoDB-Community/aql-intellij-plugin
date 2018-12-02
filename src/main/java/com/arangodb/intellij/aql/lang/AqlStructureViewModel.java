package com.arangodb.intellij.aql.lang;

import com.arangodb.intellij.aql.file.AqlFile;
import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.psi.PsiFile;

public class AqlStructureViewModel extends StructureViewModelBase implements  StructureViewModel.ElementInfoProvider {


    public AqlStructureViewModel(final PsiFile psiFile) {
        super(psiFile, new AqlStructureViewElement(psiFile));
    }

    @Override
    public boolean isAlwaysShowsPlus(final StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(final StructureViewTreeElement element) {
         return element instanceof AqlFile;
    }
}
