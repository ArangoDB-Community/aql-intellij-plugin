package com.arangodb.intellij.aql.ui.dialogs;

import javax.swing.*;

public class ParameterPair {
    
    private JTextField value;
    private JLabel label;

    public JTextField getValue() {
        return value;
    }

    public void setLabel(final String text) {
        label.setText(text);
    }
    public void setValue(final String text) {
        value.setText(text);
    }
}
