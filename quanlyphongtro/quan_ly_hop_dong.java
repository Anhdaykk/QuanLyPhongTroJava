package quanlyphongtro;
import javax.swing.JOptionPane;
public class quan_ly_hop_dong extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(quan_ly_hop_dong.class.getName());

    public quan_ly_hop_dong() {
        initComponents();
         taiDanhSachHopDong();
    }

private void taiDanhSachHopDong() {
    javax.swing.table.DefaultTableModel model =
            (javax.swing.table.DefaultTableModel) tblHopDong.getModel();

    model.setRowCount(0);

    String sql = "SELECT hd.ma_hop_dong, kt.ho_ten, "
            + "pt.ma_phong, kt.ma_khach, hd.ngay_bat_dau, "
            + "hd.ngay_ket_thuc, hd.tien_coc, hd.trang_thai "
            + "FROM hop_dong hd "
            + "JOIN khach_thue kt ON hd.id_khach = kt.id_khach "
            + "JOIN phong_tro pt ON hd.id_phong = pt.id_phong";

    try {
        java.sql.Connection conn = KetNoiCSDL.getConnection();
        java.sql.PreparedStatement ps = conn.prepareStatement(sql);
        java.sql.ResultSet rs = ps.executeQuery();

        int stt = 1;

        while (rs.next()) {
            model.addRow(new Object[]{
                stt++,
                rs.getString("ma_hop_dong"),
                rs.getString("ho_ten"),
                rs.getString("ma_phong"),
                rs.getString("ma_khach"),
                rs.getDate("ngay_bat_dau"),
                rs.getDate("ngay_ket_thuc"),
                rs.getBigDecimal("tien_coc"),
                rs.getString("trang_thai")
            });
        }

        rs.close();
        ps.close();
        conn.close();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Lỗi tải danh sách hợp đồng: " + e.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTimHopDong = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHopDong = new javax.swing.JTable();
        btnQuayLai = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ HỢP ĐỒNG");

        jLabel2.setText("Tìm kiếm :");

        txtTimHopDong.addActionListener(this::txtTimHopDongActionPerformed);

        jButton1.setText("Danh sách hợp đồng");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        btnThem.setText("Thêm hợp đồng");
        btnThem.addActionListener(this::btnThemActionPerformed);

        btnSua.setText("Sửa hợp đồng");
        btnSua.addActionListener(this::btnSuaActionPerformed);

        btnXoa.setText("Xóa hợp đồng");
        btnXoa.addActionListener(this::btnXoaActionPerformed);

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(this::btnLamMoiActionPerformed);

        tblHopDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hợp đồng", "Họ và tên", "Mã phòng", "Mã khách", "Ngày bắt đầu", "Ngày kết thúc", "Tiền cọc", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHopDong);

        btnQuayLai.setText("Quay lại");

        btnTimKiem.setText("Tìm kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimKiem)
                    .addComponent(btnQuayLai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtTimHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1)
                        .addComponent(btnThem)
                        .addComponent(btnLamMoi)
                        .addComponent(btnSua)
                        .addComponent(btnXoa))
                    .addContainerGap(333, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnQuayLai)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTimHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnThem)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnSua)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnXoa)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnLamMoi)
                    .addContainerGap(430, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimHopDongActionPerformed
String tuKhoa = txtTimHopDong.getText().trim();

javax.swing.table.DefaultTableModel model =
        (javax.swing.table.DefaultTableModel) tblHopDong.getModel();

javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter =
        new javax.swing.table.TableRowSorter<>(model);

tblHopDong.setRowSorter(sorter);

if (tuKhoa.isEmpty()) {
    sorter.setRowFilter(null);
} else {
    sorter.setRowFilter(
            javax.swing.RowFilter.regexFilter(
                    "(?i)" + java.util.regex.Pattern.quote(tuKhoa),
                    1, 2, 3, 4, 8
            )
    );
}
    }//GEN-LAST:event_txtTimHopDongActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
taiDanhSachHopDong();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

    them_hop_dong form = new them_hop_dong();

    form.setDefaultCloseOperation(
        javax.swing.WindowConstants.DISPOSE_ON_CLOSE
    );

    form.setLocationRelativeTo(this);

    form.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent e) {
            taiDanhSachHopDong();
        }
    });

    form.setVisible(true);

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

    int dong = tblHopDong.getSelectedRow();

    if (dong == -1) {
        JOptionPane.showMessageDialog(this,
                "Vui lòng chọn hợp đồng cần sửa!");
        return;
    }

    int dongModel = tblHopDong.convertRowIndexToModel(dong);

    javax.swing.table.DefaultTableModel model =
            (javax.swing.table.DefaultTableModel) tblHopDong.getModel();

    String maHopDong = model.getValueAt(dongModel, 1).toString();

    sua_hop_dong form = new sua_hop_dong(maHopDong);

    form.setDefaultCloseOperation(
            javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    form.setLocationRelativeTo(this);

    form.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent e) {
            taiDanhSachHopDong();
        }
    });

    form.setVisible(true);

    
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

    int dong = tblHopDong.getSelectedRow();

    if (dong == -1) {
        JOptionPane.showMessageDialog(this,
                "Vui lòng chọn hợp đồng cần xóa!");
        return;
    }

    int dongModel = tblHopDong.convertRowIndexToModel(dong);

    javax.swing.table.DefaultTableModel model =
            (javax.swing.table.DefaultTableModel) tblHopDong.getModel();

    String maHopDong = model.getValueAt(dongModel, 1).toString();

    int xacNhan = JOptionPane.showConfirmDialog(this,
            "Bạn có chắc chắn muốn xóa hợp đồng này không?",
            "Xác nhận xóa",
            JOptionPane.YES_NO_OPTION);

    if (xacNhan == JOptionPane.YES_OPTION) {
        String sql = "DELETE FROM hop_dong WHERE ma_hop_dong = ?";

        try {
            java.sql.Connection conn = KetNoiCSDL.getConnection();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, maHopDong);

            int ketQua = ps.executeUpdate();

            ps.close();
            conn.close();

            if (ketQua > 0) {
                model.removeRow(dongModel);
                JOptionPane.showMessageDialog(this,
                        "Xóa hợp đồng thành công!");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Không tìm thấy hợp đồng trong MySQL!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Lỗi xóa hợp đồng: " + e.getMessage());
        }
    }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
taiDanhSachHopDong();

javax.swing.JOptionPane.showMessageDialog(this,
        "Đã làm mới danh sách hợp đồng!");
    }//GEN-LAST:event_btnLamMoiActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new quan_ly_hop_dong().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHopDong;
    private javax.swing.JTextField txtTimHopDong;
    // End of variables declaration//GEN-END:variables
}
