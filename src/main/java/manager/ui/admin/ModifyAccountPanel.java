/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.ui.admin;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import manager.control.admin.AccountControl;
import manager.entity.admin.Account;
import manager.ui.HeaderRenderer;
import manager.ui.LoginUI;
import manager.ui.Table;

/**
 *
 * @author Dell
 */
public class ModifyAccountPanel extends javax.swing.JPanel {
    private ArrayList<String> removeList = new ArrayList<String>();
    private AccountControl accountControl;

    /**
     * Creates new form ManagerAccountPanel
     */
    public ModifyAccountPanel() {
        accountControl = new AccountControl();
        initComponents();
    }

    public void initModifyAccountTable() {
        changePassButton.setVisible(false);
        pagination.setVisible(false);
        JTableHeader header = modifyAccountTable.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(72, 3, 111));
        header.setForeground(Color.white);
        header.setFont(new java.awt.Font("SansSerif", 1, 14));
        modifyAccountScroll.getViewport().setBackground(Color.WHITE);
        Border border = BorderFactory.createEmptyBorder(0, 0, 0, 0);
        modifyAccountScroll.setViewportBorder(border);
        modifyAccountScroll.setBorder(border);

        TableColumn selectColumn = modifyAccountTable.getColumnModel().getColumn(3);
        selectColumn.setHeaderRenderer(new HeaderRenderer(header, 3));

