package Views;

import Controllers.BLL_Customers;
import Models.DTO_Customers;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

public class frmCheckBalance extends javax.swing.JInternalFrame {

    ArrayList<DTO_Customers> arr = new ArrayList<>();
    DTO_Customers dto = new DTO_Customers();
    BLL_Customers bll = new BLL_Customers();
    frmCustomer cst;
    Locale loc = new Locale("vi", "VN");
    Currency vnd = Currency.getInstance(loc);
    NumberFormat vndFormat = NumberFormat.getCurrencyInstance(loc);
    public static String usr;

    public frmCheckBalance(frmCustomer cust) {
        initComponents();
        this.cst = cust;
        checkBalance();
    }

    private void checkBalance() {
        arr = bll.CheckBalance(usr);
        for (int i = 0; i < arr.size(); i++) {
            dto = arr.get(i);
            String account = dto.getAccount();
            String fullname = dto.getFullname();
            Long balance = dto.getBalance();
            txtAccount.setText(account);
            txtFullname.setText(fullname);
            txtBalance.setText(String.valueOf(vndFormat.format(balance)));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCheckBalance = new javax.swing.JPanel();
        lblAccount = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        lblFullname = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        lblBalance = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();

        setClosable(true);

        panCheckBalance.setBackground(new java.awt.Color(255, 255, 255));
        panCheckBalance.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN TÀI KHOẢN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 51, 153))); // NOI18N

        lblAccount.setBackground(new java.awt.Color(255, 255, 255));
        lblAccount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblAccount.setText("Số tài khoản");

        txtAccount.setEditable(false);
        txtAccount.setBackground(new java.awt.Color(255, 255, 255));
        txtAccount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblFullname.setBackground(new java.awt.Color(255, 255, 255));
        lblFullname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblFullname.setText("Họ và tên");

        txtFullname.setEditable(false);
        txtFullname.setBackground(new java.awt.Color(255, 255, 255));
        txtFullname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblBalance.setBackground(new java.awt.Color(255, 255, 255));
        lblBalance.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblBalance.setText("Số dư hiện tại");

        txtBalance.setEditable(false);
        txtBalance.setBackground(new java.awt.Color(255, 255, 255));
        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout panCheckBalanceLayout = new javax.swing.GroupLayout(panCheckBalance);
        panCheckBalance.setLayout(panCheckBalanceLayout);
        panCheckBalanceLayout.setHorizontalGroup(
            panCheckBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCheckBalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCheckBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccount)
                    .addComponent(lblFullname)
                    .addComponent(lblBalance))
                .addGap(100, 100, 100)
                .addGroup(panCheckBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAccount)
                    .addComponent(txtFullname)
                    .addComponent(txtBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCheckBalanceLayout.setVerticalGroup(
            panCheckBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCheckBalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCheckBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccount)
                    .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCheckBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullname)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCheckBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCheckBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCheckBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JPanel panCheckBalance;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtFullname;
    // End of variables declaration//GEN-END:variables
}
