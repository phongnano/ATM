package Views;

public class frmCheckPIN extends javax.swing.JInternalFrame {

    frmCustomer cst;

    public frmCheckPIN(frmCustomer cust) {
        initComponents();
        this.cst = cust;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCheckPIN = new javax.swing.JPanel();
        txtCheckID = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        panPIN = new javax.swing.JPanel();
        txtPIN = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnRedo = new javax.swing.JButton();
        txtFooter = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        setClosable(true);

        panCheckPIN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KIỂM TRA MÃ PIN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 24))); // NOI18N

        txtCheckID.setBackground(new java.awt.Color(240, 240, 240));
        txtCheckID.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        txtCheckID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCheckID.setToolTipText("Vui lòng nhập cmnd hoặc thẻ"); // NOI18N

        btnCheck.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnCheck.setText("Kiểm tra");

        panPIN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtPIN.setBackground(new java.awt.Color(240, 240, 240));
        txtPIN.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        txtPIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn7.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btn7.setText("7");
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPreferredSize(new java.awt.Dimension(100, 27));

        btn8.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btn8.setText("8");
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPreferredSize(new java.awt.Dimension(100, 27));

        btn9.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btn9.setText("9");
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPreferredSize(new java.awt.Dimension(100, 27));

        btn4.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btn4.setText("4");
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPreferredSize(new java.awt.Dimension(100, 27));

        btn5.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btn5.setText("5");
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPreferredSize(new java.awt.Dimension(100, 27));

        btn6.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btn6.setText("6");
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPreferredSize(new java.awt.Dimension(100, 27));

        btn1.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btn1.setText("1");
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPreferredSize(new java.awt.Dimension(100, 27));

        btn2.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btn2.setText("2");
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPreferredSize(new java.awt.Dimension(100, 27));

        btn3.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btn3.setText("3");
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPreferredSize(new java.awt.Dimension(100, 27));

        btnVerify.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnVerify.setText("Xác nhận");
        btnVerify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerify.setPreferredSize(new java.awt.Dimension(100, 27));

        btn0.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btn0.setText("0");
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPreferredSize(new java.awt.Dimension(100, 27));

        btnRedo.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnRedo.setText("Nhập lại");
        btnRedo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRedo.setPreferredSize(new java.awt.Dimension(100, 27));

        txtFooter.setEditable(false);
        txtFooter.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        txtFooter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFooter.setText("NGUYỄN HOÀNG PHONG");

        javax.swing.GroupLayout panPINLayout = new javax.swing.GroupLayout(panPIN);
        panPIN.setLayout(panPINLayout);
        panPINLayout.setHorizontalGroup(
            panPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPINLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFooter)
                    .addComponent(txtPIN)
                    .addGroup(panPINLayout.createSequentialGroup()
                        .addGroup(panPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95)
                        .addGroup(panPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95)
                        .addGroup(panPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRedo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panPINLayout.setVerticalGroup(
            panPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPINLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCancel.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnCancel.setText("Hủy");

        javax.swing.GroupLayout panCheckPINLayout = new javax.swing.GroupLayout(panCheckPIN);
        panCheckPIN.setLayout(panCheckPINLayout);
        panCheckPINLayout.setHorizontalGroup(
            panCheckPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCheckPINLayout.createSequentialGroup()
                .addComponent(panPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panCheckPINLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCheckPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCheckPINLayout.createSequentialGroup()
                        .addComponent(btnCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panCheckPINLayout.createSequentialGroup()
                        .addComponent(txtCheckID, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panCheckPINLayout.setVerticalGroup(
            panCheckPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCheckPINLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCheckID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panCheckPINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(panPIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCheckPIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCheckPIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnRedo;
    private javax.swing.JButton btnVerify;
    private javax.swing.JPanel panCheckPIN;
    private javax.swing.JPanel panPIN;
    private javax.swing.JTextField txtCheckID;
    private javax.swing.JTextField txtFooter;
    private javax.swing.JTextField txtPIN;
    // End of variables declaration//GEN-END:variables
}
