package Views;

public class frmForgetPassword extends javax.swing.JFrame {

    public frmForgetPassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChange = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnChange = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtNewpass = new javax.swing.JPasswordField();
        lblNewpass = new javax.swing.JLabel();
        lblRepass = new javax.swing.JLabel();
        txtRepass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUÊN MẬT KHẨU");
        setResizable(false);

        panelChange.setBackground(new java.awt.Color(255, 255, 255));
        panelChange.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(153, 51, 0));
        lblUsername.setText("Tài khoản:");

        txtUsername.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        btnChange.setBackground(new java.awt.Color(255, 255, 255));
        btnChange.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnChange.setForeground(new java.awt.Color(0, 102, 51));
        btnChange.setText("Đổi mật khẩu");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassword(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 102, 51));
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit(evt);
            }
        });

        txtNewpass.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        lblNewpass.setBackground(new java.awt.Color(255, 255, 255));
        lblNewpass.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblNewpass.setForeground(new java.awt.Color(153, 51, 0));
        lblNewpass.setText("Mật khẩu mới:");

        lblRepass.setBackground(new java.awt.Color(255, 255, 255));
        lblRepass.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblRepass.setForeground(new java.awt.Color(153, 51, 0));
        lblRepass.setText("Nhập lại mật khẩu:");

        txtRepass.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        javax.swing.GroupLayout panelChangeLayout = new javax.swing.GroupLayout(panelChange);
        panelChange.setLayout(panelChangeLayout);
        panelChangeLayout.setHorizontalGroup(
            panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChangePassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassword

    }//GEN-LAST:event_ChangePassword

    private void Exit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit
        this.dispose();
    }//GEN-LAST:event_Exit

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new frmForgetPassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblNewpass;
    private javax.swing.JLabel lblRepass;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelChange;
    private javax.swing.JPasswordField txtNewpass;
    private javax.swing.JPasswordField txtRepass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
