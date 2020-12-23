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

        panStaff.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUẢN LÝ NHÂN VIÊN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        lblIDStaff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblIDStaff.setText("Mã nhân viên:");

        txtIDStaff.setEditable(false);
        txtIDStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDStaffActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkID(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblID.setText("CMND:");

        lblFullname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFullname.setText("Họ và tên:");

        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });

        groupGender.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        radioFemale.setText("Nữ");

        groupGender.add(radioMale);
        radioMale.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        radioMale.setText("Nam");

        lblGender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblGender.setText("Giới tính:");

        lblNativeplace.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNativeplace.setText("Nơi sinh:");

        cbNativeplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Phú Yên", "Cần Thơ", "Đà Nẵng", "Hải Phòng", "Hà Nội", "TP HCM" }));
        cbNativeplace.setSelectedIndex(-1);
        cbNativeplace.setAutoscrolls(true);

        dateBirthday.setDateFormatString("dd/MM/yyyy"); // NOI18N

        txtTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkTelephone(evt);
            }
        });

        lblTelephone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTelephone.setText("Điện thoại:");

        lblBirthday.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
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
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panStaffLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(radioFemale))
                                            .addComponent(cbNativeplace, 0, 304, Short.MAX_VALUE)
                                            .addComponent(dateBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTelephone)
                                            .addGroup(panStaffLayout.createSequentialGroup()
                                                .addComponent(radioMale)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(panStaffLayout.createSequentialGroup()
                                        .addGap(79, 79, 79)
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

        tblStaff.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
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

        btnAdd.setText("Thêm nhân viên");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStaff(evt);
            }
        });

        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel(evt);
            }
        });

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
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
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
        int row = tblStaff.getSelectedRow();
        if (row != -1) {
            new frmDeposit().setVisible(true);
        }
        JOptionPane.showMessageDialog(null, "Ok");
    }//GEN-LAST:event_chooseStaffs

    private void AddStaff(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStaff
        // TODO add your handling code here:
    }//GEN-LAST:event_AddStaff

    private void Cancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel
        // TODO add your handling code here:
    }//GEN-LAST:event_Cancel

    private void txtIDStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDStaffActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed


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
