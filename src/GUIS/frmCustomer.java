package GUIS;

public class frmCustomer extends javax.swing.JFrame {

    public static String usr, name, role, acc;

    public frmCustomer() {
        initComponents();
        this.setTitle("Tài khoản: " + usr + "\tHọ tên: " + name + "\tChức vụ: " + role);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuCustomer = new javax.swing.JMenuBar();
        mnHome = new javax.swing.JMenu();
        mnTransaction = new javax.swing.JMenu();
        itemTrans = new javax.swing.JMenuItem();
        itemCheckBalance = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CUSTOMER");
        setResizable(false);

        menuCustomer.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        mnHome.setForeground(new java.awt.Color(51, 0, 153));
        mnHome.setText("Trang chủ");
        mnHome.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        menuCustomer.add(mnHome);

        mnTransaction.setForeground(new java.awt.Color(204, 51, 0));
        mnTransaction.setText("Giao dịch");
        mnTransaction.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        itemTrans.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        itemTrans.setText("Chuyển tiền");
        itemTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tranfers(evt);
            }
        });
        mnTransaction.add(itemTrans);

        itemCheckBalance.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        itemCheckBalance.setText("Xem số dư");
        mnTransaction.add(itemCheckBalance);

        menuCustomer.add(mnTransaction);

        setJMenuBar(menuCustomer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tranfers(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tranfers
        frmTransfer.account = acc;
        new frmTransfer().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_Tranfers

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new frmCustomer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCheckBalance;
    private javax.swing.JMenuItem itemTrans;
    private javax.swing.JMenuBar menuCustomer;
    private javax.swing.JMenu mnHome;
    private javax.swing.JMenu mnTransaction;
    // End of variables declaration//GEN-END:variables
}
