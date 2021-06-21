package Views;

import Limits.LimitText;
import Models.DTO_Transactions;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class frmWithdraws extends javax.swing.JInternalFrame {

    Locale loc = new Locale("vi", "VN");
    Currency vnd = Currency.getInstance(loc);
    NumberFormat vndFormat = NumberFormat.getCurrencyInstance(loc);
    frmStaff stf;

    DTO_Transactions dto = new DTO_Transactions();

    public frmWithdraws(frmStaff staff) {
        initComponents();
        this.stf = staff;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panWithdraw = new javax.swing.JPanel();
        lblACcount = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        panWit = new javax.swing.JPanel();
        txtBalance = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        btnWithdraw = new javax.swing.JButton();
        btnRedo = new javax.swing.JButton();

        setClosable(true);

        panWithdraw.setBackground(new java.awt.Color(255, 255, 255));
        panWithdraw.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RÚT TIỀN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 51, 102))); // NOI18N

        lblACcount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblACcount.setText("Mời bạn nhập cmnd/thẻ/số tài khoản");

        txtAccount.setDocument(new LimitText(9));
        txtAccount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkAccount(evt);
            }
        });

        btnCheck.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCheck.setText("Kiểm tra");

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancel.setText("Hủy");

        panWit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtBalance.setEditable(false);
        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAmount.setDocument(new LimitText(10));
        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                verifyBalance(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkValidMoney(evt);
            }
        });

        btnWithdraw.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnWithdraw.setText("Rút tiền");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Withdraw(evt);
            }
        });

        btnRedo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnRedo.setText("Làm lại");

        javax.swing.GroupLayout panWitLayout = new javax.swing.GroupLayout(panWit);
        panWit.setLayout(panWitLayout);
        panWitLayout.setHorizontalGroup(
            panWitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWitLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(panWitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panWitLayout.createSequentialGroup()
                        .addComponent(btnWithdraw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addComponent(btnRedo))
                    .addComponent(txtBalance)
                    .addComponent(txtAmount))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panWitLayout.setVerticalGroup(
            panWitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(panWitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdraw)
                    .addComponent(btnRedo))
                .addContainerGap())
        );

        javax.swing.GroupLayout panWithdrawLayout = new javax.swing.GroupLayout(panWithdraw);
        panWithdraw.setLayout(panWithdrawLayout);
        panWithdrawLayout.setHorizontalGroup(
            panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWithdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panWit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panWithdrawLayout.createSequentialGroup()
                        .addComponent(lblACcount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnCheck)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panWithdrawLayout.setVerticalGroup(
            panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWithdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck)
                    .addComponent(btnCancel)
                    .addComponent(lblACcount))
                .addGap(18, 18, 18)
                .addComponent(panWit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkAccount(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkAccount
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_checkAccount

    private void checkValidMoney(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkValidMoney
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
        if (txtAmount.getText().isEmpty() || txtAmount.getText() == null) {
            txtBalance.setText("");
        }
    }//GEN-LAST:event_checkValidMoney

    private void Withdraw(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Withdraw

    }//GEN-LAST:event_Withdraw

    private void verifyBalance(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verifyBalance
        if (txtAmount.getText().isEmpty() || txtAmount.getText() == null) {
        } else {
            dto.setAmount(Integer.parseInt(txtAmount.getText()));
            txtBalance.setText(vndFormat.format(dto.getAmount()));
        }
    }//GEN-LAST:event_verifyBalance

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnRedo;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel lblACcount;
    private javax.swing.JPanel panWit;
    private javax.swing.JPanel panWithdraw;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBalance;
    // End of variables declaration//GEN-END:variables
}
