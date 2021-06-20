package GUIS;

import Logins.BLL_Logins;
import Logins.DAL_Logins;
import Logins.DTO_Logins;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Limits.LimitText;
import java.util.ArrayList;

public class frmHome extends javax.swing.JFrame {

    DTO_Logins dto = new DTO_Logins();
    BLL_Logins bll = new BLL_Logins();
    DAL_Logins dal = new DAL_Logins();
    ArrayList<DTO_Logins> arr = new ArrayList<>();

    public frmHome() {
        initComponents();
        lblBackgroud.setIcon(new ImageIcon(getClass().getResource("/Images/picture/bidv.png")));
        lblUsr.setIcon(new ImageIcon(getClass().getResource("/Images/icon/user.png")));
        lblPwd.setIcon(new ImageIcon(getClass().getResource("/Images/icon/pass.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panLogin = new javax.swing.JPanel();
        lblUsr = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtUsr = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        lblPwd = new javax.swing.JLabel();
        ckPwd = new javax.swing.JCheckBox();
        btnExit = new javax.swing.JButton();
        lblForget = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        panBackgroud = new javax.swing.JPanel();
        lblBackgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblUsr.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblUsr.setForeground(new java.awt.Color(0, 0, 153));
        lblUsr.setText("Tài khoản:");

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 51, 0));
        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login(evt);
            }
        });

        txtUsr.setDocument(new LimitText(7)
        );
        txtUsr.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtUsr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ConvertUppercase(evt);
            }
        });

        txtPwd.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        lblPwd.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblPwd.setForeground(new java.awt.Color(0, 0, 153));
        lblPwd.setText("Mật khẩu:");

        ckPwd.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ckPwd.setForeground(new java.awt.Color(51, 153, 0));
        ckPwd.setText("Hiển thị mật khẩu");
        ckPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassword(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 0));
        btnExit.setText("Thoát");

        lblForget.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblForget.setForeground(new java.awt.Color(0, 102, 204));
        lblForget.setText("Quên mật khẩu?");
        lblForget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgetPassword(evt);
            }
        });

        javax.swing.GroupLayout panLoginLayout = new javax.swing.GroupLayout(panLogin);
        panLogin.setLayout(panLoginLayout);
        panLoginLayout.setHorizontalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsr)
                    .addComponent(lblPwd))
                .addGap(18, 18, 18)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addComponent(ckPwd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblForget))
                    .addComponent(txtPwd)
                    .addComponent(txtUsr, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        panLoginLayout.setVerticalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPwd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckPwd)
                    .addComponent(lblForget))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CHÀO MỪNG ĐẾN VỚI HỆ THỐNG ATM CỦA PHONG");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        panBackgroud.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblBackgroud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/picture/bidv.png"))); // NOI18N

        javax.swing.GroupLayout panBackgroudLayout = new javax.swing.GroupLayout(panBackgroud);
        panBackgroud.setLayout(panBackgroudLayout);
        panBackgroudLayout.setHorizontalGroup(
            panBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackgroud, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );
        panBackgroudLayout.setVerticalGroup(
            panBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackgroud, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panBackgroud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panBackgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login
        dto.setUsername(txtUsr.getText());
        dto.setPasswowd(txtPwd.getText());

        if (!dto.getUsername().isEmpty() && !dto.getPasswowd().isEmpty()) {
            frmChangePassword.usr = dto.getUsername();
            if (bll.Logins(dto)) {
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
                    if (role == 0) {
                        frmAdmin.usr = id;
                        frmAdmin.name = fullname;
                        frmAdmin.role = "Quản trị viên";
                        new frmAdmin().setVisible(true);
                    }
                    if (role == 1) {
                        frmStaff.usr = id;
                        frmStaff.name = fullname;
                        frmStaff.role = "Nhân viên";
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
                JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không đúng", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không được bỏ trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Login

    private void ShowPassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassword
        if (ckPwd.isSelected()) {
            txtPwd.setEchoChar((char) 0);
        } else {
            txtPwd.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPassword

    private void ForgetPassword(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetPassword
        new frmForgetPassword().setVisible(true);
    }//GEN-LAST:event_ForgetPassword

    private void ConvertUppercase(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConvertUppercase
        int pos = txtUsr.getCaretPosition();
        txtUsr.setText(txtUsr.getText().toUpperCase());
        txtUsr.setCaretPosition(pos);
    }//GEN-LAST:event_ConvertUppercase

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new frmHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox ckPwd;
    private javax.swing.JLabel lblBackgroud;
    private javax.swing.JLabel lblForget;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsr;
    private javax.swing.JPanel panBackgroud;
    private javax.swing.JPanel panLogin;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUsr;
    // End of variables declaration//GEN-END:variables
}
