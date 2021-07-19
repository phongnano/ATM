package Views;

import Controllers.BLL_Banks;
import Controllers.BLL_Customers;
import Limits.LimitText;
import Models.DTO_Cards;
import Models.DTO_Customers;
import com.toedter.calendar.JTextFieldDateEditor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class frmCustomerManagement extends javax.swing.JInternalFrame {

    DTO_Cards dto_card = new DTO_Cards();
    DTO_Customers dto_cust = new DTO_Customers();
    BLL_Customers bll_cust = new BLL_Customers();
    BLL_Banks bll_bank = new BLL_Banks();
    frmStaff stf;
    Random rd = new Random();
    public static String bank, manage;

    public frmCustomerManagement(frmStaff staff) {
        initComponents();
        this.stf = staff;
        loadBank();
        initialCustomers();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dateBirthday.getDateEditor();
        editor.setEditable(false);
        radioVisa.setEnabled(false);
        radioLocal.setEnabled(false);
    }

    private void loadBank() {
        HashMap<String, String> map = bll_bank.getBank(bank);
        map.keySet().forEach((str) -> {
            cbBank.addItem(str);
        });
    }

    private void initialCustomers() {
        String id = "KH";
        int rand = rd.nextInt(90000) + 10000;
        String str = id + rand;
        txtIDCust.setText(str);
    }

    private void initialVisa() {
        String id = "00";
        int card = rd.nextInt(1000000) + 9000000;
        int acco = rd.nextInt(100000000) + 900000000;
        String strCard = id + card;
        String strAcco = String.valueOf(acco);
        txtIDCard.setText(strCard);
        txtAccount.setText(strAcco);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat year = new SimpleDateFormat("yy");

        String startmonth = month.format(calendar.getTime());
        String startyear = year.format(calendar.getTime());
        txtStartday.setText(startmonth + "/" + startyear);
        calendar.add(Calendar.YEAR, 4);
        String endmonth = month.format(calendar.getTime());
        String endyear = year.format(calendar.getTime());
        txtEndday.setText(endmonth + "/" + endyear);

    }

    private void initialLocal() {
        String id = "01";
        int card = rd.nextInt(1000000) + 9000000;
        int acco = rd.nextInt(100000000) + 900000000;
        String strCard = id + card;
        String strAcco = String.valueOf(acco);
        txtIDCard.setText(strCard);
        txtAccount.setText(strAcco);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat year = new SimpleDateFormat("yy");

        String startmonth = month.format(calendar.getTime());
        String startyear = year.format(calendar.getTime());
        txtStartday.setText(startmonth + "/" + startyear);
        calendar.add(Calendar.YEAR, 4);
        String endmonth = month.format(calendar.getTime());
        String endyear = year.format(calendar.getTime());
        txtEndday.setText(endmonth + "/" + endyear);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGender = new javax.swing.ButtonGroup();
        groupCard = new javax.swing.ButtonGroup();
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
        cbNativeplace = new javax.swing.JComboBox<>();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        dateBirthday = new com.toedter.calendar.JDateChooser();
        lblBank = new javax.swing.JLabel();
        cbBank = new javax.swing.JComboBox<>();
        lblCard = new javax.swing.JLabel();
        radioVisa = new javax.swing.JRadioButton();
        radioLocal = new javax.swing.JRadioButton();
        lblIDCard = new javax.swing.JLabel();
        txtIDCard = new javax.swing.JTextField();
        lblAccount = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        lblStartday = new javax.swing.JLabel();
        txtStartday = new javax.swing.JTextField();
        lblEndday = new javax.swing.JLabel();
        txtEndday = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();

        setClosable(true);
        setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        panCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN KHÁCH HÀNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 24))); // NOI18N

        lblIDCust.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblIDCust.setText("Mã khách hàng");

        txtIDCust.setEditable(false);
        txtIDCust.setBackground(new java.awt.Color(240, 240, 240));
        txtIDCust.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        lblID.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblID.setText("CMND");

        lblFullname.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblFullname.setText("Họ và tên");

        lblGender.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblGender.setText("Giới tính");

        lblBirthday.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblBirthday.setText("Ngày sinh");

        lblNatveplace.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblNatveplace.setText("Quê quán");

        txtID.setBackground(new java.awt.Color(240, 240, 240));
        txtID.setDocument(new LimitText(9));
        txtID.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        txtFullname.setBackground(new java.awt.Color(240, 240, 240));
        txtFullname.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        groupGender.add(radioMale);
        radioMale.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        radioMale.setText("Nam");

        groupGender.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        radioFemale.setText("Nữ");

        cbNativeplace.setBackground(new java.awt.Color(240, 240, 240));
        cbNativeplace.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        cbNativeplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Phú Yên", "Cần Thơ", "Đà Nẵng", "Hải Phòng", "Hà Nội", "TP.HCM" }));
        cbNativeplace.setSelectedIndex(-1);

        lblPhone.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblPhone.setText("Điện thoại");

        txtPhone.setBackground(new java.awt.Color(240, 240, 240));
        txtPhone.setDocument(new LimitText(10));
        txtPhone.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        dateBirthday.setDateFormatString("dd/MM/yyyy"); // NOI18N
        dateBirthday.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        lblBank.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblBank.setText("Ngân hàng");

        cbBank.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        cbBank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn" }));
        cbBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBank(evt);
            }
        });

        lblCard.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblCard.setText("Loại thẻ");

        groupGender.add(radioVisa);
        radioVisa.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        radioVisa.setText("Visa");
        radioVisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkCard(evt);
            }
        });

        groupGender.add(radioLocal);
        radioLocal.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        radioLocal.setText("Nội địa");
        radioLocal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkCard(evt);
            }
        });

        lblIDCard.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblIDCard.setText("Số thẻ");

        txtIDCard.setEditable(false);
        txtIDCard.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        lblAccount.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblAccount.setText("Số tài khoản");

        txtAccount.setEditable(false);
        txtAccount.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        lblStartday.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblStartday.setText("Ngày phát hành");

        txtStartday.setEditable(false);
        txtStartday.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        lblEndday.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblEndday.setText("Ngày kết thúc");

        txtEndday.setEditable(false);
        txtEndday.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N

        btnInsert.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCustomer(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnUpdate.setText("Cập nhật");

        btnDelete.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnDelete.setText("Xóa");

        btnCancel.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnCancel.setText("Hủy");

        javax.swing.GroupLayout panCustomerLayout = new javax.swing.GroupLayout(panCustomer);
        panCustomer.setLayout(panCustomerLayout);
        panCustomerLayout.setHorizontalGroup(
            panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDCust)
                            .addComponent(lblID)
                            .addComponent(lblFullname)
                            .addComponent(lblGender)
                            .addComponent(lblBirthday)
                            .addComponent(lblNatveplace)
                            .addComponent(lblPhone)
                            .addComponent(lblBank)
                            .addComponent(lblCard)
                            .addComponent(lblIDCard)
                            .addComponent(lblAccount)
                            .addComponent(lblStartday)
                            .addComponent(lblEndday))
                        .addGap(60, 60, 60)
                        .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCustomerLayout.createSequentialGroup()
                                .addComponent(radioVisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioLocal))
                            .addComponent(cbNativeplace, 0, 429, Short.MAX_VALUE)
                            .addGroup(panCustomerLayout.createSequentialGroup()
                                .addComponent(radioMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioFemale))
                            .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID)
                            .addComponent(txtFullname)
                            .addComponent(dateBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbBank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDCust)
                            .addComponent(txtStartday)
                            .addComponent(txtEndday)
                            .addComponent(txtIDCard, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAccount, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panCustomerLayout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(cbNativeplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBank)
                    .addComponent(cbBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioVisa)
                    .addComponent(radioLocal)
                    .addComponent(lblCard))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDCard)
                    .addComponent(txtIDCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccount))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartday))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndday))
                .addGap(18, 18, 18)
                .addGroup(panCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnCancel)))
        );

        tblCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblCustomer.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
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
        tblCustomer.getTableHeader().setResizingAllowed(false);
        tblCustomer.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setViewportView(tblCustomer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane)
            .addComponent(panCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBank(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBank
        if (cbBank.getSelectedIndex() == 0) {
            radioVisa.setEnabled(false);
            radioLocal.setEnabled(false);
        } else {
            radioVisa.setEnabled(true);
            radioLocal.setEnabled(true);
        }
    }//GEN-LAST:event_checkBank

    private void checkCard(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkCard
        if (radioVisa.isSelected()) {
            initialVisa();
        }
        if (radioLocal.isSelected()) {
            initialLocal();
        }
    }//GEN-LAST:event_checkCard

    private void insertCustomer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCustomer
        try {
            HashMap<String, String> map = bll_bank.getBank(bank);
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            dto_card.setIdcard(txtIDCard.getText());
            dto_card.setIdacco(txtAccount.getText());
            Calendar calendar = Calendar.getInstance();
            String startday = format.format(calendar.getTime());
            Date sday = format.parse(startday);
            dto_card.setSttday(new java.sql.Date(sday.getTime()));
            calendar.add(Calendar.YEAR, 4);
            String endday = format.format(calendar.getTime());
            Date eday = format.parse(endday);
            dto_card.setEndday(new java.sql.Date(eday.getTime()));
            dto_card.setIdbank(map.get(cbBank.getSelectedItem().toString()));
            if (radioVisa.isSelected()) {
                dto_card.setTypecard(radioVisa.getText());
            }
            if (radioLocal.isSelected()) {
                dto_card.setTypecard(radioLocal.getText());
            }
            dto_card.setPin("000000");
            dto_cust.setIdcust(txtIDCust.getText());
            dto_cust.setId(txtID.getText());
            dto_cust.setFullname(txtFullname.getText());
            if (radioMale.isSelected()) {
                dto_cust.setGender(0);
            }
            if (radioFemale.isSelected()) {
                dto_cust.setGender(1);
            }
            String strBirthday = format.format(dateBirthday.getDate());
            Date birthday = format.parse(strBirthday);
            dto_cust.setBirthday(new java.sql.Date(birthday.getTime()));
            dto_cust.setNativeplace(cbNativeplace.getSelectedItem().toString());
            dto_cust.setTelephone(txtPhone.getText());
            dto_cust.setPassword(format.format(birthday).replaceAll("/", ""));
            dto_cust.setAccount(dto_card.getIdacco());
            dto_cust.setBalance(50000);
            dto_cust.setRole(2);
            dto_cust.setBank(map.get(cbBank.getSelectedItem().toString()));
            dto_cust.setManage(manage);
        } catch (ParseException e) {
        }
        int result_cust = bll_cust.insertCustomer(dto_card.getIdcard(), dto_card.getIdacco(), dto_card.getSttday(), dto_card.getEndday(), dto_card.getIdbank(), dto_card.getTypecard(), dto_card.getPin(), dto_cust.getIdcust(), dto_cust.getId(), dto_cust.getFullname(), dto_cust.getBirthday(), dto_cust.getGender(), dto_cust.getNativeplace(), dto_cust.getTelephone(), dto_cust.getPassword(), dto_cust.getAccount(), dto_cust.getBalance(), dto_cust.getRole(), dto_cust.getBank(), dto_cust.getManage());
        if (result_cust != 0) {
            System.out.println("OK");
        } else {
            System.err.println("NOT OK");
        }

    }//GEN-LAST:event_insertCustomer

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JLabel lblEndday;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDCard;
    private javax.swing.JLabel lblIDCust;
    private javax.swing.JLabel lblNatveplace;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblStartday;
    private javax.swing.JPanel panCustomer;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioLocal;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioVisa;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtEndday;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDCard;
    private javax.swing.JTextField txtIDCust;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStartday;
    // End of variables declaration//GEN-END:variables
}
