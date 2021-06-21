package Views;

import com.toedter.calendar.JTextFieldDateEditor;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class frmCustomerManagement extends javax.swing.JInternalFrame {

    frmStaff stf;

    public frmCustomerManagement(frmStaff staff) {
        initComponents();
        this.stf = staff;

        JTextFieldDateEditor editor = (JTextFieldDateEditor) dateBirthday.getDateEditor();
        editor.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGender = new javax.swing.ButtonGroup();
        panCustomer = new javax.swing.JPanel();
        lblIDCust = new javax.swing.JLabel();
        txtIDCust = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        lblNatveplace = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        comboNativeplace = new javax.swing.JComboBox<>();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        dateBirthday = new com.toedter.calendar.JDateChooser();
        jScrollPane = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();

        setClosable(true);
        setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        panCustomer.setBackground(new java.awt.Color(255, 255, 255));
        panCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN KHÁCH HÀNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 51, 153))); // NOI18N

        lblIDCust.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblIDCust.setText("Mã khách hàng");

        txtIDCust.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblID.setText("CMND");

        lblFullname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblFullname.setText("Họ và tên");

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblGender.setText("Giới tính");

        lblBirthday.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblBirthday.setText("Ngày sinh");

        lblNatveplace.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNatveplace.setText("Quê quán");

        txtID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtFullname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        radioMale.setBackground(new java.awt.Color(255, 255, 255));
        groupGender.add(radioMale);
        radioMale.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radioMale.setText("Nam");

        radioFemale.setBackground(new java.awt.Color(255, 255, 255));
        groupGender.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radioFemale.setText("Nữ");

        comboNativeplace.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        comboNativeplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Phú Yên", "Cần Thơ", "Đà Nẵng", "Hải Phòng", "Hà Nội", "TP HCM" }));
        comboNativeplace.setSelectedIndex(-1);

        lblPhone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPhone.setText("Điện thoại");

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnInsert.setText("Thêm khách hàng");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCustomer(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancel.setText("Hủy");

        dateBirthday.setBackground(new java.awt.Color(255, 255, 255));
        dateBirthday.setDateFormatString("dd/MM/yyyy"); // NOI18N
        dateBirthday.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout panCustomerLayout = new javax.swing.GroupLayout(panCustomer);
        panCustomer.setLayout(panCustomerLayout);
        panCustomerLayout.setHorizontalGroup(
            panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDCust)
                    .addComponent(lblID)
                    .addComponent(lblFullname)
                    .addComponent(lblGender)
                    .addComponent(lblBirthday)
                    .addComponent(lblNatveplace)
                    .addComponent(lblPhone))
                .addGap(60, 60, 60)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addComponent(comboNativeplace, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addComponent(radioMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioFemale))
                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtID)
                    .addComponent(txtFullname)
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addComponent(txtIDCust, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dateBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panCustomerLayout.setVerticalGroup(
            panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDCust)
                    .addComponent(txtIDCust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullname)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(radioMale)
                    .addComponent(radioFemale))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBirthday)
                    .addComponent(dateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNatveplace)
                    .addComponent(comboNativeplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblCustomer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblCustomer.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane.setViewportView(tblCustomer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertCustomer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCustomer
        //SimpleDateFormat sdf_1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf_2 = new SimpleDateFormat("yyyy");
        //String date_1 = sdf_1.format(dateBirthday.getDate()).replaceAll("/", "");

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        String date_2 = sdf_2.format(dateBirthday.getDate());
        int selectYear = Integer.parseInt(date_2);
        int birthday = currentYear - selectYear;
        if (birthday >= 18) {
            JOptionPane.showMessageDialog(null, "Năm nay bạn được " + birthday + " tuổi");
        } else {
            JOptionPane.showMessageDialog(null, "Bạn chưa đủ tuổi");
        }
    }//GEN-LAST:event_insertCustomer

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInsert;
    private javax.swing.JComboBox<String> comboNativeplace;
    private com.toedter.calendar.JDateChooser dateBirthday;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDCust;
    private javax.swing.JLabel lblNatveplace;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JPanel panCustomer;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDCust;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
