package GUIS;

import Cards.BLL_Cards;
import Cards.DTO_Cards;
import Customers.BLL_Customers;
import Customers.DTO_Customers;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

public class frmCustomerManagement extends javax.swing.JInternalFrame {

    frmStaff stf;
    DTO_Cards card = new DTO_Cards();
    BLL_Cards bllcard = new BLL_Cards();
    DTO_Customers cust = new DTO_Customers();
    BLL_Customers bllcust = new BLL_Customers();
    Random rd = new Random();
    Date sttday = new Date();
    Date endday = new Date();
    SimpleDateFormat formatter, getpass;
    Calendar cal = Calendar.getInstance();

    public frmCustomerManagement(frmStaff staff) {
        initComponents();
        stf = staff;
        txtIDCust.setText(genIDCust());
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dateBirthday.getDateEditor();
        editor.setEditable(false);
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
        dateBirthday = new com.toedter.calendar.JDateChooser();
        txtTelephone = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        panCard = new javax.swing.JPanel();
        lblCard = new javax.swing.JLabel();
        txtIDCard = new javax.swing.JTextField();
        txtIDAcco = new javax.swing.JTextField();
        lblAccount = new javax.swing.JLabel();
        lblStartday = new javax.swing.JLabel();
        lblEndday = new javax.swing.JLabel();
        lblSDay = new javax.swing.JLabel();
        lblEDay = new javax.swing.JLabel();
        lblCards = new javax.swing.JLabel();
        radioVisa = new javax.swing.JRadioButton();
        radioLocal = new javax.swing.JRadioButton();
        lblBank = new javax.swing.JLabel();
        cbBank = new javax.swing.JComboBox<>();
        jScrollPane = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();

        setClosable(true);
        setTitle("QUẢN LÝ KHÁCH HÀNG");

        panCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblIDCust.setText("Mã khách hàng:");

        groupGender.add(radioMale);
        radioMale.setText("Nam");

        groupGender.add(radioFemale);
        radioFemale.setText("Nữ");

        txtIDCust.setEditable(false);

        lblFullname.setText("Họ và tên:");

        lblGender.setText("Giới tính:");

        lblTelephone.setText("Điện thoại:");

        lblNativeplace.setText("Nơi sinh:");

        cbNativeplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Phú Yên", "Cần Thơ", "Đà Nẵng", "Hải Phòng", "Hà Nội", "TP HCM" }));
        cbNativeplace.setSelectedIndex(-1);
        cbNativeplace.setAutoscrolls(true);

        lblBirthday.setText("Ngày sinh:");

        dateBirthday.setDateFormatString("dd/MM/yyyy"); // NOI18N

        txtTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkNumbers(evt);
            }
        });

        lblID.setText("CMND:");

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
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panCustomerLayout.createSequentialGroup()
                                .addComponent(radioMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioFemale))
                            .addComponent(txtFullname)
                            .addComponent(cbNativeplace, 0, 330, Short.MAX_VALUE)
                            .addComponent(dateBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelephone)))
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addComponent(lblIDCust)
                        .addGap(102, 102, 102)
                        .addComponent(txtIDCust))
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addComponent(lblGender)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addComponent(lblID)
                        .addGap(157, 157, 157)
                        .addComponent(txtID)))
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
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
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
                .addContainerGap())
        );

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustCard(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCustCard(evt);
            }
        });

        btnDelete.setText("Xóa");

        btnCancel.setText("Hủy");

        panCard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblCard.setText("Số thẻ:");

        txtIDCard.setEditable(false);

        txtIDAcco.setEditable(false);

        lblAccount.setText("Số tài khoản");

        lblStartday.setText("Ngày bắt đầu:");

        lblEndday.setText("Ngày kết thúc:");

        lblSDay.setText(".........");

        lblEDay.setText(".........");

        lblCards.setText("Chọn loại thẻ:");

        groupCard.add(radioVisa);
        radioVisa.setText("Thẻ Visa");
        radioVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCards(evt);
            }
        });

        groupCard.add(radioLocal);
        radioLocal.setText("Thẻ Nội địa");
        radioLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCards(evt);
            }
        });

        lblBank.setText("Chọn ngân hàng:");

        javax.swing.GroupLayout panCardLayout = new javax.swing.GroupLayout(panCard);
        panCard.setLayout(panCardLayout);
        panCardLayout.setHorizontalGroup(
            panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCardLayout.createSequentialGroup()
                        .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAccount)
                            .addComponent(lblStartday)
                            .addComponent(lblEndday)
                            .addComponent(lblCard)
                            .addComponent(lblCards))
                        .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panCardLayout.createSequentialGroup()
                                .addGap(138, 335, Short.MAX_VALUE)
                                .addComponent(radioLocal))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panCardLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDAcco, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIDCard)
                                    .addGroup(panCardLayout.createSequentialGroup()
                                        .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSDay)
                                            .addComponent(lblEDay))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCardLayout.createSequentialGroup()
                        .addComponent(lblBank)
                        .addGap(114, 114, 114)
                        .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioVisa)
                            .addComponent(cbBank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panCardLayout.setVerticalGroup(
            panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDAcco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartday)
                    .addComponent(lblSDay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndday)
                    .addComponent(lblEDay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCards)
                    .addComponent(radioLocal)
                    .addComponent(radioVisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBank))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane.setViewportView(tableInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(345, 345, 345)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(345, 345, 345)
                                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(panCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkCards(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCards
        if (radioVisa.isSelected()) {
            if (checkData()) {
                genVisCard();
                txtIDAcco.setText(genIDAcco() + txtIDCust.getText().substring(2));
                Dates();
            } else {
                groupCard.clearSelection();
            }
        }
        if (radioLocal.isSelected()) {
            if (checkData()) {
                genLocCard();
                txtIDAcco.setText(genIDAcco() + txtIDCust.getText().substring(2));
                Dates();
            } else {
                groupCard.clearSelection();
            }
        }
    }//GEN-LAST:event_checkCards

    private void checkNumbers(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkNumbers
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
        if (txtTelephone.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_checkNumbers

    private void AddCustCard(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustCard
        getpass = new SimpleDateFormat("ddMMyyyy");
        formatter = new SimpleDateFormat("yyyy-MM-dd");

        cal.setTime(endday);
        cal.add(Calendar.YEAR, 4);

        cust.setIdcust(txtIDCust.getText());
        cust.setId(txtID.getText());
        cust.setFullname(txtFullname.getText());
        cust.setBirthday(new java.sql.Date(dateBirthday.getDate().getTime()));
        if (radioMale.isSelected()) {
            cust.setGender(0);
        }
        if (radioFemale.isSelected()) {
            cust.setGender(1);
        }
        cust.setNativeplace(cbNativeplace.getSelectedItem().toString());
        cust.setTelephone(txtTelephone.getText());
        cust.setPassword(getpass.format(dateBirthday.getDate()));
        cust.setRole(2);

        card.setIdcard(txtIDCard.getText());
        card.setIdacco(txtIDAcco.getText());
        card.setSttday(new java.sql.Date(sttday.getTime()));
        card.setEndday(new java.sql.Date(endday.getTime()));

        if (radioVisa.isSelected()) {
            card.setTypecard("Visa");
        }
        if (radioLocal.isSelected()) {
            card.setTypecard("Nội địa");
        }

        try {
            int result_1 = bllcust.AddCustomer(cust);
            int result_2 = bllcard.AddCard(card);
            if (result_1 != 0 && result_2 != 0) {
                JOptionPane.showMessageDialog(null, "OK");
            }
        } catch (HeadlessException e) {
        }
    }//GEN-LAST:event_AddCustCard

    private void EditCustCard(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCustCard

    }//GEN-LAST:event_EditCustCard

    private boolean checkData() {
        return (!txtFullname.getText().isEmpty() && !txtTelephone.getText().isEmpty()) && (radioMale.isSelected() || radioFemale.isSelected());
    }

    private void Dates() {
        formatter = new SimpleDateFormat("MM/yy");
        cal.setTime(endday);
        cal.add(Calendar.YEAR, 4);
        lblSDay.setText(formatter.format(sttday));
        lblEDay.setText(formatter.format(cal.getTime()));
    }

    private String genIDCust() {
        cust.setIdcust("KH" + String.valueOf(rd.nextInt(10000) + 90000));
        return cust.getIdcust();
    }

    private String genIDAcco() {
        card.setIdacco(String.valueOf(rd.nextInt(1000000) + 9000000));
        return card.getIdacco();
    }

    private void genVisCard() {
        radioVisa.setEnabled(false);
        radioLocal.setEnabled(true);
        String strVis = "001";
        int intVis = rd.nextInt(100000000) + 900000000;
        card.setIdcard(String.valueOf(strVis + intVis));
        txtIDCard.setText(String.valueOf(card.getIdcard()));
        txtIDAcco.setText(genIDAcco() + txtIDCust.getText());
    }

    private void genLocCard() {
        radioVisa.setEnabled(true);
        radioLocal.setEnabled(false);
        String strLoc = "002";
        int intLoc = rd.nextInt(100000000) + 900000000;
        card.setIdcard(String.valueOf(strLoc + intLoc));
        txtIDCard.setText(String.valueOf(card.getIdcard()));
        txtIDAcco.setText(genIDAcco() + txtIDCust.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cbBank;
    private javax.swing.JComboBox<String> cbNativeplace;
    private com.toedter.calendar.JDateChooser dateBirthday;
    private javax.swing.ButtonGroup groupCard;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblCard;
    private javax.swing.JLabel lblCards;
    private javax.swing.JLabel lblEDay;
    private javax.swing.JLabel lblEndday;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDCust;
    private javax.swing.JLabel lblNativeplace;
    private javax.swing.JLabel lblSDay;
    private javax.swing.JLabel lblStartday;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JPanel panCard;
    private javax.swing.JPanel panCustomer;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioLocal;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioVisa;
    private javax.swing.JTable tableInfo;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDAcco;
    private javax.swing.JTextField txtIDCard;
    private javax.swing.JTextField txtIDCust;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
