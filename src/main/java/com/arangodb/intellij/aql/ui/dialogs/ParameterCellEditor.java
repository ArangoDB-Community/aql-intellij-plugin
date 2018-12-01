package com.arangodb.intellij.aql.ui.dialogs;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;

public class ParameterCellEditor extends AbstractCellEditor implements TableCellEditor{


    @Override
    public Object getCellEditorValue() {
        return "xxxs";
    }

    @Override
    public Component getTableCellEditorComponent(final JTable table, final Object value, final boolean isSelected, final int row, final int column) {
        return null;
    }
}
