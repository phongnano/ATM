package GUIS;

import Customers.BLL_Customers;
import Customers.DAL_Cusomters;
import Customers.DTO_Customers;
import Transactions.BLL_Transactions;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import javax.swing.JOptionPane;

public class frmDeposit extends javax.swing.JFrame {

    DTO_Customers dto = new DTO_Customers();
    DAL_Cusomters dal = new DAL_Cusomters();
    BLL_Customers bll = new BLL_Customers();

    BLL_Transactions bll_trans = new BLL_Transactions();

    Locale loc = new Locale("vi", "VN");
    Currency vnd = Currency.getInstance(loc);
    NumberFormat vndFormat = NumberFormat.getCurrencyInstance(loc);

    public frmDeposit() {
        initComponents();
        lblInput_2.setVisible(false);
        txtBalance.setVisible(false);
        txtMoney.setVisible(false);
        btnDeposit.setVisible(false);
    }

    private void ResetValue() {
        txtAccount.setText("");
        txtBalance.setText("");
        txtMoney.setText("");

        lblInput_2.setVisible(false);
        txtBalance.setVisible(false);
        txtMoney.setVisible(false);
        btnDeposit.setVisible(false);
        txtAccount.setEditable(true);
        txtAccount.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeposit = new javax.swing.JPanel();
        txtAccount = new javax.swing.JTextField();
        lblInput_1 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        lblInput_2 = new javax.swing.JLabel();
        txtMoney = new javax.swing.JTextField();
        btnDeposit = new javax.swing.JButton();
        txtBalance = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        setResizable(false);

        panelDeposit.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NẠP TIỀN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        txtAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccount.setToolTipText("Vui lòng nhập cmnd hoặc số tài khoản");
        txtAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkID(evt);
            }
        });

        lblInput_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInput_1.setText("Mời bạn nhập cmnd hoặc số tài khoản:");

        btnCheck.setText("Xác thực");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInfo(evt);
            }
        });

        lblInput_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInput_2.setText("Nhập số tiền cần nộp:");

        txtMoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMoney.setToolTipText("Vui lòng nhập số tiền bạn cần nộp");
        txtMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkMoney(evt);
            }
        });

        btnDeposit.setText("Nộp tiền");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deposit(evt);
            }
        });

        txtBalance.setEditable(false);
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalance.setToolTipText("Đây là số tiền hiện tại trong tài khoản của bạn");

        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel(evt);
            }
        });

        javax.swing.GroupLayout panelDepositLayout = new javax.swing.GroupLayout(panelDeposit);
        panelDeposit.setLayout(panelDepositLayout);
        panelDepositLayout.setHorizontalGroup(
            panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDepositLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInput_1)
                    .addComponent(lblInput_2))
                .addGap(18, 18, 18)
                .addGroup(panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDepositLayout.createSequentialGroup()
                        .addComponent(txtMoney)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeposit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDepositLayout.createSequentialGroup()
                        .addGroup(panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                            .addComponent(txtBalance))
                        .addGap(18, 18, 18)
                        .addGroup(panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelDepositLayout.setVerticalGroup(
            panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDepositLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInput_1)
                    .addComponent(btnCheck))
                .addGap(18, 18, 18)
                .addGroup(panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addGroup(panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInput_2)
                    .addComponent(btnDeposit))
                .addContainerGap(390, Short.MAX_VALUE))
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

    private void checkID(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkID
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
        if (txtAccount.getText().length() == 12) {
            evt.consume();
        }
    }//GEN-LAST:event_checkID

    private void checkInfo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInfo
        dto.setId(txtAccount.getText());
        dto.setBalance(dal.getBalance(dto.getId()));
        if (txtAccount.getText().length() == 9) {
            if (bll.CheckID(dto)) {
                txtAccount.setEditable(false);
                lblInput_2.setVisible(true);
                txtMoney.setVisible(true);
                btnDeposit.setVisible(true);
                txtBalance.setVisible(true);
                txtBalance.setText(String.valueOf(vndFormat.format(dto.getBalance())));
            } else {
                JOptionPane.showMessageDialog(null, "CMND của bạn không đúng", "Thông báo", JOptionPane.WARNING_MESSAGE);
                txtAccount.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CMND phải đúng 9 ki tự", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtAccount.requestFocus();
        }
    }//GEN-LAST:event_checkInfo

    private void checkMoney(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkMoney
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
        if (txtMoney.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_checkMoney

    private void Deposit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deposit
        try {
            if (!txtMoney.getText().isEmpty()) {
                dto.setAmount(Integer.parseInt(txtMoney.getText()));
                if (dto.getAmount() < 50000 || dto.getAmount() > 2000000000) {
                    JOptionPane.showMessageDialog(null, "Số tiền nộp từ 50.000đ tới 2.000.000.000đ", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    txtMoney.requestFocus();
                } else {
                    if (dto.getAmount() % 50000 == 0) {
                        dto.deposit(dto.getAmount());
                        bll_trans.Withdraw(dto.getBalance(), dto.getId());
                        JOptionPane.showMessageDialog(null, "Nộp tiền thành công"
                                + "\nSố dư hiện tại trong tài khoản sau khi nộp là " + vndFormat.format(dto.getBalance()), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        ResetValue();
                    } else {
                        JOptionPane.showMessageDialog(null, "Số tiền bạn nộp không hợp lệ", "Thông báo", JOptionPane.WARNING_MESSAGE);
                        txtMoney.requestFocus();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Dữ liệu không được bỏ trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
                txtMoney.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Dữ liệu không hợp lệ: " + e, "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Deposit

    private void btnCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel
        ResetValue();
    }//GEN-LAST:event_btnCancel

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
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JLabel lblInput_1;
    private javax.swing.JLabel lblInput_2;
    private javax.swing.JPanel panelDeposit;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables
}
