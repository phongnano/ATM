package GUIS;

import Customers.BLL_Customers;
import Customers.DTO_Customers;
import javax.swing.JOptionPane;

public class frmTransfer extends javax.swing.JFrame {

    DTO_Customers dto = new DTO_Customers();
    BLL_Customers bll = new BLL_Customers();

    public frmTransfer() {
        initComponents();
        panTransfer.setVisible(false);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panTrans.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHUYỂNTIỀN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 14))); // NOI18N

        groups.add(radioCard);
        radioCard.setText("Số thẻ");
        radioCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCard(evt);
            }
        });

        groups.add(radioAccount);
        radioAccount.setText("Số tài khoản");
        radioAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAccount(evt);
            }
        });

        txtID.setEditable(false);
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkData(evt);
            }
        });

        panTransfer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtMoney.setEditable(false);
        txtMoney.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtMoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMoney.setToolTipText("Vui lòng nhập cmnd hoặc số tài khoản");
        txtMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMoneycheckMoney(evt);
            }
        });

        btnTransfer.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnTransfer.setText("Chuyển tiền");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfer(evt);
            }
        });

        btn1000.setText("1.000.000");

        btn3000.setText("3.000.000");

        btn5000.setText("5.000.000");

        btn7000.setText("7.000.000");

        btn2000.setText("2.000.000");

        btn4000.setText("4.000.000");

        btn6000.setText("6.000.000");

        btnOther.setText("Số khác");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOther(evt);
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
                        .addGap(0, 145, Short.MAX_VALUE)))
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
            .addGroup(panTransLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(panTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panTransLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(panTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(49, 49, 49)))
        );
        panTransLayout.setVerticalGroup(
            panTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTransLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCard)
                    .addComponent(radioAccount))
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panTransLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(panTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(94, 94, 94)))
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
            dto.setId(txtID.getText());
            if (txtID.getText().length() == 9) {
                evt.consume();
                if (bll.CheckID(dto)) {
                    panTransfer.setVisible(true);
                    txtID.setEditable(false);
                } else {
                    panTransfer.setVisible(false);
                    txtMoney.setText(null);
                    txtMoney.setEditable(false);
                    JOptionPane.showMessageDialog(null, "Số thẻ hoặc số tài khoản không đúng", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_checkData

    private void radioCard(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCard
        txtID.setEditable(true);
        txtID.requestFocus(true);
    }//GEN-LAST:event_radioCard

    private void radioAccount(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAccount
        txtID.setEditable(true);
        txtID.requestFocus(true);
    }//GEN-LAST:event_radioAccount

    private void txtMoneycheckMoney(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMoneycheckMoney

    }//GEN-LAST:event_txtMoneycheckMoney

    private void btnTransfer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfer
        int amount = Integer.parseInt(txtMoney.getText());
        if (amount < 50000 || amount > 2000000000) {
            JOptionPane.showMessageDialog(null, "Số tiền nộp từ 50.000đ tới 2.000.000.000đ", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_btnTransfer

    private void btnOther(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOther
        txtMoney.setEditable(true);
        txtMoney.requestFocus(true);
    }//GEN-LAST:event_btnOther

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
    private javax.swing.JButton btnOther;
    private javax.swing.JButton btnTransfer;
    private javax.swing.ButtonGroup groups;
    private javax.swing.JPanel panTrans;
    private javax.swing.JPanel panTransfer;
    private javax.swing.JRadioButton radioAccount;
    private javax.swing.JRadioButton radioCard;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables
}
