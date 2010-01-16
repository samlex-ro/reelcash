/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UserSettingsJDialog.java
 *
 * Created on Jan 15, 2010, 5:05:33 PM
 */
package com.google.code.reelcash.dialogs;

import com.google.code.reelcash.actions.CloseAction;
import com.google.code.reelcash.data.DbManager;
import java.sql.SQLException;
import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author andrei.olar
 */
public class UserSettingsJDialog extends javax.swing.JDialog {

    private CloseAction closeAction;
    private boolean edit;

    /** Creates new form UserSettingsJDialog */
    public UserSettingsJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadDbData();
    }

    private void loadDbData() {
        try {
            edit = false;
            DbManager dbm = new DbManager();
            Hashtable<String, Object> contact = dbm.getContact(1);
            if (null == contact) {
                return;
            }

            edit = true;
            companyNameField.setText((String) contact.get("name"));
            cifField.setText((String) contact.get("siccode"));
            orcField.setText((String) contact.get("commerceregno"));
            hqAddressField.setText((String) contact.get("address"));
            admRegionField.setText((String) contact.get("region"));
            countryField.setText((String) contact.get("country"));
            bankAccountField.setText((String) contact.get("iban"));
            bankField.setText((String) contact.get("bank"));
            capitalField.setText((String) contact.get("socialcapital"));
            defRepNameField.setText((String) contact.get("repname"));
            defRepIdTypeField.setText((String) contact.get("repidtype"));
            defRepIdField.setText((String) contact.get("repidentification"));
            defRepAddrField.setText((String) contact.get("repaddress"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public CloseAction getCloseAction() {
        if (null == closeAction) {
            closeAction = new CloseAction(this);
        }
        return closeAction;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        companyNameLabel = new javax.swing.JLabel();
        companyNameField = new javax.swing.JTextField();
        cifLabel = new javax.swing.JLabel();
        cifField = new javax.swing.JTextField();
        orcLabel = new javax.swing.JLabel();
        orcField = new javax.swing.JTextField();
        hqAddressLabel = new javax.swing.JLabel();
        hqAddressField = new javax.swing.JTextField();
        admRegionLabel = new javax.swing.JLabel();
        admRegionField = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        countryField = new javax.swing.JTextField();
        bankAccountLabel = new javax.swing.JLabel();
        bankAccountField = new javax.swing.JTextField();
        bankLabel = new javax.swing.JLabel();
        bankField = new javax.swing.JTextField();
        capitalLabel = new javax.swing.JLabel();
        capitalField = new javax.swing.JTextField();
        defRepNameLabel = new javax.swing.JLabel();
        defRepNameField = new javax.swing.JTextField();
        defRepIdTypeLabel = new javax.swing.JLabel();
        defRepIdTypeField = new javax.swing.JTextField();
        defRepIdLabel = new javax.swing.JLabel();
        defRepIdField = new javax.swing.JTextField();
        defRepAddrLabel = new javax.swing.JLabel();
        defRepAddrField = new javax.swing.JTextField();
        commandPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contact data");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        companyNameLabel.setText("Company name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 15, 0, 0);
        getContentPane().add(companyNameLabel, gridBagConstraints);

        companyNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        companyNameField.setMinimumSize(new java.awt.Dimension(100, 19));
        companyNameField.setPreferredSize(new java.awt.Dimension(100, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 10, 2, 10);
        getContentPane().add(companyNameField, gridBagConstraints);

        cifLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cifLabel.setText("SIC");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        getContentPane().add(cifLabel, gridBagConstraints);

        cifField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cifField.setMinimumSize(new java.awt.Dimension(75, 19));
        cifField.setPreferredSize(new java.awt.Dimension(75, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 10, 2, 10);
        getContentPane().add(cifField, gridBagConstraints);

        orcLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orcLabel.setText("CR Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        getContentPane().add(orcLabel, gridBagConstraints);

        orcField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        orcField.setMinimumSize(new java.awt.Dimension(75, 19));
        orcField.setPreferredSize(new java.awt.Dimension(75, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 10, 2, 10);
        getContentPane().add(orcField, gridBagConstraints);

        hqAddressLabel.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        getContentPane().add(hqAddressLabel, gridBagConstraints);

        hqAddressField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        hqAddressField.setMinimumSize(new java.awt.Dimension(100, 19));
        hqAddressField.setPreferredSize(new java.awt.Dimension(100, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 2, 10);
        getContentPane().add(hqAddressField, gridBagConstraints);

        admRegionLabel.setText("Region");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        getContentPane().add(admRegionLabel, gridBagConstraints);

        admRegionField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        admRegionField.setMinimumSize(new java.awt.Dimension(75, 19));
        admRegionField.setPreferredSize(new java.awt.Dimension(75, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 2, 10);
        getContentPane().add(admRegionField, gridBagConstraints);

        countryLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countryLabel.setText("Country");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(countryLabel, gridBagConstraints);

        countryField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        countryField.setMinimumSize(new java.awt.Dimension(75, 19));
        countryField.setPreferredSize(new java.awt.Dimension(75, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 2, 10);
        getContentPane().add(countryField, gridBagConstraints);

        bankAccountLabel.setText("IBAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        getContentPane().add(bankAccountLabel, gridBagConstraints);

        bankAccountField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bankAccountField.setMinimumSize(new java.awt.Dimension(100, 19));
        bankAccountField.setPreferredSize(new java.awt.Dimension(100, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 2, 10);
        getContentPane().add(bankAccountField, gridBagConstraints);

        bankLabel.setText("Bank");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        getContentPane().add(bankLabel, gridBagConstraints);

        bankField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bankField.setMinimumSize(new java.awt.Dimension(150, 19));
        bankField.setPreferredSize(new java.awt.Dimension(150, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 2, 10);
        getContentPane().add(bankField, gridBagConstraints);

        capitalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        capitalLabel.setText("Social capital");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(capitalLabel, gridBagConstraints);

        capitalField.setMinimumSize(new java.awt.Dimension(30, 19));
        capitalField.setPreferredSize(new java.awt.Dimension(30, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 2, 10);
        getContentPane().add(capitalField, gridBagConstraints);

        defRepNameLabel.setText("Representative");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        getContentPane().add(defRepNameLabel, gridBagConstraints);

        defRepNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        defRepNameField.setMinimumSize(new java.awt.Dimension(120, 19));
        defRepNameField.setPreferredSize(new java.awt.Dimension(120, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 2, 10);
        getContentPane().add(defRepNameField, gridBagConstraints);

        defRepIdTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        defRepIdTypeLabel.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(defRepIdTypeLabel, gridBagConstraints);

        defRepIdTypeField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        defRepIdTypeField.setMinimumSize(new java.awt.Dimension(30, 19));
        defRepIdTypeField.setPreferredSize(new java.awt.Dimension(30, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 2, 10);
        getContentPane().add(defRepIdTypeField, gridBagConstraints);

        defRepIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        defRepIdLabel.setText("Identification");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(defRepIdLabel, gridBagConstraints);

        defRepIdField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        defRepIdField.setMinimumSize(new java.awt.Dimension(75, 19));
        defRepIdField.setPreferredSize(new java.awt.Dimension(75, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 2, 10);
        getContentPane().add(defRepIdField, gridBagConstraints);

        defRepAddrLabel.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        getContentPane().add(defRepAddrLabel, gridBagConstraints);

        defRepAddrField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        defRepAddrField.setMinimumSize(new java.awt.Dimension(100, 19));
        defRepAddrField.setPreferredSize(new java.awt.Dimension(100, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 2, 10);
        getContentPane().add(defRepAddrField, gridBagConstraints);

        commandPanel.setMinimumSize(new java.awt.Dimension(200, 80));
        commandPanel.setPreferredSize(new java.awt.Dimension(200, 80));
        commandPanel.setLayout(new java.awt.GridBagLayout());

        saveButton.setText("Save");
        saveButton.setMinimumSize(new java.awt.Dimension(75, 25));
        saveButton.setPreferredSize(new java.awt.Dimension(80, 25));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSaveContactRequested(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        commandPanel.add(saveButton, gridBagConstraints);

        closeButton.setAction(getCloseAction());
        closeButton.setText("Close");
        closeButton.setDefaultCapable(false);
        closeButton.setMinimumSize(new java.awt.Dimension(75, 25));
        closeButton.setPreferredSize(new java.awt.Dimension(80, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        commandPanel.add(closeButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 10);
        getContentPane().add(commandPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onSaveContactRequested(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSaveContactRequested
        try {
            DbManager dbm = new DbManager();
            if (edit) {
                dbm.updateContact(1, companyNameField.getText(), cifField.getText(),
                        orcField.getText(), hqAddressField.getText(),
                        admRegionField.getText(), countryField.getText(),
                        bankAccountField.getText(), bankField.getText(),
                        capitalField.getText(), defRepNameField.getText(),
                        defRepIdTypeField.getText(), defRepIdField.getText(),
                        defRepAddrField.getText());
            } else {
                dbm.insertContact(companyNameField.getText(), cifField.getText(),
                        orcField.getText(), hqAddressField.getText(),
                        admRegionField.getText(), countryField.getText(),
                        bankAccountField.getText(), bankField.getText(),
                        capitalField.getText(), defRepNameField.getText(),
                        defRepIdTypeField.getText(), defRepIdField.getText(),
                        defRepAddrField.getText());
            }
            setVisible(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_onSaveContactRequested
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admRegionField;
    private javax.swing.JLabel admRegionLabel;
    private javax.swing.JTextField bankAccountField;
    private javax.swing.JLabel bankAccountLabel;
    private javax.swing.JTextField bankField;
    private javax.swing.JLabel bankLabel;
    private javax.swing.JTextField capitalField;
    private javax.swing.JLabel capitalLabel;
    private javax.swing.JTextField cifField;
    private javax.swing.JLabel cifLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel commandPanel;
    private javax.swing.JTextField companyNameField;
    private javax.swing.JLabel companyNameLabel;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField defRepAddrField;
    private javax.swing.JLabel defRepAddrLabel;
    private javax.swing.JTextField defRepIdField;
    private javax.swing.JLabel defRepIdLabel;
    private javax.swing.JTextField defRepIdTypeField;
    private javax.swing.JLabel defRepIdTypeLabel;
    private javax.swing.JTextField defRepNameField;
    private javax.swing.JLabel defRepNameLabel;
    private javax.swing.JTextField hqAddressField;
    private javax.swing.JLabel hqAddressLabel;
    private javax.swing.JTextField orcField;
    private javax.swing.JLabel orcLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
