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

public class frmWithdraw extends javax.swing.JFrame {

    DTO_Customers dto = new DTO_Customers();
    DAL_Cusomters dal = new DAL_Cusomters();
    BLL_Customers bll = new BLL_Customers();

    BLL_Transactions bll_trans = new BLL_Transactions();

    Locale loc = new Locale("vi", "VN");
    Currency vnd = Currency.getInstance(loc);
    NumberFormat vndFormat = NumberFormat.getCurrencyInstance(loc);
    JButton btn;
    Object obj;

    public frmWithdraw() {
        initComponents();
        panWithdraw.setVisible(false);
        txtMoney.setEditable(false);
    }

    private void ResetValue() {
        txtAccount.setText("");
        txtBalance.setText("");
        txtMoney.setText("");
        panWithdraw.setVisible(false);
        txtAccount.setEditable(true);
        txtAccount.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWithdraw = new javax.swing.JPanel();
        lblInput = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        panWithdraw = new javax.swing.JPanel();
        btnWithdraw = new javax.swing.JButton();
        btn1000 = new javax.swing.JButton();
        btn3000 = new javax.swing.JButton();
        btn5000 = new javax.swing.JButton();
        btn7000 = new javax.swing.JButton();
        btn2000 = new javax.swing.JButton();
        btn4000 = new javax.swing.JButton();
        btn6000 = new javax.swing.JButton();
        btnOther = new javax.swing.JButton();
        txtMoney = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelWithdraw.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RÚT TIỀN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(0, 0, 153))); // NOI18N

        lblInput.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblInput.setForeground(new java.awt.Color(102, 0, 204));
        lblInput.setText("Mời bạn nhập cmnd hoặc số tài khoản:");

        txtAccount.setDocument(new LimitText(12));
        txtAccount.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccount.setToolTipText("Vui lòng nhập cmnd hoặc số tài khoản");
        txtAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkInput(evt);
            }
        });

        btnCheck.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCheck.setForeground(new java.awt.Color(0, 153, 51));
        btnCheck.setText("Xác thực");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheck(evt);
            }
        });

        panWithdraw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnWithdraw.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(0, 153, 51));
        btnWithdraw.setText("Rút tiền");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdraw(evt);
            }
        });

        btn1000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn1000.setForeground(new java.awt.Color(255, 102, 102));
        btn1000.setText("1.000.000");
        btn1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn3000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn3000.setForeground(new java.awt.Color(255, 102, 102));
        btn3000.setText("3.000.000");
        btn3000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn5000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn5000.setForeground(new java.awt.Color(255, 102, 102));
        btn5000.setText("5.000.000");
        btn5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn7000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn7000.setForeground(new java.awt.Color(255, 102, 102));
        btn7000.setText("7.000.000");
        btn7000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn2000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn2000.setForeground(new java.awt.Color(255, 102, 102));
        btn2000.setText("2.000.000");
        btn2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn4000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn4000.setForeground(new java.awt.Color(255, 102, 102));
        btn4000.setText("4.000.000");
        btn4000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn6000.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn6000.setForeground(new java.awt.Color(255, 102, 102));
        btn6000.setText("6.000.000");
        btn6000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btnOther.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnOther.setForeground(new java.awt.Color(255, 102, 102));
        btnOther.setText("Số khác");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        txtMoney.setDocument(new LimitText(10));
        txtMoney.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtMoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMoney.setToolTipText("Vui lòng nhập số tiền bạn cần rút");
        txtMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkValidMoney(evt);
            }
        });

        txtBalance.setEditable(false);
        txtBalance.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalance.setToolTipText("Đây là số tiền hiện tại trong tài khoản của bạn");

        javax.swing.GroupLayout panWithdrawLayout = new javax.swing.GroupLayout(panWithdraw);
        panWithdraw.setLayout(panWithdrawLayout);
        panWithdrawLayout.setHorizontalGroup(
            panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWithdrawLayout.createSequentialGroup()
                .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panWithdrawLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panWithdrawLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1000)
                            .addComponent(btn7000)
                            .addComponent(btn3000)
                            .addComponent(btn5000))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn2000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOther, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(panWithdrawLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMoney, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panWithdrawLayout.setVerticalGroup(
            panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWithdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panWithdrawLayout.createSequentialGroup()
                        .addComponent(btn1000)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btn3000)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btn5000)
                        .addGap(18, 18, 18)
                        .addComponent(btn7000))
                    .addGroup(panWithdrawLayout.createSequentialGroup()
                        .addComponent(btn2000)
                        .addGap(18, 18, 18)
                        .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panWithdrawLayout.createSequentialGroup()
                                .addComponent(btn4000)
                                .addGap(20, 20, 20)
                                .addComponent(btn6000))
                            .addComponent(txtBalance))
                        .addGap(18, 18, 18)
                        .addComponent(btnOther)))
                .addGap(18, 18, 18)
                .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnWithdraw)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 153, 51));
        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel(evt);
            }
        });

        javax.swing.GroupLayout panelWithdrawLayout = new javax.swing.GroupLayout(panelWithdraw);
        panelWithdraw.setLayout(panelWithdrawLayout);
        panelWithdrawLayout.setHorizontalGroup(
            panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWithdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelWithdrawLayout.createSequentialGroup()
                        .addComponent(lblInput)
                        .addGap(18, 18, 18)
                        .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCheck)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelWithdrawLayout.setVerticalGroup(
            panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWithdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblInput)
                        .addComponent(btnCheck))
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }//GEN-LAST:event_checkInput

    private void btnCheck(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheck
        dto.setId(txtAccount.getText());
        dto.setBalance(dal.getBalance(dto.getId()));
        if (!dto.getId().isEmpty()) {
            if (txtAccount.getText().length() == 9) {
                if (bll.CheckID(dto)) {
                    panWithdraw.setVisible(true);
                    txtBalance.setText(String.valueOf(vndFormat.format(dto.getBalance())));
                    txtAccount.setEditable(false);
                } else {
                    JOptionPane.showMessageDialog(null, "CMND của bạn không đúng", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    panWithdraw.setVisible(false);
                    txtAccount.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "CMND phải đúng 9 ki tự", "Thông báo", JOptionPane.WARNING_MESSAGE);
                panWithdraw.setVisible(false);
                txtAccount.requestFocus();
                txtAccount.selectAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dữ liệu không được bỏ trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtAccount.requestFocus();
        }
    }//GEN-LAST:event_btnCheck

    private void btnWithdraw(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdraw
        if (!txtMoney.getText().isEmpty()) {
            dto.setAmount(Long.parseLong(txtMoney.getText()));
            if (dto.getAmount() < 50000 || dto.getAmount() > 2000000000) {
                JOptionPane.showMessageDialog(null, "Số tiền rút từ 50.000đ tới 2.000.000.000đ", "Thông báo", JOptionPane.WARNING_MESSAGE);
                txtMoney.requestFocus();
            } else {
                if (dto.getAmount() % 50000 == 0) {
                    if (dto.getAmount() <= dto.getBalance()) {
                        int quest = JOptionPane.showConfirmDialog(null, "Bạn có muốn rút số tiền với trị giá " + vndFormat.format(dto.getAmount()), "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (quest == JOptionPane.YES_OPTION) {
                            dto.withdraw(dto.getAmount());
                            bll_trans.Withdraw(dto.getBalance(), dto.getId());
                            JOptionPane.showMessageDialog(null, "Rút tiền thành công"
                                    + "\nSố dư hiện tại trong tài khoản sau khi rút là " + vndFormat.format(dto.getBalance()), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            ResetValue();
                        }
                        txtMoney.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, "Số tiền bạn rút vượt quá số dư hiện có trong tài khoản", "Thông báo", JOptionPane.WARNING_MESSAGE);
                        txtMoney.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Số tiền bạn rút không hợp lệ", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    txtMoney.requestFocus();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dữ liệu không được bỏ trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtMoney.requestFocus();
        }
    }//GEN-LAST:event_btnWithdraw

    private void checkValues(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkValues
        obj = evt.getSource();
        if (obj instanceof JButton) {
            btn = (JButton) obj;
            txtMoney.setText(btn.getText().replace(".", ""));
            txtMoney.setEditable(false);
        }
        if (btn.getText().equals("Số khác")) {
            txtMoney.setText("");
            txtMoney.requestFocus();
            txtMoney.setEditable(true);
        }
    }//GEN-LAST:event_checkValues

    private void checkValidMoney(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkValidMoney
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_checkValidMoney

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
            java.util.logging.Logger.getLogger(frmWithdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new frmWithdraw().setVisible(true);
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
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel lblInput;
    private javax.swing.JPanel panWithdraw;
    private javax.swing.JPanel panelWithdraw;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables
}
