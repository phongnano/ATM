package GUIS;

import Customers.BLL_Customers;
import Customers.DTO_Customers;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class frmWithdraw extends javax.swing.JFrame {
    
    DTO_Customers dto = new DTO_Customers();
    BLL_Customers bll = new BLL_Customers();
    JButton btn;
    Object obj;
    
    public frmWithdraw() {
        initComponents();
        panWithdraw.setVisible(false);
        txtMoney.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWithdraw = new javax.swing.JPanel();
        lblInput_1 = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        panWithdraw = new javax.swing.JPanel();
        txtMoney = new javax.swing.JTextField();
        btnWithdraw = new javax.swing.JButton();
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

        panelWithdraw.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RÚT TIỀN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 14))); // NOI18N

        lblInput_1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblInput_1.setText("Mời bạn nhập cmnd hoặc số tài khoản:");

        txtAccount.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccount.setToolTipText("Vui lòng nhập cmnd hoặc số tài khoản");
        txtAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkInput(evt);
            }
        });

        btnCheck.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnCheck.setText("Xác thực");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheck(evt);
            }
        });

        panWithdraw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtMoney.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtMoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMoney.setToolTipText("Vui lòng nhập cmnd hoặc số tài khoản");

        btnWithdraw.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnWithdraw.setText("Rút tiền");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdraw(evt);
            }
        });

        btn1000.setText("1.000.000");
        btn1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn3000.setText("3.000.000");
        btn3000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn5000.setText("5.000.000");
        btn5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn7000.setText("7.000.000");
        btn7000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn2000.setText("2.000.000");
        btn2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn4000.setText("4.000.000");
        btn4000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btn6000.setText("6.000.000");
        btn6000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        btnOther.setText("Số khác");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValues(evt);
            }
        });

        javax.swing.GroupLayout panWithdrawLayout = new javax.swing.GroupLayout(panWithdraw);
        panWithdraw.setLayout(panWithdrawLayout);
        panWithdrawLayout.setHorizontalGroup(
            panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWithdrawLayout.createSequentialGroup()
                .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panWithdrawLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1000)
                            .addComponent(btn3000)
                            .addComponent(btn5000)
                            .addComponent(btn7000))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn2000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOther, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panWithdrawLayout.createSequentialGroup()
                        .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panWithdrawLayout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panWithdrawLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 145, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panWithdrawLayout.setVerticalGroup(
            panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWithdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panWithdrawLayout.createSequentialGroup()
                        .addComponent(btn1000)
                        .addGap(18, 18, 18)
                        .addComponent(btn3000)
                        .addGap(18, 18, 18)
                        .addComponent(btn5000)
                        .addGap(18, 18, 18)
                        .addComponent(btn7000))
                    .addGroup(panWithdrawLayout.createSequentialGroup()
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
                .addComponent(btnWithdraw)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelWithdrawLayout = new javax.swing.GroupLayout(panelWithdraw);
        panelWithdraw.setLayout(panelWithdrawLayout);
        panelWithdrawLayout.setHorizontalGroup(
            panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWithdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelWithdrawLayout.createSequentialGroup()
                        .addComponent(lblInput_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtAccount)
                        .addGap(18, 18, 18)
                        .addComponent(btnCheck)))
                .addContainerGap())
        );
        panelWithdrawLayout.setVerticalGroup(
            panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWithdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInput_1)
                    .addComponent(btnCheck))
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
        if (txtAccount.getText().length() == 12) {
            evt.consume();
        }
    }//GEN-LAST:event_checkInput

    private void btnCheck(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheck
        dto.setId(txtAccount.getText());
        if (txtAccount.getText().length() == 9) {
            if (bll.CheckID(dto)) {
                panWithdraw.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Số tài khoản của bạn không đúng", "Thông báo", JOptionPane.ERROR_MESSAGE);
                panWithdraw.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Số tài khoản phải đủ 12 ki tự", "Thông báo", JOptionPane.WARNING_MESSAGE);
            panWithdraw.setVisible(false);
        }
    }//GEN-LAST:event_btnCheck

    private void btnWithdraw(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdraw
        int amount = Integer.parseInt(txtMoney.getText());
        if (amount < 50000 || amount > 2000000000) {
            JOptionPane.showMessageDialog(null, "Số tiền nộp từ 50.000đ tới 2.000.000.000đ", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            
        }
    }//GEN-LAST:event_btnWithdraw

    private void checkValues(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkValues
        obj = evt.getSource();
        if (obj instanceof JButton) {
            btn = (JButton) obj;
            txtMoney.setEnabled(true);
            txtMoney.setText(btn.getText());
        }
        if (btn.getText().equals("Số khác")) {
            txtMoney.setText("");
        }
    }//GEN-LAST:event_checkValues
    
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
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnOther;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel lblInput_1;
    private javax.swing.JPanel panWithdraw;
    private javax.swing.JPanel panelWithdraw;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables
}
