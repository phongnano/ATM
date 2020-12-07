package GUIS;

import Cards.DTO_Cards;
import Customers.DTO_Customers;
import com.toedter.calendar.JTextFieldDateEditor;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class frmCustomerManagement extends javax.swing.JInternalFrame {
    
    frmStaff stf;
    DTO_Cards card = new DTO_Cards();
    DTO_Customers cust = new DTO_Customers();
    Random rd = new Random();
    Date sttday = new Date();
    Date endday = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("MM/yy");
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
                            .addComponent(cbNativeplace, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panCustomerLayout.createSequentialGroup()
                                .addComponent(radioMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioFemale))
                            .addComponent(txtFullname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateBirthday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(txtTelephone)))
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
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnAdd.setText("Thêm");

        btnEdit.setText("Sửa");

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

        javax.swing.GroupLayout panCardLayout = new javax.swing.GroupLayout(panCard);
        panCard.setLayout(panCardLayout);
        panCardLayout.setHorizontalGroup(
            panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccount)
                    .addComponent(lblStartday)
                    .addComponent(lblEndday)
                    .addComponent(lblCard)
                    .addComponent(lblCards))
                .addGap(138, 138, 138)
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCardLayout.createSequentialGroup()
                        .addComponent(radioVisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(radioLocal))
                    .addGroup(panCardLayout.createSequentialGroup()
                        .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEDay)
                            .addComponent(lblSDay))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtIDAcco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIDCard, javax.swing.GroupLayout.Alignment.TRAILING))
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
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCardLayout.createSequentialGroup()
                        .addComponent(lblStartday)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndday)
                            .addComponent(lblEDay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblSDay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCards)
                        .addComponent(radioLocal))
                    .addComponent(radioVisa))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(75, 75, 75)
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(75, 75, 75)
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(75, 75, 75)
                                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(panCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125)
                        .addComponent(panCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkCards(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCards
        if (radioVisa.isSelected()) {
            if (checkData()) {
                genVisCard();
                txtIDAcco.setText(genIDAcco() + genIDCust());
                Dates();
            } else {
                groupCard.clearSelection();
            }
        }
        if (radioLocal.isSelected()) {
            if (checkData()) {
                genLocCard();
                txtIDAcco.setText(genIDAcco() + genIDCust());
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
    
    private boolean checkData() {
        return (!txtFullname.getText().isEmpty() && !txtTelephone.getText().isEmpty()) && (radioMale.isSelected() || radioFemale.isSelected());
    }
    
    private void Dates() {
        cal.setTime(endday);
        cal.add(Calendar.MONTH, 4);
        lblSDay.setText(formatter.format(sttday));
        lblEDay.setText(formatter.format(cal.getTime()));
    }
    
    private String genIDCust() {
        cust.setIdcust(String.valueOf(rd.nextInt(10000) + 90000));
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
    private javax.swing.JComboBox<String> cbNativeplace;
    private com.toedter.calendar.JDateChooser dateBirthday;
    private javax.swing.ButtonGroup groupCard;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.JScrollPane jScrollPane;
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
    private javax.swing.JPanel panCard;
    private javax.swing.JPanel panCustomer;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioLocal;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioVisa;
    private javax.swing.JTable tableInfo;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtIDAcco;
    private javax.swing.JTextField txtIDCard;
    private javax.swing.JTextField txtIDCust;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
