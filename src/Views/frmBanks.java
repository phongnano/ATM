package Views;

import Controllers.BLL_Banks;
import Models.DTO_Banks;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmBanks extends javax.swing.JInternalFrame {

    DTO_Banks dto = new DTO_Banks();
    BLL_Banks bll = new BLL_Banks();
    ArrayList<DTO_Banks> arr = new ArrayList<>();
    Random rd = new Random();
    frmAdmin adm;
    frmStaff stf;
    int result;

    public frmBanks(frmAdmin admin, frmStaff staff) {
        initComponents();
        this.adm = admin;
        this.stf = staff;
        loadBanks();
    }

    private void resetData() {
        txtID.setText("");
        txtName.setText("");
    }

    private void loadBanks() {
        tblBanks.setVisible(true);
        String[] header = {"Mã ngân hàng", "Tên ngân hàng"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        arr = bll.loadBanks();
        for (int i = 0; i < arr.size(); i++) {
            dto = arr.get(i);
            String id = dto.getIDBank();
            String name = dto.getNameBank();
            Object[] row = {id, name};
            model.addRow(row);
        }
        tblBanks.setModel(model);
        tblBanks.setDefaultEditor(Object.class, null);
        tblBanks.getTableHeader().setReorderingAllowed(false);
        tblBanks.getTableHeader().setResizingAllowed(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBanks = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        tblBanks = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setClosable(true);

        panBanks.setBackground(new java.awt.Color(255, 255, 255));
        panBanks.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUẢN LÝ NGÂN HÀNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 16), new java.awt.Color(0, 0, 153))); // NOI18N

        lblID.setBackground(new java.awt.Color(255, 255, 255));
        lblID.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 153, 0));
        lblID.setText("Mã ngân hàng:");

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 153, 0));
        lblName.setText("Tên ngân hàng:");

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N

        tblBanks.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblBanks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblBanks.setGridColor(new java.awt.Color(255, 255, 255));
        tblBanks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoseBanks(evt);
            }
        });
        jScrollPane.setViewportView(tblBanks);

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(153, 0, 51));
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBanks(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(153, 0, 51));
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBanks(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 0, 51));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBanks(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(153, 0, 51));
        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBanks(evt);
            }
        });

        javax.swing.GroupLayout panBanksLayout = new javax.swing.GroupLayout(panBanks);
        panBanks.setLayout(panBanksLayout);
        panBanksLayout.setHorizontalGroup(
            panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBanksLayout.createSequentialGroup()
                .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBanksLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addGroup(panBanksLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane))
                    .addGroup(panBanksLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(lblName))
                        .addGap(50, 50, 50)
                        .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID)
                            .addComponent(txtName))))
                .addContainerGap())
        );
        panBanksLayout.setVerticalGroup(
            panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBanksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBanks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBanks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBanks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBanks

    }//GEN-LAST:event_AddBanks

    private void EditBanks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBanks

    }//GEN-LAST:event_EditBanks

    private void DeleteBanks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBanks
        dto.setIDBank(txtID.getText());
        dto.setNameBank(txtName.getText());
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa dữ liệu ?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            try {
                result = bll.deleteBanks(dto);
                loadBanks();
                resetData();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi: " + e, "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteBanks

    private void CancelBanks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBanks
        resetData();
    }//GEN-LAST:event_CancelBanks

    private void ChoseBanks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoseBanks
        int row = tblBanks.getSelectedRow();
        if (row != -1) {
            txtID.setText(tblBanks.getValueAt(row, 0).toString());
            txtName.setText(tblBanks.getValueAt(row, 1).toString());
        }
    }//GEN-LAST:event_ChoseBanks

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel panBanks;
    private javax.swing.JTable tblBanks;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
