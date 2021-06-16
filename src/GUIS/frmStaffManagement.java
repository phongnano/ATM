package GUIS;

import Staffs.BLL_Staffs;
import Staffs.DTO_Staffs;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmStaffManagement extends javax.swing.JInternalFrame {

    DTO_Staffs dto = new DTO_Staffs();
    BLL_Staffs bll = new BLL_Staffs();
    ArrayList<DTO_Staffs> arr = new ArrayList<>();
    frmAdmin ad;

    public frmStaffManagement(frmAdmin admin) {
        initComponents();
        this.ad = admin;
        loadStaffs();
    }

    private void loadStaffs() {
        tblStaff.setVisible(true);
        String[] header = {"Mã khách hàng", "Họ và tên", "Giới tính", "Điện thoại"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        arr = bll.loadStaffs();
        for (int i = 0; i < arr.size(); i++) {
            dto = arr.get(i);
            String id = dto.getIdstaff();
            String name = dto.getFullname();
            int gender = dto.getGender();
            String getGender = String.valueOf(gender);
            if (gender == 0) {
                getGender = "Nam";
            }
            if (gender == 1) {
                getGender = "Nữ";
            }
            String telephone = dto.getTelephone();
            Object[] row = {id, name, getGender, telephone};
            model.addRow(row);
        }
        tblStaff.setModel(model);
        tblStaff.setDefaultEditor(Object.class, null);
        tblStaff.getTableHeader().setReorderingAllowed(false);
        tblStaff.getTableHeader().setResizingAllowed(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGender = new javax.swing.ButtonGroup();
        panStaff = new javax.swing.JPanel();
        lblIDStaff = new javax.swing.JLabel();
        txtIDStaff = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        radioFemale = new javax.swing.JRadioButton();
        radioMale = new javax.swing.JRadioButton();
        lblGender = new javax.swing.JLabel();
        lblNativeplace = new javax.swing.JLabel();
        cbNativeplace = new javax.swing.JComboBox<>();
        dateBirthday = new com.toedter.calendar.JDateChooser();
        txtTelephone = new javax.swing.JTextField();
        lblTelephone = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setClosable(true);
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        panStaff.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUẢN LÝ NHÂN VIÊN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(0, 0, 102))); // NOI18N

        lblIDStaff.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblIDStaff.setForeground(new java.awt.Color(0, 153, 0));
        lblIDStaff.setText("Mã nhân viên:");

        txtIDStaff.setEditable(false);
        txtIDStaff.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkID(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 153, 0));
        lblID.setText("CMND:");

        lblFullname.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblFullname.setForeground(new java.awt.Color(0, 153, 0));
        lblFullname.setText("Họ và tên:");

        txtFullname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        groupGender.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        radioFemale.setText("Nữ");

        groupGender.add(radioMale);
        radioMale.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        radioMale.setText("Nam");

        lblGender.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblGender.setForeground(new java.awt.Color(0, 153, 0));
        lblGender.setText("Giới tính:");

        lblNativeplace.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblNativeplace.setForeground(new java.awt.Color(0, 153, 0));
        lblNativeplace.setText("Nơi sinh:");

        cbNativeplace.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cbNativeplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Phú Yên", "Cần Thơ", "Đà Nẵng", "Hải Phòng", "Hà Nội", "TP HCM" }));
        cbNativeplace.setSelectedIndex(-1);
        cbNativeplace.setAutoscrolls(true);

        dateBirthday.setDateFormatString("dd/MM/yyyy"); // NOI18N

        txtTelephone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkTelephone(evt);
            }
        });

        lblTelephone.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblTelephone.setForeground(new java.awt.Color(0, 153, 0));
        lblTelephone.setText("Điện thoại:");

        lblBirthday.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblBirthday.setForeground(new java.awt.Color(0, 153, 0));
        lblBirthday.setText("Ngày sinh:");

        javax.swing.GroupLayout panStaffLayout = new javax.swing.GroupLayout(panStaff);
        panStaff.setLayout(panStaffLayout);
        panStaffLayout.setHorizontalGroup(
            panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panStaffLayout.createSequentialGroup()
                        .addComponent(lblGender)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panStaffLayout.createSequentialGroup()
                        .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panStaffLayout.createSequentialGroup()
                                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFullname)
                                    .addComponent(lblNativeplace)
                                    .addComponent(lblBirthday)
                                    .addComponent(lblTelephone))
                                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panStaffLayout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panStaffLayout.createSequentialGroup()
                                                .addComponent(radioMale)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panStaffLayout.createSequentialGroup()
                                                .addGap(0, 8, Short.MAX_VALUE)
                                                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtTelephone, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(dateBirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(radioFemale, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(cbNativeplace, javax.swing.GroupLayout.Alignment.TRAILING, 0, 300, Short.MAX_VALUE)))))
                                    .addGroup(panStaffLayout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(txtFullname))))
                            .addGroup(panStaffLayout.createSequentialGroup()
                                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIDStaff)
                                    .addComponent(lblID))
                                .addGap(60, 60, 60)
                                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIDStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(txtID))))
                        .addContainerGap())))
        );
        panStaffLayout.setVerticalGroup(
            panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDStaff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(radioMale)
                    .addComponent(radioFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNativeplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNativeplace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBirthday)
                    .addComponent(dateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelephone)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblStaff.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseStaffs(evt);
            }
        });
        jScrollPane.setViewportView(tblStaff);

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(204, 0, 0));
        btnAdd.setText("Thêm nhân viên");

        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(204, 0, 0));
        btnCancel.setText("Hủy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(554, 554, 554)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnCancel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkID(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkID
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
        if (txtTelephone.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_checkID

    private void checkTelephone(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkTelephone
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
        if (txtTelephone.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_checkTelephone

    private void chooseStaffs(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseStaffs
//        int row = tblStaff.getSelectedRow();
//        if (row != -1) {
//            new frmDeposit().setVisible(true);
//        }
//        JOptionPane.showMessageDialog(null, "Ok");
    }//GEN-LAST:event_chooseStaffs


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> cbNativeplace;
    private com.toedter.calendar.JDateChooser dateBirthday;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDStaff;
    private javax.swing.JLabel lblNativeplace;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JPanel panStaff;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDStaff;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