        accountControl.setTotalAccount();
        accountControl.setMaxResult(20);
        int size = accountControl.getTotalAccount();
        pagination.setSize(size);
        pagination.setTable(new Table() {
            public void displayData(int firstResult) {
                List resultList = accountControl.getAccount(firstResult);
                displayAccountList(resultList, firstResult);
            }
        });
        List resultList = accountControl.getAccount(0);
        displayAccountList(resultList, 0);
        if (size < 20) {
            pagination.setVisible(false);
        } else {
            pagination.setVisible(true);
        }
    }

    public void reset() {
        statusLabel.setText(null);
    }
    
    private void displayAccountList(List resultList, int firstResult) {
        resetTable();
        TableModel model = modifyAccountTable.getModel();
        for (int i = 0; i < resultList.size(); i++) {
            Account acc = (Account) resultList.get(i);
            ((DefaultTableModel) model).addRow(new Object[]{i + 1, acc.getUserName(), acc.getAccountType()});
        }
    }

    private void resetTable() {
        DefaultTableModel dm = (DefaultTableModel) modifyAccountTable.getModel();
        int rowCount = dm.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modifyAccountScroll = new javax.swing.JScrollPane();
        modifyAccountTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        accountNameLabel = new javax.swing.JLabel();
        accountNameTextField = new javax.swing.JTextField();
        passWordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        changePassButton = new manager.ui.ButtonLabel(new java.awt.Color(85,55,118), null);
        statusLabel = new javax.swing.JLabel();
        buttonLabel1 = new manager.ui.ButtonLabel(new java.awt.Color(85,55,118), null);
        pagination = new manager.ui.Pagination(new Table() {
            public void displayData(int firstResult) {
                List resultList = accountControl.getAccount(firstResult);
                displayAccountList(resultList, firstResult);
            }
        });
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        removeButton = new manager.ui.ButtonLabel(new java.awt.Color(85,55,118), null);

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1020, 565));

        modifyAccountTable.setAutoCreateRowSorter(true);
        modifyAccountTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        modifyAccountTable.setForeground(new java.awt.Color(54, 33, 89));
        modifyAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số thứ tự", "Tên tài khoản", "Loại tài khoản", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        modifyAccountTable.setGridColor(new java.awt.Color(204, 204, 255));
        modifyAccountScroll.setViewportView(modifyAccountTable);
        if (modifyAccountTable.getColumnModel().getColumnCount() > 0) {
            modifyAccountTable.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        accountNameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        accountNameLabel.setForeground(new java.awt.Color(54, 33, 89));
        accountNameLabel.setText("Tên tài khoản:");

        accountNameTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        accountNameTextField.setForeground(new java.awt.Color(54, 33, 89));
        accountNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNameTextFieldActionPerformed(evt);
            }
        });

        passWordLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passWordLabel.setForeground(new java.awt.Color(54, 33, 89));
        passWordLabel.setText("Mật khẩu mới:");

        passwordField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(54, 33, 89));

        changePassButton.setBackground(new java.awt.Color(64, 43, 100));
        changePassButton.setForeground(new java.awt.Color(255, 255, 255));
        changePassButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changePassButton.setText("Đổi mật khẩu");
        changePassButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        changePassButton.setOpaque(true);
        changePassButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                changePassButtonMousePressed(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(accountNameLabel)
                        .addGap(29, 29, 29)
                        .addComponent(accountNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(passWordLabel)
                        .addGap(18, 18, 18)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(changePassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(accountNameLabel)
                        .addComponent(accountNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passWordLabel)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
        );

        buttonLabel1.setBackground(new java.awt.Color(64, 43, 100));
        buttonLabel1.setForeground(new java.awt.Color(255, 255, 255));
        buttonLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonLabel1.setText("Gửi đi");
        buttonLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonLabel1.setOpaque(true);
        buttonLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonLabel1MousePressed(evt);
            }
        });

        titlePanel.setBackground(new java.awt.Color(110, 89, 222));
        titlePanel.setPreferredSize(new java.awt.Dimension(0, 58));
        titlePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        titleLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Sửa tài khoản");
        titlePanel.add(titleLabel);

        removeButton.setBackground(new java.awt.Color(64, 43, 100));
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeButton.setText("Xóa tài khoản");
        removeButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        removeButton.setOpaque(true);
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                removeButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modifyAccountScroll)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pagination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(buttonLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(modifyAccountScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pagination, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void accountNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNameTextFieldActionPerformed
        Account acc = accountControl.findAccount(accountNameTextField.getText());
        if (acc != null) {
            changePassButton.setVisible(true);

            resetTable();
            TableModel model = modifyAccountTable.getModel();
            ((DefaultTableModel) model).addRow(new Object[]{1, acc.getUserName(), acc.getAccountType()});
        } else {
            changePassButton.setVisible(false);
            resetTable();
        }
    }//GEN-LAST:event_accountNameTextFieldActionPerformed

    private void changePassButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassButtonMousePressed
        Account acc = new Account();
        acc.setUserName(accountNameTextField.getText());
        acc.setPassWord(LoginUI.getHash(LoginUI.getHash(passwordField.getText(), "MD5"),
                "SHA-256"));
        statusLabel.setText("");
        accountControl.updatePassWord(acc);
        statusLabel.setForeground(Color.green);
        statusLabel.setText("Your password has been updated successfully");
    }//GEN-LAST:event_changePassButtonMousePressed

    private void removeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMousePressed
        TableModel model = modifyAccountTable.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            Boolean check = (Boolean) model.getValueAt(i, 3);
            if (check != null && check == true) {
                removeList.add((String) model.getValueAt(i, 1));
                ((DefaultTableModel) model).removeRow(i);
                i--;
                rowCount--;
            }
        }
        
    }//GEN-LAST:event_removeButtonMousePressed

    private void buttonLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLabel1MousePressed
        accountControl.removeGroupAccount(removeList);
        removeList.clear();
        statusLabel.setForeground(Color.green);
        statusLabel.setText("Gửi đi thành công.");
    }//GEN-LAST:event_buttonLabel1MousePressed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNameLabel;
    private javax.swing.JTextField accountNameTextField;
    private manager.ui.ButtonLabel buttonLabel1;
    private manager.ui.ButtonLabel changePassButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane modifyAccountScroll;
    private javax.swing.JTable modifyAccountTable;
    private manager.ui.Pagination pagination;
    private javax.swing.JLabel passWordLabel;
    private javax.swing.JPasswordField passwordField;
    private manager.ui.ButtonLabel removeButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}