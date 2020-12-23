package GUIS;

import Customers.BLL_Customers;
import Customers.DTO_Customers;
import javax.swing.JOptionPane;

public class frmDeposit extends javax.swing.JFrame {

    DTO_Customers dto = new DTO_Customers();
    BLL_Customers bll = new BLL_Customers();

    public frmDeposit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeposit = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        lblInput = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        setResizable(false);

        panelDeposit.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NẠP TIỀN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        txtInput.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInput.setToolTipText("Vui lòng nhập cmnd hoặc số tài khoản");
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkInput(evt);
            }
        });

        lblInput.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblInput.setText("Mời bạn nhập cmnd hoặc số tài khoản:");

        btnCheck.setText("Xác thực");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInfo(evt);
            }
        });

        javax.swing.GroupLayout panelDepositLayout = new javax.swing.GroupLayout(panelDeposit);
        panelDeposit.setLayout(panelDepositLayout);
        panelDepositLayout.setHorizontalGroup(
            panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDepositLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInput)
                .addGap(18, 18, 18)
                .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCheck)
                .addContainerGap())
        );
        panelDepositLayout.setVerticalGroup(
            panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDepositLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInput)
                    .addComponent(btnCheck))
                .addContainerGap(521, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkInput(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkInput
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
        if (txtInput.getText().length() == 12) {
            evt.consume();
        }
    }//GEN-LAST:event_checkInput

    private void checkInfo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInfo
        dto.setId(txtInput.getText());
        if (bll.CheckID(dto)) {
            JOptionPane.showMessageDialog(null, "OK");
        } else {
            JOptionPane.showMessageDialog(null, "NOT OK");
        }
    }//GEN-LAST:event_checkInfo

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new frmDeposit().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel lblInput;
    private javax.swing.JPanel panelDeposit;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
