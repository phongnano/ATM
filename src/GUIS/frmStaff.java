package GUIS;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmStaff extends javax.swing.JFrame {

    public static String usr, name, role;
    private frmChangePassword pass;
    private frmCustomerManagement cust;
    private frmBanks bnk;

    public frmStaff() {
        initComponents();
        this.setTitle("Tài khoản: " + usr + "\tHọ tên: " + name + "\tChức vụ: " + role);
        mnHome.setIcon(new ImageIcon(getClass().getResource("/Images/icon/home.png")));
        itemChangepass.setIcon(new ImageIcon(getClass().getResource("/Images/icon/changepass.png")));
        itemLogout.setIcon(new ImageIcon(getClass().getResource("/Images/icon/logout.png")));
        mnCatalog.setIcon(new ImageIcon(getClass().getResource("/Images/icon/catalog.png")));
        itemCustomer.setIcon(new ImageIcon(getClass().getResource("/Images/icon/customer.png")));
        itemCard.setIcon(new ImageIcon(getClass().getResource("/Images/icon/card.png")));
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
            .addGap(0, 1288, Short.MAX_VALUE)
        );
        panelStaffLayout.setVerticalGroup(
            panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        mnHome.setText("Trang chủ");

        itemChangepass.setText("Đổi mật khẩu");
        itemChangepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassword(evt);
            }
        });
        mnHome.add(itemChangepass);

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

        itemCustomer.setText("Quản lý khách hàng");
        itemCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerManagement(evt);
            }
        });
        mnCatalog.add(itemCustomer);

        itemCard.setText("Quản lý thẻ");
        itemCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardManagement(evt);
            }
        });
        mnCatalog.add(itemCard);

        menuStaff.add(mnCatalog);

        setJMenuBar(menuStaff);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStaff)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStaff)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChangePassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassword
        if (pass == null || pass.isClosed()) {
            pass = new frmChangePassword(this);
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
            new frmHome().setVisible(true);
        }
    }//GEN-LAST:event_ClosingForm

    private void Logout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) != JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        } else {
            usr = name = role = null;
            this.setTitle(null);
            this.dispose();
            new frmHome().setVisible(true);
        }
    }//GEN-LAST:event_Logout

    private void CustomerManagement(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerManagement
        if (cust == null || cust.isClosed()) {
            cust = new frmCustomerManagement(this);
            cust.setLocation(this.getWidth() / 2 - cust.getWidth() / 2, (this.getHeight() - 20) / 2 - cust.getHeight() / 2 - 20);
            panelStaff.add(cust);
            cust.setVisible(true);
        } else {
            cust.setLocation(this.getWidth() / 2 - cust.getWidth() / 2, (this.getHeight() - 20) / 2 - cust.getHeight() / 2 - 20);
            cust.setVisible(true);
        }
    }//GEN-LAST:event_CustomerManagement

    private void CardManagement(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardManagement
        if (bnk == null || bnk.isClosed()) {
            bnk = new frmBanks(this);
            bnk.setLocation(this.getWidth() / 2 - bnk.getWidth() / 2, (this.getHeight() - 20) / 2 - bnk.getHeight() / 2 - 20);
            panelStaff.add(bnk);
            bnk.setVisible(true);
        } else {
            bnk.setLocation(this.getWidth() / 2 - bnk.getWidth() / 2, (this.getHeight() - 20) / 2 - bnk.getHeight() / 2 - 20);
            bnk.setVisible(true);
        }
    }//GEN-LAST:event_CardManagement

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new frmStaff().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCard;
    private javax.swing.JMenuItem itemChangepass;
    private javax.swing.JMenuItem itemCustomer;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JMenuBar menuStaff;
    private javax.swing.JMenu mnCatalog;
    private javax.swing.JMenu mnHome;
    private javax.swing.JDesktopPane panelStaff;
    // End of variables declaration//GEN-END:variables
}
