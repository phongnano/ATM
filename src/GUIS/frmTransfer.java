package GUIS;

import Customers.BLL_Customers;
import Customers.DAL_Cusomters;
import Customers.DTO_Customers;
import Limits.LimitText;
import Transactions.BLL_Transactions;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class frmTransfer extends javax.swing.JFrame {

    DTO_Customers dto = new DTO_Customers();
    DAL_Cusomters dal = new DAL_Cusomters();
    BLL_Customers bll = new BLL_Customers();

    BLL_Transactions bll_trans = new BLL_Transactions();

    Locale loc = new Locale("vi", "VN");
    Currency vnd = Currency.getInstance(loc);
    NumberFormat vndFormat = NumberFormat.getCurrencyInstance(loc);

    JButton btn;
    Object obj;

    public static String account;
    public static long balance_send, balance_receive;

    public frmTransfer() {
        initComponents();
        panTransfer.setVisible(false);
        txtID.setVisible(false);
        txtAccount.setVisible(false);
        txtBalance.setVisible(false);
        btnCheck.setVisible(false);
        btnCancel.setVisible(false);
    }

    private void ResetValue() {
        txtID.setText("");
        txtID.requestFocus();
        txtMoney.setText("");
        radioAccount.setEnabled(true);
        txtID.setEditable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groups = new javax.swing.ButtonGroup();
        panTrans = new javax.swing.JPanel();
        radioCard = new javax.swing.JRadioButton();
        radioAccount = new javax.swing.JRadioButton();
        txtID = new javax.swing.JTextField();
        panTransfer = new javax.swing.JPanel();
        txtMoney = new javax.swing.JTextField();
        btnTransfer = new javax.swing.JButton();
        btn1000 = new javax.swing.JButton();
        btn3000 = new javax.swing.JButton();
        btn5000 = new javax.swing.JButton();
        btn7000 = new javax.swing.JButton();
        btn2000 = new javax.swing.JButton();
        btn4000 = new javax.swing.JButton();
        btn6000 = new javax.swing.JButton();
        btnOther = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtAccount = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panTrans.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHUYỂN TIỀN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(51, 0, 204))); // NOI18N

        groups.add(radioCard);
        radioCard.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        radioCard.setForeground(new java.awt.Color(153, 51, 0));
        radioCard.setText("Số thẻ người nhận");
        radioCard.setEnabled(false);
        radioCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCard(evt);
            }
        });

        groups.add(radioAccount);
        radioAccount.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        radioAccount.setForeground(new java.awt.Color(153, 51, 0));
        radioAccount.setText("Số tài khoản người nhận");
        radioAccount.setToolTipText("");
        radioAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAccount(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setToolTipText("Nhập số thẻ hoặc số tài khoàn người nhận"); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkData(evt);
            }
        });

        panTransfer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtMoney.setEditable(false);
        txtMoney.setDocument(new LimitText(10));
        txtMoney.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtMoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMoney.setToolTipText("Vui lòng nhập cmnd hoặc số tài khoản");
        txtMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkValidMoney(evt);
            }
        });

        btnTransfer.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnTransfer.setForeground(new java.awt.Color(204, 51, 0));
        btnTransfer.setText("Chuyển tiền");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfer(evt);
            }
        });

        btn1000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn1000.setForeground(new java.awt.Color(51, 102, 0));
        btn1000.setText("1.000.000");
        btn1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValue(evt);
            }
        });

        btn3000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn3000.setForeground(new java.awt.Color(51, 102, 0));
        btn3000.setText("3.000.000");
        btn3000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValue(evt);
            }
        });

        btn5000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn5000.setForeground(new java.awt.Color(51, 102, 0));
        btn5000.setText("5.000.000");
        btn5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValue(evt);
            }
        });

        btn7000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn7000.setForeground(new java.awt.Color(51, 102, 0));
        btn7000.setText("7.000.000");
        btn7000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValue(evt);
            }
        });

        btn2000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn2000.setForeground(new java.awt.Color(51, 102, 0));
        btn2000.setText("2.000.000");
        btn2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValue(evt);
            }
        });

        btn4000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn4000.setForeground(new java.awt.Color(51, 102, 0));
        btn4000.setText("4.000.000");
        btn4000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValue(evt);
            }
        });

        btn6000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn6000.setForeground(new java.awt.Color(51, 102, 0));
        btn6000.setText("6.000.000");
        btn6000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValue(evt);
            }
        });

        btnOther.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnOther.setForeground(new java.awt.Color(51, 102, 0));
        btnOther.setText("Số khác");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValue(evt);
            }
        });

        javax.swing.GroupLayout panTransferLayout = new javax.swing.GroupLayout(panTransfer);
        panTransfer.setLayout(panTransferLayout);
        panTransferLayout.setHorizontalGroup(
            panTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTransferLayout.createSequentialGroup()
                .addGroup(panTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTransferLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1000)
                            .addComponent(btn3000)
                            .addComponent(btn5000)
                            .addComponent(btn7000))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn2000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOther, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panTransferLayout.createSequentialGroup()
                        .addGroup(panTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panTransferLayout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addComponent(btnTransfer))
                            .addGroup(panTransferLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 170, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panTransferLayout.setVerticalGroup(
            panTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTransferLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTransferLayout.createSequentialGroup()
                        .addComponent(btn1000)
                        .addGap(18, 18, 18)
                        .addComponent(btn3000)
                        .addGap(18, 18, 18)
                        .addComponent(btn5000)
                        .addGap(18, 18, 18)
                        .addComponent(btn7000))
                    .addGroup(panTransferLayout.createSequentialGroup()
                        .addComponent(btn2000)
                        .addGap(18, 18, 18)
                        .addComponent(btn4000)
                        .addGap(18, 18, 18)
                        .addComponent(btn6000)
                        .addGap(18, 18, 18)
                        .addComponent(btnOther)))
                .addGap(18, 18, 18)
                .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTransfer)
                .addContainerGap())
        );

        btnCheck.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCheck.setForeground(new java.awt.Color(204, 102, 0));
        btnCheck.setText("Kiểm tra");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheck(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(204, 102, 0));
        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel(evt);
            }
        });

        txtAccount.setEditable(false);
        txtAccount.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccount.setToolTipText("Đây là số tài khoàn của người gửi"); // NOI18N

        txtBalance.setEditable(false);
        txtBalance.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalance.setToolTipText("Đây là số dư của người gửi"); // NOI18N

        javax.swing.GroupLayout panTransLayout = new javax.swing.GroupLayout(panTrans);
        panTrans.setLayout(panTransLayout);
        panTransLayout.setHorizontalGroup(
            panTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTransLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioAccount)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTransLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(panTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(panTransLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addGroup(panTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panTransLayout.createSequentialGroup()
                        .addComponent(btnCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addComponent(txtID)
                    .addComponent(txtAccount)
                    .addComponent(txtBalance))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panTransLayout.setVerticalGroup(
            panTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTransLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCard)
                    .addComponent(radioAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(panTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkData(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkData
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_checkData

    private void radioCard(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCard
        txtID.setEditable(true);
        txtID.setText("");
        txtID.requestFocus(true);
    }//GEN-LAST:event_radioCard

    private void radioAccount(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAccount
        txtID.setVisible(true);
        txtID.setText("");
        txtID.requestFocus(true);
        btnCheck.setVisible(true);
        btnCancel.setVisible(true);

        txtAccount.setVisible(true);
        txtBalance.setVisible(true);

        txtAccount.setText(account);
        balance_send = dal.getBalance(account);
        dto.setBalance(balance_send);
        txtBalance.setText(String.valueOf(vndFormat.format(dto.getBalance())));
    }//GEN-LAST:event_radioAccount

    private void btnTransfer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfer
        dto.setAccount(account);
        dto.setId(txtID.getText());
        dto.setAmount(Long.parseLong(txtMoney.getText()));
        if (txtID.getText().isEmpty()) {
        } else {
            int amount = Integer.parseInt(txtMoney.getText());
            if (amount < 50000 || amount > 2000000000) {
                JOptionPane.showMessageDialog(null, "Số tiền nộp từ 50.000đ tới 2.000.000.000đ", "Thông báo", JOptionPane.WARNING_MESSAGE);
            } else {
                bll_trans.Transfer(dto.getAmount(), account, dto.getId());
                JOptionPane.showMessageDialog(null, "Chuyển tiền thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnTransfer

    private void btnCheck(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheck
        dto.setId(txtID.getText());
        if (!dto.getId().isEmpty()) {
            if (txtID.getText().length() == 9) {
                if (bll.CheckID(dto)) {
                    if (dto.getId().equals(account)) {
                    } else {
                        panTransfer.setVisible(true);
                        radioAccount.setEnabled(false);
                        txtID.setEditable(false);
                        balance_receive = dal.getBalance(dto.getId());
                        radioCard.setText(String.valueOf(vndFormat.format(balance_receive)));
                    }
                } else {
                    panTransfer.setVisible(false);
                    txtMoney.setText(null);
                    txtMoney.setEditable(false);
                    JOptionPane.showMessageDialog(null, "Số tài khoản người nhận không đúng", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    txtID.requestFocus();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dữ liệu không được bỏ trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtID.requestFocus();
        }
    }//GEN-LAST:event_btnCheck

    private void btnCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel
        ResetValue();
    }//GEN-LAST:event_btnCancel

    private void checkValue(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkValue
        obj = evt.getSource();
        btn = (JButton) obj;
        if (txtID.getText().isEmpty()) {
            txtMoney.setText("");
            txtMoney.setEditable(false);
        } else {
            if (obj instanceof JButton) {
                txtMoney.setText(btn.getText().replace(".", ""));
                txtMoney.setEditable(false);
            }
            if (btn.getText().equals("Số khác")) {
                txtMoney.setText("");
                txtMoney.requestFocus();
                txtMoney.setEditable(true);
            }
        }
    }//GEN-LAST:event_checkValue

    private void checkValidMoney(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkValidMoney
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_checkValidMoney

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new frmTransfer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1000;
    private javax.swing.JButton btn2000;
    private javax.swing.JButton btn3000;
    private javax.swing.JButton btn4000;
    private javax.swing.JButton btn5000;
    private javax.swing.JButton btn6000;
    private javax.swing.JButton btn7000;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnOther;
    private javax.swing.JButton btnTransfer;
    private javax.swing.ButtonGroup groups;
    private javax.swing.JPanel panTrans;
    private javax.swing.JPanel panTransfer;
    private javax.swing.JRadioButton radioAccount;
    private javax.swing.JRadioButton radioCard;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables
}
