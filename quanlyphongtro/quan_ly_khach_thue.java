package quanlyphongtro;
public class quan_ly_khach_thue extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(quan_ly_khach_thue.class.getName());

    public quan_ly_khach_thue() {
        initComponents();
        taiDanhSachKhachThue();
    }  
private void taiDanhSachKhachThue() {
    javax.swing.table.DefaultTableModel model =
            (javax.swing.table.DefaultTableModel) tblKhachThue.getModel();

    model.setRowCount(0);

    String sql = "SELECT ma_khach, ho_ten, so_dien_thoai, cccd "
            + "FROM khach_thue";

    try {
        java.sql.Connection conn = KetNoiCSDL.getConnection();
        java.sql.PreparedStatement ps = conn.prepareStatement(sql);
        java.sql.ResultSet rs = ps.executeQuery();

        int stt = 1;

        while (rs.next()) {
            model.addRow(new Object[]{
                stt++,
                rs.getString("ma_khach"),
                rs.getString("ho_ten"),
                rs.getString("so_dien_thoai"),
                rs.getString("cccd"),
                "",
                ""
            });
        }

        rs.close();
        ps.close();
        conn.close();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Lỗi tải danh sách: " + e.getMessage());
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiemKhach = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachThue = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ KHÁCH THUÊ");

        jLabel2.setText("Tìm kiếm :");

        txtTimKiemKhach.addActionListener(this::txtTimKiemKhachActionPerformed);

        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Thêm khách");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Sửa");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Xóa");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setText("Làm mới");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        tblKhachThue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã khách", "Họ và tên", "Số điện thoại", "CCCD", "Mã phòng", "Ngày thuê"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblKhachThue);
        if (tblKhachThue.getColumnModel().getColumnCount() > 0) {
            tblKhachThue.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblKhachThue.getColumnModel().getColumn(3).setPreferredWidth(125);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiemKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTimKiemKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemKhachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemKhachActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String tuKhoa = txtTimKiemKhach.getText().trim();

javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter =
        new javax.swing.table.TableRowSorter<>(
                (javax.swing.table.DefaultTableModel) tblKhachThue.getModel());

tblKhachThue.setRowSorter(sorter);

if (tuKhoa.isEmpty()) {
    sorter.setRowFilter(null);
} else {
    sorter.setRowFilter(
            javax.swing.RowFilter.regexFilter(
                    "(?i)" + java.util.regex.Pattern.quote(tuKhoa), 1, 2, 3, 5));
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
javax.swing.table.DefaultTableModel model =
        (javax.swing.table.DefaultTableModel) tblKhachThue.getModel();

them_khach_thue form = new them_khach_thue(model);

form.setLocationRelativeTo(this);
form.setVisible(true);
taiDanhSachKhachThue(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int dong = tblKhachThue.getSelectedRow();

if (dong == -1) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Vui lòng chọn khách thuê cần sửa!");
    return;
}

int dongModel = tblKhachThue.convertRowIndexToModel(dong);

javax.swing.table.DefaultTableModel model =
        (javax.swing.table.DefaultTableModel) tblKhachThue.getModel();

sua_khach_thue form = new sua_khach_thue(model, dongModel);

form.setLocationRelativeTo(this);
form.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

int dong = tblKhachThue.getSelectedRow();

if (dong == -1) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Vui lòng chọn khách thuê cần xóa!");
    return;
}

int dongModel = tblKhachThue.convertRowIndexToModel(dong);

javax.swing.table.DefaultTableModel model =
        (javax.swing.table.DefaultTableModel) tblKhachThue.getModel();

String maKhach = model.getValueAt(dongModel, 1).toString();

int xacNhan = javax.swing.JOptionPane.showConfirmDialog(this,
        "Bạn có chắc chắn muốn xóa khách thuê này không?",
        "Xác nhận xóa",
        javax.swing.JOptionPane.YES_NO_OPTION);

if (xacNhan == javax.swing.JOptionPane.YES_OPTION) {

    String sql = "DELETE FROM khach_thue WHERE ma_khach = ?";

    try {
        java.sql.Connection conn = KetNoiCSDL.getConnection();
        java.sql.PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, maKhach);

        int ketQua = ps.executeUpdate();

        ps.close();
        conn.close();

        if (ketQua > 0) {
            model.removeRow(dongModel);

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Xóa khách thuê thành công!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Không tìm thấy khách thuê trong MySQL!");
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Lỗi xóa khách thuê: " + e.getMessage());
    }
}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        taiDanhSachKhachThue();

javax.swing.JOptionPane.showMessageDialog(this,
        "Đã làm mới danh sách khách thuê!");
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new quan_ly_khach_thue().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachThue;
    private javax.swing.JTextField txtTimKiemKhach;
    // End of variables declaration//GEN-END:variables
}
