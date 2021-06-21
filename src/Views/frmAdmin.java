package Views;

import javax.swing.ImageIcon;

public class frmAdmin extends javax.swing.JFrame {

    public static String usr, name, role;
    frmBanks bnk;
    frmStaffManagement stf;

    public frmAdmin() {
        initComponents();

        this.setTitle("Tài khoản: " + usr + "\tMật khẩu: " + name + "\tChức vụ: " + role);
        mnHome.setIcon(new ImageIcon(getClass().getResource("/Images/icon/home.png")));

        mnManagement.setIcon(new ImageIcon(getClass().getResource("/Images/icon/catalog.png")));
        itemBankManagement.setIcon(new ImageIcon(getClass().getResource("/Images/icon/bankmanagement.png")));
        itemStaffManagement.setIcon(new ImageIcon(getClass().getResource("/Images/icon/staffmanagement.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAdmin = new javax.swing.JDesktopPane();
        menuAdmin = new javax.swing.JMenuBar();
        mnHome = new javax.swing.JMenu();
        mnManagement = new javax.swing.JMenu();
        itemBankManagement = new javax.swing.JMenuItem();
        itemStaffManagement = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN");
        setResizable(false);

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1700, Short.MAX_VALUE)
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );

        menuAdmin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        mnHome.setForeground(new java.awt.Color(153, 153, 0));
        mnHome.setText("Trang chủ");
        mnHome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        menuAdmin.add(mnHome);

        mnManagement.setForeground(new java.awt.Color(102, 0, 255));
        mnManagement.setText("Danh mục quản lý");
        mnManagement.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        itemBankManagement.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        itemBankManagement.setText("Quản lý ngân hàng");
        itemBankManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankManagement(evt);
            }
        });
        mnManagement.add(itemBankManagement);

        itemStaffManagement.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        itemStaffManagement.setText("Quản lý nhân viên");
        itemStaffManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffManagement(evt);
            }
        });
        mnManagement.add(itemStaffManagement);

        menuAdmin.add(mnManagement);

        setJMenuBar(menuAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdmin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdmin)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BankManagement(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankManagement
        if (bnk == null || bnk.isClosed()) {
            bnk = new frmBanks(this, null);
            bnk.setLocation(this.getWidth() / 2 - bnk.getWidth() / 2, (this.getHeight() - 20) / 2 - bnk.getHeight() / 2 - 20);
            panelAdmin.add(bnk);
            bnk.setVisible(true);
        } else {
            bnk.setLocation(this.getWidth() / 2 - bnk.getWidth() / 2, (this.getHeight() - 20) / 2 - bnk.getHeight() / 2 - 20);
            bnk.setVisible(true);
        }
    }//GEN-LAST:event_BankManagement

    private void StaffManagement(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffManagement
        if (stf == null || stf.isClosed()) {
            stf = new frmStaffManagement(this);
            stf.setLocation(this.getWidth() / 2 - stf.getWidth() / 2, (this.getHeight() - 20) / 2 - stf.getHeight() / 2 - 20);
            panelAdmin.add(stf);
            stf.setVisible(true);
        } else {
            stf.setLocation(this.getWidth() / 2 - stf.getWidth() / 2, (this.getHeight() - 20) / 2 - stf.getHeight() / 2 - 20);
            stf.setVisible(true);
        }
    }//GEN-LAST:event_StaffManagement

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
            new frmAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemBankManagement;
    private javax.swing.JMenuItem itemStaffManagement;
    private javax.swing.JMenuBar menuAdmin;
    private javax.swing.JMenu mnHome;
    private javax.swing.JMenu mnManagement;
    private javax.swing.JDesktopPane panelAdmin;
    // End of variables declaration//GEN-END:variables
}
