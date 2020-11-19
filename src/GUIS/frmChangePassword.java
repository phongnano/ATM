package GUIS;

import Logins.BLL_Logins;
import Logins.DAL_Logins;
import Logins.DTO_Logins;
import javax.swing.JOptionPane;

public class frmChangePassword extends javax.swing.JInternalFrame {

    public static String usr, pwd;
    DTO_Logins dto = new DTO_Logins();
    DAL_Logins dal = new DAL_Logins();
    BLL_Logins bll = new BLL_Logins();
    frmStaff stf;

    public frmChangePassword(frmStaff staff) {
        initComponents();
        stf = staff;

        txtUsername.setText(usr);
        txtUsername.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChange = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtOldpass = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnChange = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtNewpass = new javax.swing.JPasswordField();
        lblOldpass = new javax.swing.JLabel();
        lblNewpass = new javax.swing.JLabel();
        lblRepass = new javax.swing.JLabel();
        txtRepass = new javax.swing.JPasswordField();

        setClosable(true);
        setTitle("ĐỔI MẬT KHẨU");
        setVisible(true);

        panelChange.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblUsername.setText("Tài khoản:");

        btnChange.setText("Đổi mật khẩu");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgetPassword(evt);
            }
        });

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit(evt);
            }
        });

        lblOldpass.setText("Mật khẩu cũ:");

        lblNewpass.setText("Mật khẩu mới:");

        lblRepass.setText("Nhập lại mật khẩu:");

        javax.swing.GroupLayout panelChangeLayout = new javax.swing.GroupLayout(panelChange);
        panelChange.setLayout(panelChangeLayout);
        panelChangeLayout.setHorizontalGroup(
            panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOldpass)
                    .addComponent(lblNewpass)
                    .addComponent(lblRepass)
                    .addComponent(lblUsername))
                .addGap(18, 18, 18)
                .addGroup(panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelChangeLayout.createSequentialGroup()
                        .addComponent(btnChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOldpass)
                            .addComponent(txtNewpass)
                            .addComponent(txtRepass, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelChangeLayout.setVerticalGroup(
            panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOldpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOldpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRepass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnChange))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ForgetPassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgetPassword
        dto.setUsername(txtUsername.getText());
        dto.setPasswowd(txtOldpass.getText());
        dto.setNewpassword(txtNewpass.getText());
        dto.setRepassword(txtRepass.getText());

        if (dto.getRepassword().equals(dto.getNewpassword())) {
            if (dto.getNewpassword().equals(dto.getPasswowd())) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập mât khẩu mới khác với mật khẩu cũ", "Thông báo", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                if (dto.getPasswowd().equals(dal.getPass(dto.getUsername()))) {
                    bll.ChangePasswords(dto);
                    JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    stf.dispose();
                    new frmHome().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Mật khẩu không tồn tại với tài khoản này", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mật khẩu không khớp", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        bll.ChangePasswords(dto);
    }//GEN-LAST:event_ForgetPassword

    private void Exit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit
        this.dispose();
    }//GEN-LAST:event_Exit


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblNewpass;
    private javax.swing.JLabel lblOldpass;
    private javax.swing.JLabel lblRepass;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelChange;
    private javax.swing.JPasswordField txtNewpass;
    private javax.swing.JPasswordField txtOldpass;
    private javax.swing.JPasswordField txtRepass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
