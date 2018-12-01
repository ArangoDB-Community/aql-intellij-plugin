package com.arangodb.intellij.aql.ui.dialogs;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class ParameterCellRenderer implements TableCellRenderer {

    private final DefaultTableCellRenderer cellRenderer;

    public ParameterCellRenderer() {
        this.cellRenderer = new DefaultTableCellRenderer();
    }

    @Override
    public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int column) {
        return cellRenderer;
    }
}
