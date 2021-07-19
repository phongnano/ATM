package Views;

import Controllers.BLL_Banks;
import Controllers.TheModel;
import Models.DTO_Banks;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.IOUtils;

public class frmBanks extends javax.swing.JInternalFrame {

    DTO_Banks dto = new DTO_Banks();
    BLL_Banks bll = new BLL_Banks();
    Random rd = new Random();
    frmAdmin adm;
    frmStaff stf;
    int result;
    String path;
    BufferedImage bi;
    public static String bank;

    public frmBanks(frmAdmin admin, frmStaff staff) {
        initComponents();
        this.adm = admin;
        this.stf = staff;
        if (bank == null) {
            LoadBanks();
        } else {
            LoadBanks(bank);
        }
    }

    private void resetData() {
        txtID.setText("");
        txtName.setText("");
        lblLogobank.setText("LOGO");
        lblLogobank.setIcon(null);
    }

    private void LoadBanks(String bnk) {
        BLL_Banks bll_bank = new BLL_Banks();
        ArrayList<DTO_Banks> list = bll_bank.loadBanks(bnk);
        String[] header = {"Mã ngân hàng", "Tên ngân hàng", "Hình ảnh"};
        Object[][] rows = new Object[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getIdbank();
            rows[i][1] = list.get(i).getNambank();
            if (list.get(i).getLogobank() != null) {
                ImageIcon icon = new ImageIcon(new ImageIcon(list.get(i).getLogobank()).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                rows[i][2] = icon;
            } else {
                rows[i][2] = null;
            }
        }
        TheModel model = new TheModel(rows, header);
        tblBanks.setModel(model);
        tblBanks.setRowHeight(100);
        tblBanks.getColumnModel().getColumn(2).setPreferredWidth(100);
    }

    private void LoadBanks() {
        BLL_Banks bll_bank = new BLL_Banks();
        ArrayList<DTO_Banks> list = bll_bank.loadBanks();
        String[] header = {"Mã ngân hàng", "Tên ngân hàng", "Hình ảnh"};
        Object[][] rows = new Object[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getIdbank();
            rows[i][1] = list.get(i).getNambank();
            if (list.get(i).getLogobank() != null) {
                ImageIcon icon = new ImageIcon(new ImageIcon(list.get(i).getLogobank()).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                rows[i][2] = icon;
            } else {
                rows[i][2] = null;
            }
        }
        TheModel model = new TheModel(rows, header);
        tblBanks.setModel(model);
        tblBanks.setRowHeight(100);
        tblBanks.getColumnModel().getColumn(2).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBanks = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnLoadimge = new javax.swing.JButton();
        lblLogobank = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblBanks = new javax.swing.JTable();

        setClosable(true);

        panBanks.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUẢN LÝ NGÂN HÀNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        lblID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblID.setText("Mã ngân hàng:");

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblName.setText("Tên ngân hàng:");

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBanks(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBanks(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBanks(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBanks(evt);
            }
        });

        btnLoadimge.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnLoadimge.setText("Thêm hình ảnh");
        btnLoadimge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadLogobank(evt);
            }
        });

        lblLogobank.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblLogobank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogobank.setText("LOGO");
        lblLogobank.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblBanks.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tblBanks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblBanks.getTableHeader().setResizingAllowed(false);
        tblBanks.getTableHeader().setReorderingAllowed(false);
        tblBanks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseBanks(evt);
            }
        });
        jScrollPane.setViewportView(tblBanks);

        javax.swing.GroupLayout panBanksLayout = new javax.swing.GroupLayout(panBanks);
        panBanks.setLayout(panBanksLayout);
        panBanksLayout.setHorizontalGroup(
            panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBanksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panBanksLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panBanksLayout.createSequentialGroup()
                        .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(lblName)
                            .addComponent(btnLoadimge))
                        .addGap(50, 50, 50)
                        .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID)
                            .addComponent(txtName)
                            .addGroup(panBanksLayout.createSequentialGroup()
                                .addComponent(lblLogobank, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBanksLayout.createSequentialGroup()
                        .addComponent(lblLogobank, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panBanksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panBanksLayout.createSequentialGroup()
                        .addComponent(btnLoadimge)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        try {
            dto.setIdbank(txtID.getText());
            dto.setNambank(txtName.getText());
            InputStream is = new FileInputStream(path);
            dto.setLogobank(IOUtils.toByteArray(is));
            int results = bll.addBanks(dto);
            if (results != 0) {
                JOptionPane.showMessageDialog(null, "OK");
                resetData();
                LoadBanks();
            } else {
                JOptionPane.showMessageDialog(null, "NOT OK");
            }
        } catch (HeadlessException | IOException e) {
        }
    }//GEN-LAST:event_AddBanks

    private void EditBanks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBanks
        try {
            InputStream is = new FileInputStream(path);
            dto.setLogobank(IOUtils.toByteArray(is));
            int results = bll.editBanks(dto);
            if (results != 0) {
                JOptionPane.showMessageDialog(null, "OK");
            } else {
                JOptionPane.showMessageDialog(null, "NOT OK");
            }
        } catch (HeadlessException | IOException e) {
        }
    }//GEN-LAST:event_EditBanks

    private void DeleteBanks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBanks
        dto.setIdbank(txtID.getText());
        dto.setNambank(txtName.getText());
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa dữ liệu ?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            try {
                result = bll.deleteBanks(dto);
                //loadBanks();
                resetData();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi: " + e, "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteBanks

    private void CancelBanks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBanks
        resetData();
    }//GEN-LAST:event_CancelBanks

    private void loadLogobank(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadLogobank
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Têp hình ành", "jpg", "png");
        fileChooser.addChoosableFileFilter(filter);
        int results = fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        if (results == JFileChooser.APPROVE_OPTION) {
            path = file.getAbsolutePath();
            ImageIcon icon = new ImageIcon(path);
            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(lblLogobank.getWidth(), lblLogobank.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImg);
            lblLogobank.setIcon(newIcon);
            lblLogobank.setText("");
        }

    }//GEN-LAST:event_loadLogobank

    private void chooseBanks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseBanks
        int row = tblBanks.getSelectedRow();
        if (row != -1) {
            txtID.setEditable(false);
            txtName.setEditable(false);
            btnAdd.setEnabled(false);
            txtID.setText((String) (tblBanks.getValueAt(row, 0)));
            txtName.setText((String) (tblBanks.getValueAt(row, 1)));
            if (tblBanks.getValueAt(row, 2) != null) {
                ImageIcon icon = (ImageIcon) tblBanks.getValueAt(row, 2);
                Image img = icon.getImage().getScaledInstance(lblLogobank.getWidth(), lblLogobank.getHeight(), Image.SCALE_SMOOTH);
                lblLogobank.setText("");
                lblLogobank.setIcon(new ImageIcon(img));
            } else {
                System.err.println("Không có ảnh");
            }
        }
    }//GEN-LAST:event_chooseBanks

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLoadimge;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLogobank;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel panBanks;
    private javax.swing.JTable tblBanks;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
