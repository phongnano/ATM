package GUIS;

import Banks.BLL_Banks;
import Banks.DTO_Banks;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmBanks extends javax.swing.JInternalFrame {

    DTO_Banks dto = new DTO_Banks();
    BLL_Banks bll = new BLL_Banks();
    ArrayList<DTO_Banks> arr = new ArrayList<>();
    Random rd = new Random();
    frmStaff stf;
    int result;

    public frmBanks(frmStaff staff) {
        initComponents();
        stf = staff;
        loadBanks();
    }

    private void genID() {
        dto.setIDBank(String.valueOf(rd.nextInt(10000) + 90000));
        txtID.setText(String.valueOf(dto.getIDBank()));
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
        cbBanks = new javax.swing.JComboBox<>();

        setClosable(true);

        panBanks.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUẢN LÝ NGÂN HÀNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lblID.setText("Mẫ ngân hàng:");

        txtID.setEditable(false);

        lblName.setText("Tên ngân hàng:");

        txtName.setEditable(false);

        tblBanks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblBanks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoseBanks(evt);
            }
        });
        jScrollPane.setViewportView(tblBanks);

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBanks(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBanks(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBanks(evt);
            }
        });

        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBanks(evt);
            }
        });

        cbBanks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vietcombank", "Sacombank", "Techbank", "TPBank", "VPBank" }));
        cbBanks.setSelectedIndex(-1);
        cbBanks.setAutoscrolls(true);
        cbBanks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectedBanks(evt);
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
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panBanksLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
                    .addGroup(panBanksLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(lblName))
                        .addGap(50, 50, 50)
                        .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(txtID))
                        .addGap(18, 18, 18)
                        .addComponent(cbBanks, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panBanksLayout.setVerticalGroup(
            panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBanksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panBanksLayout.createSequentialGroup()
                        .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))
                        .addGap(18, 18, 18)
                        .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName)))
                    .addComponent(cbBanks))
                .addGap(18, 18, 18)
                .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBanks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBanks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void SelectedBanks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectedBanks
    
        
    }//GEN-LAST:event_SelectedBanks


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cbBanks;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel panBanks;
    private javax.swing.JTable tblBanks;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
