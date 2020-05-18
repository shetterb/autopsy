/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sleuthkit.autopsy.discovery;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import org.sleuthkit.autopsy.discovery.FileSearchFiltering.ParentSearchTerm;

/**
 *
 * @author wschaefer
 */
public class ParentFolderFilterPanel extends AbstractDiscoveryFiltersPanel {

    private static final long serialVersionUID = 1L;
    private DefaultListModel<FileSearchFiltering.ParentSearchTerm> parentListModel;

    /**
     * Creates new form ParentFolderFilterPanel
     */
    public ParentFolderFilterPanel() {
        initComponents();
        setUpParentPathFilter();
    }

    
        /**
     * Initialize the parent path filter
     */
    private void setUpParentPathFilter() {
        fullRadioButton.setSelected(true);
        includeRadioButton.setSelected(true);
        parentListModel = (DefaultListModel<FileSearchFiltering.ParentSearchTerm>) parentList.getModel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentCheckbox = new javax.swing.JCheckBox();
        parentLabel = new javax.swing.JLabel();
        parentScrollPane = new javax.swing.JScrollPane();
        parentList = new javax.swing.JList<>();
        fullRadioButton = new javax.swing.JRadioButton();
        includeRadioButton = new javax.swing.JRadioButton();
        substringRadioButton = new javax.swing.JRadioButton();
        excludeRadioButton = new javax.swing.JRadioButton();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        parentTextField = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(parentCheckbox, org.openide.util.NbBundle.getMessage(ParentFolderFilterPanel.class, "ParentFolderFilterPanel.parentCheckbox.text_1")); // NOI18N
        parentCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentCheckboxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(parentLabel, org.openide.util.NbBundle.getMessage(ParentFolderFilterPanel.class, "ParentFolderFilterPanel.parentLabel.text_1")); // NOI18N

        parentList.setModel(new DefaultListModel<ParentSearchTerm>());
        parentList.setEnabled(false);
        parentList.setVisibleRowCount(4);
        parentList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                parentListValueChanged(evt);
            }
        });
        parentScrollPane.setViewportView(parentList);

        fullRadioButton.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(fullRadioButton, org.openide.util.NbBundle.getMessage(ParentFolderFilterPanel.class, "ParentFolderFilterPanel.fullRadioButton.text_1")); // NOI18N
        fullRadioButton.setEnabled(false);

        includeRadioButton.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(includeRadioButton, org.openide.util.NbBundle.getMessage(ParentFolderFilterPanel.class, "ParentFolderFilterPanel.includeRadioButton.text_1")); // NOI18N
        includeRadioButton.setEnabled(false);

        org.openide.awt.Mnemonics.setLocalizedText(substringRadioButton, org.openide.util.NbBundle.getMessage(ParentFolderFilterPanel.class, "ParentFolderFilterPanel.substringRadioButton.text_1")); // NOI18N
        substringRadioButton.setEnabled(false);

        org.openide.awt.Mnemonics.setLocalizedText(excludeRadioButton, org.openide.util.NbBundle.getMessage(ParentFolderFilterPanel.class, "ParentFolderFilterPanel.excludeRadioButton.text_1")); // NOI18N
        excludeRadioButton.setEnabled(false);

        org.openide.awt.Mnemonics.setLocalizedText(deleteButton, org.openide.util.NbBundle.getMessage(ParentFolderFilterPanel.class, "ParentFolderFilterPanel.deleteButton.text_1")); // NOI18N
        deleteButton.setEnabled(false);
        deleteButton.setMaximumSize(new java.awt.Dimension(70, 23));
        deleteButton.setMinimumSize(new java.awt.Dimension(70, 23));
        deleteButton.setPreferredSize(new java.awt.Dimension(70, 23));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(addButton, org.openide.util.NbBundle.getMessage(ParentFolderFilterPanel.class, "ParentFolderFilterPanel.addButton.text_1")); // NOI18N
        addButton.setEnabled(false);
        addButton.setMaximumSize(new java.awt.Dimension(70, 23));
        addButton.setMinimumSize(new java.awt.Dimension(70, 23));
        addButton.setPreferredSize(new java.awt.Dimension(70, 23));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        parentTextField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullRadioButton)
                            .addComponent(includeRadioButton))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(excludeRadioButton)
                                .addGap(176, 176, 176)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(substringRadioButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(parentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(parentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(parentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullRadioButton)
                    .addComponent(substringRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(includeRadioButton)
                    .addComponent(excludeRadioButton)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void parentCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentCheckboxActionPerformed
//        parentFilterSettings(true, true, parentCheckbox.isSelected(), null);
    }//GEN-LAST:event_parentCheckboxActionPerformed

    private void parentListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_parentListValueChanged
        if (parentList.getSelectedValuesList().isEmpty()) {
            deleteButton.setEnabled(false);
        } else {
            deleteButton.setEnabled(true);
        }
    }//GEN-LAST:event_parentListValueChanged

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int index = parentList.getSelectedIndex();
        if (index >= 0) {
            parentListModel.remove(index);
        }
//        validateFields();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (!parentTextField.getText().isEmpty()) {
            ParentSearchTerm searchTerm;
            searchTerm = new ParentSearchTerm(parentTextField.getText(), fullRadioButton.isSelected(), includeRadioButton.isSelected());
            parentListModel.add(parentListModel.size(), searchTerm);
//            validateFields();
            parentTextField.setText("");
        }
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JRadioButton excludeRadioButton;
    private javax.swing.JRadioButton fullRadioButton;
    private javax.swing.JRadioButton includeRadioButton;
    private javax.swing.JCheckBox parentCheckbox;
    private javax.swing.JLabel parentLabel;
    private javax.swing.JList<ParentSearchTerm> parentList;
    private javax.swing.JScrollPane parentScrollPane;
    private javax.swing.JTextField parentTextField;
    private javax.swing.JRadioButton substringRadioButton;
    // End of variables declaration//GEN-END:variables

    @Override
    void configurePanel(boolean selected, int[] indicesSelected) {
        parentCheckbox.setSelected(selected);
        if (parentCheckbox.isEnabled() && parentCheckbox.isSelected()) {
            parentScrollPane.setEnabled(true);
            includeRadioButton.setEnabled(true);
            excludeRadioButton.setEnabled(true);
            fullRadioButton.setEnabled(true);
            substringRadioButton.setEnabled(true);
            addButton.setEnabled(true);
            deleteButton.setEnabled(!parentListModel.isEmpty());
            parentList.setEnabled(true);
            parentTextField.setEnabled(true);
            if (indicesSelected != null) {
                parentList.setSelectedIndices(indicesSelected);
            }
        } else {
            parentScrollPane.setEnabled(false);
            parentList.setEnabled(false);
            includeRadioButton.setEnabled(false);
            excludeRadioButton.setEnabled(false);
            fullRadioButton.setEnabled(false);
            substringRadioButton.setEnabled(false);
            addButton.setEnabled(false);
            deleteButton.setEnabled(false);
            parentTextField.setEnabled(false);
        }
    }

    @Override
    JCheckBox getCheckbox() {
        return parentCheckbox;
    }

    @Override
    JLabel getAdditionalLabel() {
        return parentLabel;
    }

    @Override
    String checkForError() {
        // Parent uses everything in the box
        if (parentCheckbox.isSelected() && getParentPaths().isEmpty()) {
            return "At least one parent path must be entered";
        }
        return null;
    }

    /**
     * Utility method to get the parent path objects out of the JList.
     *
     * @return The list of entered ParentSearchTerm objects
     */
    private List<FileSearchFiltering.ParentSearchTerm> getParentPaths() {
        List<FileSearchFiltering.ParentSearchTerm> results = new ArrayList<>();
        for (int i = 0; i < parentListModel.getSize(); i++) {
            results.add(parentListModel.get(i));
        }
        return results;
    }

    @Override
    JList<?> getList() {
        return parentList;
    }

}
