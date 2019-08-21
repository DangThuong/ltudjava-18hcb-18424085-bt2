/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.ui;

import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import manager.control.InformationControl;
import manager.entity.InformationEntity;
import org.apache.commons.validator.routines.EmailValidator;


/**
 *
 * @author Dell
 */
public class InformationPanel extends javax.swing.JPanel {
    private InformationControl informationControl;
    private String name;

    public String getName() {
        return name;
    }
    /**
     * Creates new form Information
     * @param mssv
     */
    
    public InformationPanel() {
        initComponents();
    }
    
    public InformationPanel(String mssv) {
        informationControl = new InformationControl(mssv);
        initComponents();
    }
    
    public void reset() {
        warningLabel.setText(null);
    }
    
    public void showInformation() {
        InformationEntity result = informationControl.getInformation();
        if(result.getImage() != null) {
            ImageIcon image = new ImageIcon(new ImageIcon(result.getImage()).getImage().getScaledInstance(imageLabel.getWidth()+14, imageLabel.getHeight(), Image.SCALE_DEFAULT));
            imageLabel.setIcon(image);
        }
        
        mssvLabel.setText("Mã sinh viên: " + result.getMssv());
        name = result.getHoTen();
        nameLabel.setText("Họ tên sinh viên: " + name);
        
        birthdayLabel.setText("Ngày sinh: " + new SimpleDateFormat("dd-MM-yyyy").format(result.getNgaySinh()));
        classLabel.setText("Lớp: " + result.getLop());
        gradeLabel.setText("Hệ học: " + result.getHeHoc());
        statusLabel.setText("Trạng thái: " + result.getTrangThai());
        emailTextField.setText(result.getEmail());
        phonenumberTextField.setText(result.getSoDT());
        addressTextField.setText(result.getDiaChi());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        phonenumberLabel = new javax.swing.JLabel();
        phonenumberTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        updateLabel = new manager.ui.ButtonLabel(new java.awt.Color(85,55,118), null);
        jPanel2 = new javax.swing.JPanel();
        mssvLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        headerInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 565));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        emailLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(54, 33, 89));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLabel.setText("Email*:");

        emailTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(54, 33, 89));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        phonenumberLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        phonenumberLabel.setForeground(new java.awt.Color(54, 33, 89));
        phonenumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phonenumberLabel.setText("Số điện thoại*:");

        phonenumberTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        phonenumberTextField.setForeground(new java.awt.Color(54, 33, 89));
        phonenumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberTextFieldActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(54, 33, 89));
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressLabel.setText("Địa chỉ*:");

        addressTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        addressTextField.setForeground(new java.awt.Color(54, 33, 89));
        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });

        updateLabel.setBackground(new java.awt.Color(64, 43, 100));
        updateLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        updateLabel.setForeground(new java.awt.Color(255, 255, 255));
        updateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateLabel.setText("Cập nhật");
        updateLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateLabel.setOpaque(true);
        updateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateLabelMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(phonenumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phonenumberTextField)
                    .addComponent(addressTextField)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonenumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(updateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(6, 1, 0, 15));

        mssvLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mssvLabel.setForeground(new java.awt.Color(54, 33, 89));
        mssvLabel.setText("Mã sinh viên:");
        jPanel2.add(mssvLabel);

        nameLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(54, 33, 89));
        nameLabel.setText("Họ tên sinh viên:");
        jPanel2.add(nameLabel);

        birthdayLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        birthdayLabel.setForeground(new java.awt.Color(54, 33, 89));
        birthdayLabel.setText("Ngày sinh:");
        jPanel2.add(birthdayLabel);

        classLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        classLabel.setForeground(new java.awt.Color(54, 33, 89));
        classLabel.setText("Lớp:");
        jPanel2.add(classLabel);

        gradeLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        gradeLabel.setForeground(new java.awt.Color(54, 33, 89));
        gradeLabel.setText("Hệ học:");
        jPanel2.add(gradeLabel);

        statusLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(54, 33, 89));
        statusLabel.setText("Trạng thái:");
        jPanel2.add(statusLabel);

        headerInfo.setBackground(new java.awt.Color(255, 255, 255));
        headerInfo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 33, 89));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin cá nhân");
        headerInfo.add(jLabel1);

        imageLabel.setBackground(new java.awt.Color(255, 255, 255));
        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setText("image");
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89), 2));

        warningLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addComponent(headerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(854, 854, 854))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void phonenumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberTextFieldActionPerformed

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void updateLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseEntered
        updateLabel.setBackground(new java.awt.Color(85,55,118));
    }//GEN-LAST:event_updateLabelMouseEntered

    private void updateLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMousePressed
        String email = emailTextField.getText();
        String phoneNumber = phonenumberTextField.getText();
        String address = addressTextField.getText();
        
        if(!email.equals("") && !EmailValidator.getInstance().isValid(email)) {
            warningLabel.setForeground(Color.red);
            warningLabel.setText("Địa chỉ email sai định dạng.");
            return;
        }
        
        informationControl.setInfo(email, address, phoneNumber);
        informationControl.update();
        warningLabel.setForeground(Color.green);
        warningLabel.setText("Cập nhật thông tin thành công.");
    }//GEN-LAST:event_updateLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JPanel headerInfo;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mssvLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel phonenumberLabel;
    private javax.swing.JTextField phonenumberTextField;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
