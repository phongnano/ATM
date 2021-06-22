package Views;

import javax.swing.ImageIcon;

public class frmCustomer extends javax.swing.JFrame {

    public static String usr, name, role, acc;
    public static Long balance;
    private frmChangePassword pass;
    private frmCheckBalance chkb;
    private frmTransfer tran;
    private frmCheckPIN pin;

    public frmCustomer() {
        initComponents();
        this.setTitle("Tài khoản: " + usr + "\tHọ tên: " + name + "\tChức vụ: " + role);
        mnHome.setIcon(new ImageIcon(getClass().getResource("/Images/icon/home.png")));
        itemChangePassword.setIcon(new ImageIcon(getClass().getResource("/Images/icon/changepassword.png")));
        itemLogout.setIcon(new ImageIcon(getClass().getResource("/Images/icon/logout.png")));

        mnTransaction.setIcon(new ImageIcon(getClass().getResource("/Images/icon/transaction.png")));
        itemWithdraw.setIcon(new ImageIcon(getClass().getResource("/Images/icon/withdraw.png")));
        itemTransfer.setIcon(new ImageIcon(getClass().getResource("/Images/icon/transfer.png")));
        itemCheckBalance.setIcon(new ImageIcon(getClass().getResource("/Images/icon/checkbalance.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustomer = new javax.swing.JDesktopPane();
        menuCustomer = new javax.swing.JMenuBar();
        mnHome = new javax.swing.JMenu();
        itemChangePassword = new javax.swing.JMenuItem();
        itemLogout = new javax.swing.JMenuItem();
        mnTransaction = new javax.swing.JMenu();
        itemWithdraw = new javax.swing.JMenuItem();
        itemTransfer = new javax.swing.JMenuItem();
        itemCheckBalance = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CUSTOMER");
        setResizable(false);

        javax.swing.GroupLayout panelCustomerLayout = new javax.swing.GroupLayout(panelCustomer);
        panelCustomer.setLayout(panelCustomerLayout);
        panelCustomerLayout.setHorizontalGroup(
            panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        panelCustomerLayout.setVerticalGroup(
            panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );

        menuCustomer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        mnHome.setForeground(new java.awt.Color(51, 0, 153));
        mnHome.setText("Trang chủ");
        mnHome.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        itemChangePassword.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        itemChangePassword.setText("Đổi mật khẩu");
        itemChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassword(evt);
            }
        });
        mnHome.add(itemChangePassword);

        itemLogout.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        itemLogout.setText("Đăng xuất");
        mnHome.add(itemLogout);

        menuCustomer.add(mnHome);

        mnTransaction.setForeground(new java.awt.Color(204, 51, 0));
        mnTransaction.setText("Giao dịch");
        mnTransaction.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        itemWithdraw.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        itemWithdraw.setText("Rút tiền");
        itemWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Withdraw(evt);
            }
        });
        mnTransaction.add(itemWithdraw);

        itemTransfer.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        itemTransfer.setText("Chuyển tiền");
        itemTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tranfers(evt);
            }
        });
        mnTransaction.add(itemTransfer);

        itemCheckBalance.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        itemCheckBalance.setText("Xem số dư");
        itemCheckBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalance(evt);
            }
        });
        mnTransaction.add(itemCheckBalance);

        menuCustomer.add(mnTransaction);

        setJMenuBar(menuCustomer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustomer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustomer)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tranfers(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tranfers
        frmTransfer.account = acc;
        frmTransfer.balance_send = balance;
        if (tran == null || tran.isClosed()) {
            tran = new frmTransfer(this);
            tran.setLocation(this.getWidth() / 2 - tran.getWidth() / 2, (this.getHeight() - 20) / 2 - tran.getHeight() / 2 - 20);
            panelCustomer.add(tran);
            tran.setVisible(true);
        } else {
            tran.setLocation(this.getWidth() / 2 - tran.getWidth() / 2, (this.getHeight() - 20) / 2 - tran.getHeight() / 2 - 20);
            tran.setVisible(true);
        }
    }//GEN-LAST:event_Tranfers

    private void ChangePassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassword
        if (pass == null || pass.isClosed()) {
            pass = new frmChangePassword(null, this);
            pass.setLocation(this.getWidth() / 2 - pass.getWidth() / 2, (this.getHeight() - 20) / 2 - pass.getHeight() / 2 - 20);
            panelCustomer.add(pass);
            pass.setVisible(true);
        } else {
            pass.setLocation(this.getWidth() / 2 - pass.getWidth() / 2, (this.getHeight() - 20) / 2 - pass.getHeight() / 2 - 20);
            pass.setVisible(true);
        }
    }//GEN-LAST:event_ChangePassword

    private void checkBalance(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBalance
        frmCheckBalance.usr = usr;
        if (chkb == null || chkb.isClosed()) {
            chkb = new frmCheckBalance(this);
            chkb.setLocation(this.getWidth() / 2 - chkb.getWidth() / 2, (this.getHeight() - 20) / 2 - chkb.getHeight() / 2 - 20);
            panelCustomer.add(chkb);
            chkb.setVisible(true);
        } else {
            chkb.setLocation(this.getWidth() / 2 - chkb.getWidth() / 2, (this.getHeight() - 20) / 2 - chkb.getHeight() / 2 - 20);
            chkb.setVisible(true);
        }
    }//GEN-LAST:event_checkBalance

    private void Withdraw(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Withdraw
        if (pin == null || pin.isClosed()) {
            pin = new frmCheckPIN(this);
            pin.setLocation(this.getWidth() / 2 - pin.getWidth() / 2, (this.getHeight() - 20) / 2 - pin.getHeight() / 2 - 20);
            panelCustomer.add(pin);
            pin.setVisible(true);
        } else {
            pin.setLocation(this.getWidth() / 2 - pin.getWidth() / 2, (this.getHeight() - 20) / 2 - pin.getHeight() / 2 - 20);
            pin.setVisible(true);
        }
    }//GEN-LAST:event_Withdraw

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new frmCustomer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemChangePassword;
    private javax.swing.JMenuItem itemCheckBalance;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JMenuItem itemTransfer;
    private javax.swing.JMenuItem itemWithdraw;
    private javax.swing.JMenuBar menuCustomer;
    private javax.swing.JMenu mnHome;
    private javax.swing.JMenu mnTransaction;
    private javax.swing.JDesktopPane panelCustomer;
    // End of variables declaration//GEN-END:variables
}
