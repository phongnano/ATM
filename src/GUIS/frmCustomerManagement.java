package GUIS;

public class frmCustomerManagement extends javax.swing.JInternalFrame {

    frmStaff stf;

    public frmCustomerManagement(frmStaff staff) {
        initComponents();
        stf = staff;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGender = new javax.swing.ButtonGroup();
        groupCard = new javax.swing.ButtonGroup();
        panCustomer = new javax.swing.JPanel();
        lblIDCust = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        txtIDCust = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        lblFullname = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblNativeplace = new javax.swing.JLabel();
        cbNativeplace = new javax.swing.JComboBox<>();
        lblBirthday = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JFormattedTextField();
        dateBirthday = new com.toedter.calendar.JDateChooser();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        panCustomer1 = new javax.swing.JPanel();
        lblCard = new javax.swing.JLabel();
        txtIDCust1 = new javax.swing.JTextField();
        txtFullname1 = new javax.swing.JTextField();
        lblAccount = new javax.swing.JLabel();
        lblStartday = new javax.swing.JLabel();
        lblEndday = new javax.swing.JLabel();
        lblSDay = new javax.swing.JLabel();
        lblEDay = new javax.swing.JLabel();
        lblCards = new javax.swing.JLabel();
        radioVisa = new javax.swing.JRadioButton();
        radioLocal = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();

        setClosable(true);
        setTitle("QUẢN LÝ KHÁCH HÀNG");

        panCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblIDCust.setText("Mã khách hàng:");

        groupGender.add(radioMale);
        radioMale.setText("Nam");

        groupGender.add(radioFemale);
        radioFemale.setText("Nữ");

        lblFullname.setText("Họ và tên:");

        lblGender.setText("Giới tính:");

        lblTelephone.setText("Điện thoại:");

        lblNativeplace.setText("Nơi sinh:");

        lblBirthday.setText("Ngày sinh:");

        txtTelephone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));

        dateBirthday.setDateFormatString("dd/MM/yyyy"); // NOI18N

        javax.swing.GroupLayout panCustomerLayout = new javax.swing.GroupLayout(panCustomer);
        panCustomer.setLayout(panCustomerLayout);
        panCustomerLayout.setHorizontalGroup(
            panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFullname)
                            .addComponent(lblNativeplace)
                            .addComponent(lblBirthday)
                            .addComponent(lblTelephone))
                        .addGap(132, 132, 132)
                        .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNativeplace, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panCustomerLayout.createSequentialGroup()
                                .addComponent(radioMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioFemale))
                            .addComponent(txtFullname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateBirthday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addComponent(lblGender)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addComponent(lblIDCust)
                        .addGap(102, 102, 102)
                        .addComponent(txtIDCust)))
                .addContainerGap())
        );
        panCustomerLayout.setVerticalGroup(
            panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDCust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDCust))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(radioMale)
                    .addComponent(radioFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNativeplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNativeplace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBirthday)
                    .addComponent(dateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelephone)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdd.setText("Thêm");

        btnEdit.setText("Sửa");

        btnDelete.setText("Xóa");

        btnCancel.setText("Hủy");

        panCustomer1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblCard.setText("Số thẻ:");

        lblAccount.setText("Số tài khoản");

        lblStartday.setText("Ngày bắt đầu:");

        lblEndday.setText("Ngày kết thúc:");

        lblSDay.setText(".........");

        lblEDay.setText(".........");

        lblCards.setText("Chọn loại thẻ:");

        groupCard.add(radioVisa);
        radioVisa.setText("Thẻ Visa");

        groupCard.add(radioLocal);
        radioLocal.setText("Thẻ Nội địa");

        javax.swing.GroupLayout panCustomer1Layout = new javax.swing.GroupLayout(panCustomer1);
        panCustomer1.setLayout(panCustomer1Layout);
        panCustomer1Layout.setHorizontalGroup(
            panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccount)
                    .addComponent(lblStartday)
                    .addComponent(lblEndday)
                    .addComponent(lblCard)
                    .addComponent(lblCards))
                .addGap(138, 138, 138)
                .addGroup(panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCustomer1Layout.createSequentialGroup()
                        .addComponent(radioVisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(radioLocal))
                    .addGroup(panCustomer1Layout.createSequentialGroup()
                        .addGroup(panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEDay)
                            .addComponent(lblSDay))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtFullname1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIDCust1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panCustomer1Layout.setVerticalGroup(
            panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDCust1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCustomer1Layout.createSequentialGroup()
                        .addComponent(lblStartday)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndday)
                            .addComponent(lblEDay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblSDay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCards)
                        .addComponent(radioLocal))
                    .addComponent(radioVisa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEdit)
                                .addGap(99, 99, 99)
                                .addComponent(btnDelete)
                                .addGap(101, 101, 101)
                                .addComponent(btnCancel))
                            .addComponent(panCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(panCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panCustomer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnCancel)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cbNativeplace;
    private com.toedter.calendar.JDateChooser dateBirthday;
    private javax.swing.ButtonGroup groupCard;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblCard;
    private javax.swing.JLabel lblCards;
    private javax.swing.JLabel lblEDay;
    private javax.swing.JLabel lblEndday;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblIDCust;
    private javax.swing.JLabel lblNativeplace;
    private javax.swing.JLabel lblSDay;
    private javax.swing.JLabel lblStartday;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JPanel panCustomer;
    private javax.swing.JPanel panCustomer1;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioLocal;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioVisa;
    private javax.swing.JTable tableInfo;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtFullname1;
    private javax.swing.JTextField txtIDCust;
    private javax.swing.JTextField txtIDCust1;
    private javax.swing.JFormattedTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
