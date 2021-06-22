package Views;

import Controllers.BLL_Staffs;
import Controllers.DAL_Banks;
import Limits.LimitText;
import Models.DTO_Staffs;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class frmStaffManagement extends javax.swing.JInternalFrame {

    DTO_Staffs dto_staff = new DTO_Staffs();
    BLL_Staffs bll_staff = new BLL_Staffs();
    ArrayList<DTO_Staffs> arr = new ArrayList<>();
    frmAdmin ad;
    Random rd = new Random();

    public frmStaffManagement(frmAdmin admin) {
        initComponents();
        this.ad = admin;
        loadBank();
        loadStaffs();
        initialStaffs();
    }

    private void loadBank() {
        DAL_Banks dal = new DAL_Banks();
        HashMap<String, String> map = dal.getBank();
        map.keySet().forEach((str) -> {
            cbBank.addItem(str);
        });
    }

    private void initialStaffs() {
        String id = "NV";
        int rand = rd.nextInt(10000) + 90000;
        String str = id + rand;
        txtIDStaff.setText(str);
    }

    private void loadStaffs() {
        tblStaff.setVisible(true);
        String[] header = {"Mã nhân viên", "CMND", "Họ và tên", "Giới tính", "Nơi sinh", "Ngày sinh", "Điện thoại", "Ngân hàng"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        arr = bll_staff.loadStaffs();
        for (int i = 0; i < arr.size(); i++) {
            dto_staff = arr.get(i);
            String idstaff = dto_staff.getIdstaff();
            String id = dto_staff.getId();
            String name = dto_staff.getFullname();
            int gender = dto_staff.getGender();
            String getGender = String.valueOf(gender);
            if (gender == 0) {
                getGender = "Nam";
            }
            if (gender == 1) {
                getGender = "Nữ";
            }
            String nativeplace = dto_staff.getNativeplace();
            Date birthday = dto_staff.getBirthday();
            String telephone = dto_staff.getTelephone();
            String bank = dto_staff.getNamebank();
            Object[] row = {idstaff, id, name, getGender, nativeplace, birthday, telephone, bank};
            model.addRow(row);
        }
        tblStaff.setModel(model);
        tblStaff.setDefaultEditor(Object.class, null);
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
        txtTelephone = new javax.swing.JTextField();
        lblTelephone = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        dateBirthday = new com.toedter.calendar.JDateChooser();
        lblBank = new javax.swing.JLabel();
        cbBank = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();

        setClosable(true);
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        panStaff.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NHÂN VIÊN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 24))); // NOI18N

        lblIDStaff.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblIDStaff.setText("Mã nhân viên:");

        txtIDStaff.setEditable(false);
        txtIDStaff.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        txtID.setBackground(new java.awt.Color(240, 240, 240));
        txtID.setDocument(new LimitText(9));
        txtID.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkID(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblID.setText("CMND:");

        lblFullname.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblFullname.setText("Họ và tên:");

        txtFullname.setBackground(new java.awt.Color(240, 240, 240));
        txtFullname.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        groupGender.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        radioFemale.setText("Nữ");

        groupGender.add(radioMale);
        radioMale.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        radioMale.setText("Nam");

        lblGender.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblGender.setText("Giới tính:");

        lblNativeplace.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblNativeplace.setText("Nơi sinh:");

        cbNativeplace.setBackground(new java.awt.Color(240, 240, 240));
        cbNativeplace.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        cbNativeplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Phú Yên", "Cần Thơ", "Đà Nẵng", "Hải Phòng", "Hà Nội", "TP.HCM" }));
        cbNativeplace.setSelectedIndex(-1);
        cbNativeplace.setAutoscrolls(true);

        txtTelephone.setBackground(new java.awt.Color(240, 240, 240));
        txtTelephone.setDocument(new LimitText(10));
        txtTelephone.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        txtTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkTelephone(evt);
            }
        });

        lblTelephone.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblTelephone.setText("Điện thoại:");

        lblBirthday.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblBirthday.setText("Ngày sinh:");

        dateBirthday.setDateFormatString("dd/MM/yyyy\n"); // NOI18N
        dateBirthday.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        lblBank.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblBank.setText("Ngân hàng:");

        cbBank.setBackground(new java.awt.Color(240, 240, 240));
        cbBank.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        cbBank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn ngân hàng" }));

        btnInsert.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnInsert.setText("Thêm nhân viên");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertStaff(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnUpdate.setText("Cập nhật nhân viên");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStaff(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnDelete.setText("Xóa nhân viên");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStaff(evt);
            }
        });

        javax.swing.GroupLayout panStaffLayout = new javax.swing.GroupLayout(panStaff);
        panStaff.setLayout(panStaffLayout);
        panStaffLayout.setHorizontalGroup(
            panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panStaffLayout.createSequentialGroup()
                        .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDStaff)
                            .addComponent(lblID))
                        .addGap(60, 60, 60)
                        .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtIDStaff)))
                    .addComponent(lblGender)
                    .addGroup(panStaffLayout.createSequentialGroup()
                        .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panStaffLayout.createSequentialGroup()
                                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFullname)
                                    .addComponent(lblNativeplace)
                                    .addComponent(lblBirthday)
                                    .addComponent(lblTelephone)
                                    .addComponent(lblBank))
                                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panStaffLayout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(radioMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radioFemale))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panStaffLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                        .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFullname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbNativeplace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateBirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbBank, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panStaffLayout.createSequentialGroup()
                                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        panStaffLayout.setVerticalGroup(
            panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDStaff))
                .addGap(18, 18, 18)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullname))
                .addGap(18, 18, 18)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(radioFemale)
                    .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNativeplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNativeplace))
                .addGap(18, 18, 18)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBirthday, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateBirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelephone)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBank))
                .addGap(18, 18, 18)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addGroup(panStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        tblStaff.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
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
        tblStaff.getTableHeader().setResizingAllowed(false);
        tblStaff.getTableHeader().setReorderingAllowed(false);
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseStaffs(evt);
            }
        });
        jScrollPane.setViewportView(tblStaff);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(770, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkID(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkID
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_checkID

    private void checkTelephone(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkTelephone
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_checkTelephone

    private void chooseStaffs(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseStaffs
        int row = tblStaff.getSelectedRow();
        if (row != -1) {
            txtIDStaff.setText((String) (tblStaff.getValueAt(row, 0)));
            txtID.setText((String) (tblStaff.getValueAt(row, 1)));
            txtFullname.setText((String) (tblStaff.getValueAt(row, 2)));
            String gender = tblStaff.getValueAt(row, 3).toString();
            if (gender.equals("Nam")) {
                radioMale.setSelected(true);
            } else if (gender.equals("Nữ")) {
                radioFemale.setSelected(true);
            }
            String nativeplace = tblStaff.getValueAt(row, 4).toString();
            for (int i = 0; i < cbNativeplace.getItemCount(); i++) {
                if (cbNativeplace.getItemAt(i).equalsIgnoreCase(nativeplace)) {
                    cbNativeplace.setSelectedIndex(i);
                }
            }
            dateBirthday.setDate(Date.valueOf(tblStaff.getValueAt(row, 5).toString()));
            txtTelephone.setText((String) (tblStaff.getValueAt(row, 6)));
            String bank = tblStaff.getValueAt(row, 7).toString();
            for (int i = 0; i < cbBank.getItemCount(); i++) {
                if (cbBank.getItemAt(i).equalsIgnoreCase(bank)) {
                    cbBank.setSelectedIndex(i);
                }
            }

        }
    }//GEN-LAST:event_chooseStaffs

    private void insertStaff(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertStaff

    }//GEN-LAST:event_insertStaff

    private void updateStaff(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStaff
        // TODO add your handling code here:
    }//GEN-LAST:event_updateStaff

    private void cancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel

    private void deleteStaff(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStaff
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteStaff

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbBank;
    private javax.swing.JComboBox<String> cbNativeplace;
    private com.toedter.calendar.JDateChooser dateBirthday;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblBank;
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
