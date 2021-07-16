package Views;

import Controllers.BLL_Logins;
import Controllers.DAL_Logins;
import Models.DTO_Logins;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {

    DTO_Logins dto = new DTO_Logins();
    BLL_Logins bll = new BLL_Logins();
    DAL_Logins dal = new DAL_Logins();
    ArrayList<DTO_Logins> arr = new ArrayList<>();

    public frmLogin() {
        initComponents();
        loadBank();
        cbBank.setSelectedItem("Chọn ngân hàng");
    }

    private void loadBank() {
        HashMap<String, String> map = bll.loadBank();
        cbBank.removeAllItems();
        map.keySet().forEach((str) -> {
            cbBank.addItem(str);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panLogin = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        ckShowpassword = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        cbBank = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ĐĂNG NHẬP HỆ THỐNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        panLogin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblLogo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("LOGO");
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtUsername.setBackground(new java.awt.Color(240, 240, 240));
        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                convertUppercase(evt);
            }
        });

        ckShowpassword.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        ckShowpassword.setText("Hiện mật khẩu");
        ckShowpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLogin(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(240, 240, 240));
        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        cbBank.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseBank(evt);
            }
        });

        javax.swing.GroupLayout panLoginLayout = new javax.swing.GroupLayout(panLogin);
        panLogin.setLayout(panLoginLayout);
        panLoginLayout.setHorizontalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbBank, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckShowpassword)
                    .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panLoginLayout.createSequentialGroup()
                            .addComponent(btnLogin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtUsername)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panLoginLayout.setVerticalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panLoginLayout.createSequentialGroup()
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ckShowpassword)
                                .addGap(54, 54, 54)
                                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnLogin)
                                    .addComponent(btnExit))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showPassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassword
        if (ckShowpassword.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassword

    private void convertUppercase(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_convertUppercase
        int pos = txtUsername.getCaretPosition();
        txtUsername.setText(txtUsername.getText().toUpperCase());
        txtUsername.setCaretPosition(pos);
    }//GEN-LAST:event_convertUppercase

    private void checkLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLogin
        HashMap<String, String> map = bll.loadBank();
        dto.setUsername(txtUsername.getText());
        dto.setPasswowd(txtPassword.getText());
        String bnk = map.get(cbBank.getSelectedItem().toString());
        dto.setBank(bnk);
        if (!dto.getUsername().isEmpty() && !dto.getPasswowd().isEmpty()) {
            frmChangePassword.usr = dto.getUsername();
            if (bll.Login(dto.getUsername(), dto.getPasswowd(), dto.getBank())) {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                arr = bll.checkLogin(dto.getUsername());
                for (int i = 0; i < arr.size(); i++) {
                    dto = arr.get(i);
                    String accountnumber = dto.getAccountnumber();
                    String id = dto.getUsername();
                    String fullname = dto.getFullname();
                    long balance = dto.getBalance();
                    int role = dto.getRole();
                    String bank = dto.getBank();
                    String manage = dto.getUsername();
                    if (role == 0) {
                        frmAdmin.usr = id;
                        frmAdmin.name = fullname;
                        frmAdmin.role = "Quản trị viên";
                        frmAdmin.bank = bank;
                        frmAdmin.manage = manage;
                        new frmAdmin().setVisible(true);
                    }
                    if (role == 1) {
                        frmStaff.usr = id;
                        frmStaff.name = fullname;
                        frmStaff.role = "Nhân viên";
                        frmStaff.bank = bank;
                        frmStaff.manage = manage;
                        new frmStaff().setVisible(true);
                    }
                    if (role == 2) {
                        frmCustomer.acc = accountnumber;
                        frmCustomer.usr = id;
                        frmCustomer.name = fullname;
                        frmCustomer.balance = balance;
                        frmCustomer.role = "Khách hàng";
                        new frmCustomer().setVisible(true);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu hoặc ngân hàng không đúng", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không được bỏ trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkLogin

    private void exit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit

    }//GEN-LAST:event_exit

    private void chooseBank(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseBank
        HashMap<String, String> map = bll.loadBank();
        if (cbBank.getSelectedIndex() == -1) {
            lblLogo.setText("LOGO");
        } else {
            String bank = map.get(cbBank.getSelectedItem().toString());
            bll.getLogobank(lblLogo, bank);
        }
    }//GEN-LAST:event_chooseBank

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new frmLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cbBank;
    private javax.swing.JCheckBox ckShowpassword;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
