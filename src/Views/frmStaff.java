package Views;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmStaff extends javax.swing.JFrame {

    public static String usr, name, role, bank, manage;
    private frmChangePassword pass;
    private frmBanks bnk;
    private frmCustomerManagement cst;
    private frmWithdraws wit;

    public frmStaff() {
        initComponents();
        this.setTitle("Tài khoản: " + usr + "\tHọ tên: " + name + "\tChức vụ: " + role);
        mnHome.setIcon(new ImageIcon(getClass().getResource("/Images/icon/home.png")));
        itemChangepass.setIcon(new ImageIcon(getClass().getResource("/Images/icon/changepassword.png")));
        itemLogout.setIcon(new ImageIcon(getClass().getResource("/Images/icon/logout.png")));

        mnCatalog.setIcon(new ImageIcon(getClass().getResource("/Images/icon/catalog.png")));
        itemCustomer.setIcon(new ImageIcon(getClass().getResource("/Images/icon/customermanagement.png")));
        itemCard.setIcon(new ImageIcon(getClass().getResource("/Images/icon/cardmanagement.png")));

        mnTransaction.setIcon(new ImageIcon(getClass().getResource("/Images/icon/transaction.png")));
        itemDeposit.setIcon(new ImageIcon(getClass().getResource("/Images/icon/deposit.png")));
        itemWithdraw.setIcon(new ImageIcon(getClass().getResource("/Images/icon/withdraw.png")));
        itemTransfer.setIcon(new ImageIcon(getClass().getResource("/Images/icon/transfer.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelStaff = new javax.swing.JDesktopPane();
        menuStaff = new javax.swing.JMenuBar();
        mnHome = new javax.swing.JMenu();
        itemChangepass = new javax.swing.JMenuItem();
        itemLogout = new javax.swing.JMenuItem();
        mnCatalog = new javax.swing.JMenu();
        itemCustomer = new javax.swing.JMenuItem();
        itemCard = new javax.swing.JMenuItem();
        mnTransaction = new javax.swing.JMenu();
        itemDeposit = new javax.swing.JMenuItem();
        itemWithdraw = new javax.swing.JMenuItem();
        itemTransfer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ClosingForm(evt);
            }
        });

        javax.swing.GroupLayout panelStaffLayout = new javax.swing.GroupLayout(panelStaff);
        panelStaff.setLayout(panelStaffLayout);
        panelStaffLayout.setHorizontalGroup(
            panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        panelStaffLayout.setVerticalGroup(
            panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );

        menuStaff.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        mnHome.setText("Trang chủ");
        mnHome.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        itemChangepass.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        itemChangepass.setText("Đổi mật khẩu");
        itemChangepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassword(evt);
            }
        });
        mnHome.add(itemChangepass);

        itemLogout.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        itemLogout.setText("Đăng xuất");
        itemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout(evt);
            }
        });
        mnHome.add(itemLogout);

        menuStaff.add(mnHome);

        mnCatalog.setText("Danh mục");
        mnCatalog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnCatalog.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        itemCustomer.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        itemCustomer.setText("Quản lý khách hàng");
        itemCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerManagement(evt);
            }
        });
        mnCatalog.add(itemCustomer);

        itemCard.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        itemCard.setText("Quản lý thẻ");
        itemCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardManagement(evt);
            }
        });
        mnCatalog.add(itemCard);

        menuStaff.add(mnCatalog);

        mnTransaction.setText("Phiên giao dịch");
        mnTransaction.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        itemDeposit.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        itemDeposit.setText("Nộp tiền");
        mnTransaction.add(itemDeposit);

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
                Transfer(evt);
            }
        });
        mnTransaction.add(itemTransfer);

        menuStaff.add(mnTransaction);

        setJMenuBar(menuStaff);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelStaff, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelStaff)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChangePassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassword
        if (pass == null || pass.isClosed()) {
            pass = new frmChangePassword(this, null);
            pass.setLocation(this.getWidth() / 2 - pass.getWidth() / 2, (this.getHeight() - 20) / 2 - pass.getHeight() / 2 - 20);
            panelStaff.add(pass);
            pass.setVisible(true);
        } else {
            pass.setLocation(this.getWidth() / 2 - pass.getWidth() / 2, (this.getHeight() - 20) / 2 - pass.getHeight() / 2 - 20);
            pass.setVisible(true);
        }
    }//GEN-LAST:event_ChangePassword

    private void ClosingForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ClosingForm
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát ứng dụng?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) != JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        } else {
            usr = name = role = null;
            this.setTitle(null);
            this.dispose();
            new frmLogin().setVisible(true);
        }
    }//GEN-LAST:event_ClosingForm

    private void Logout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) != JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        } else {
            usr = name = role = null;
            this.setTitle(null);
            this.dispose();
            new frmLogin().setVisible(true);
        }
    }//GEN-LAST:event_Logout

    private void CustomerManagement(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerManagement
        frmCustomerManagement.bank = bank;
        frmCustomerManagement.manage = manage;
        if (cst == null || cst.isClosed()) {
            cst = new frmCustomerManagement(this);
            cst.setLocation(this.getWidth() / 2 - cst.getWidth() / 2, (this.getHeight() - 20) / 2 - cst.getHeight() / 2 - 20);
            panelStaff.add(cst);
            cst.setVisible(true);
        } else {
            cst.setLocation(this.getWidth() / 2 - cst.getWidth() / 2, (this.getHeight() - 20) / 2 - cst.getHeight() / 2 - 20);
            cst.setVisible(true);
        }
    }//GEN-LAST:event_CustomerManagement

    private void CardManagement(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardManagement
        if (bnk == null || bnk.isClosed()) {
            bnk = new frmBanks(null, this);
            bnk.setLocation(this.getWidth() / 2 - bnk.getWidth() / 2, (this.getHeight() - 20) / 2 - bnk.getHeight() / 2 - 20);
            panelStaff.add(bnk);
            bnk.setVisible(true);
        } else {
            bnk.setLocation(this.getWidth() / 2 - bnk.getWidth() / 2, (this.getHeight() - 20) / 2 - bnk.getHeight() / 2 - 20);
            bnk.setVisible(true);
        }
    }//GEN-LAST:event_CardManagement

    private void Withdraw(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Withdraw
        if (wit == null || wit.isClosed()) {
            wit = new frmWithdraws(this);
            wit.setLocation(this.getWidth() / 2 - wit.getWidth() / 2, (this.getHeight() - 20) / 2 - wit.getHeight() / 2 - 20);
            panelStaff.add(wit);
            wit.setVisible(true);
        } else {
            wit.setLocation(this.getWidth() / 2 - wit.getWidth() / 2, (this.getHeight() - 20) / 2 - wit.getHeight() / 2 - 20);
            wit.setVisible(true);
        }
    }//GEN-LAST:event_Withdraw

    private void Transfer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Transfer

    }//GEN-LAST:event_Transfer

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
            new frmStaff().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCard;
    private javax.swing.JMenuItem itemChangepass;
    private javax.swing.JMenuItem itemCustomer;
    private javax.swing.JMenuItem itemDeposit;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JMenuItem itemTransfer;
    private javax.swing.JMenuItem itemWithdraw;
    private javax.swing.JMenuBar menuStaff;
    private javax.swing.JMenu mnCatalog;
    private javax.swing.JMenu mnHome;
    private javax.swing.JMenu mnTransaction;
    private javax.swing.JDesktopPane panelStaff;
    // End of variables declaration//GEN-END:variables
}
