package quanlyphongtro;
import javax.swing.JOptionPane;
public class sua_hop_dong extends javax.swing.JFrame {
private String maHopDongCu;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(sua_hop_dong.class.getName());

    public sua_hop_dong() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JOptionPane.showMessageDialog(this, "Đã mở form sửa hợp đồng!");
    jLabel2.setVisible(false);
    txtMaHopDong.setVisible(false);
    cboTrangThai.removeAllItems();
    cboTrangThai.addItem("Đang hiệu lực");
    cboTrangThai.addItem("Đã kết thúc");
    cboTrangThai.addItem("Đã hủy");

    taiDanhSachPhong();
    JOptionPane.showMessageDialog(this,
        "Số phòng trong danh sách: " + cboPhong.getItemCount());
    taiDanhSachKhach();
    }
public sua_hop_dong(String maHopDong) {
    this();
    this.maHopDongCu = maHopDong;
    taiThongTinHopDong();
}
   private void taiDanhSachPhong() {
    cboPhong.removeAllItems();

    try {
        java.sql.Connection conn = KetNoiCSDL.getConnection();

        if (conn == null) {
            JOptionPane.showMessageDialog(this, "Không kết nối được MySQL!");
            return;
        }

        String sql = "SELECT id_phong, ma_phong FROM phong_tro";

        java.sql.PreparedStatement ps = conn.prepareStatement(sql);
        java.sql.ResultSet rs = ps.executeQuery();

        int dem = 0;

        while (rs.next()) {
            String phong = rs.getInt("id_phong")
                    + " | " + rs.getString("ma_phong");

            cboPhong.addItem(phong);
            dem++;
        }

        JOptionPane.showMessageDialog(this,
                "Đã tải được " + dem + " phòng.");

        rs.close();
        ps.close();
        conn.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
                "Lỗi tải phòng: " + e.getMessage());
    }
}

private void taiDanhSachKhach() {
    cboKhach.removeAllItems();

    String sql = "SELECT id_khach, ma_khach, ho_ten FROM khach_thue";

    try {
        java.sql.Connection conn = KetNoiCSDL.getConnection();
        java.sql.PreparedStatement ps = conn.prepareStatement(sql);
        java.sql.ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            cboKhach.addItem(
                rs.getInt("id_khach") + " | "
                + rs.getString("ma_khach") + " - "
                + rs.getString("ho_ten")
            );
        }

        rs.close();
        ps.close();
        conn.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
                "Lỗi tải khách thuê: " + e.getMessage());
    }
}
private void taiThongTinHopDong() {
    String sql = "SELECT * FROM hop_dong WHERE ma_hop_dong = ?";

    try {
        java.sql.Connection conn = KetNoiCSDL.getConnection();
        java.sql.PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, maHopDongCu);

        java.sql.ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            // Hiển thị mã hợp đồng
            lblMaHopDong.setText(rs.getString("ma_hop_dong"));
            lblMaHopDong.setEditable(false);

            // Lấy ID phòng và khách
            int idPhong = rs.getInt("id_phong");
            int idKhach = rs.getInt("id_khach");

            // Chọn phòng tương ứng
            for (int i = 0; i < cboPhong.getItemCount(); i++) {
                if (cboPhong.getItemAt(i).startsWith(idPhong + " |")) {
                    cboPhong.setSelectedIndex(i);
                    break;
                }
            }

            // Chọn khách thuê tương ứng
            for (int i = 0; i < cboKhach.getItemCount(); i++) {
                if (cboKhach.getItemAt(i).startsWith(idKhach + " |")) {
                    cboKhach.setSelectedIndex(i);
                    break;
                }
            }

            // Hiển thị ngày
            txtNgayBatDau.setText(
                    rs.getDate("ngay_bat_dau").toString());

            java.sql.Date ngayKT = rs.getDate("ngay_ket_thuc");

            txtNgayKetThuc.setText(
                    ngayKT == null ? "" : ngayKT.toString());

            // Hiển thị tiền cọc
            java.math.BigDecimal tienCoc = rs.getBigDecimal("tien_coc");

            txtTienCoc.setText(
                    tienCoc == null ? "0" : tienCoc.toString());

            // Hiển thị trạng thái
            cboTrangThai.setSelectedItem(rs.getString("trang_thai"));

        } else {
            JOptionPane.showMessageDialog(this,
                    "Không tìm thấy hợp đồng!");
        }

        rs.close();
        ps.close();
        conn.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
                "Lỗi tải thông tin hợp đồng: " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMaHopDong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaHopDong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboPhong = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboKhach = new javax.swing.JComboBox<>();
        lblNgayBatDau = new javax.swing.JLabel();
        txtNgayBatDau = new javax.swing.JTextField();
        lblNgayKetThuc = new javax.swing.JLabel();
        txtNgayKetThuc = new javax.swing.JTextField();
        lblTienCoc = new javax.swing.JLabel();
        txtTienCoc = new javax.swing.JTextField();
        lblTrangThai = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã hợp đồng");

        jLabel2.setText("Phòng thuê");

        txtMaHopDong.setText(" ");

        jLabel3.setText("Phòng thuê");

        jLabel4.setText("Khách thuê");

        cboKhach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        lblNgayBatDau.setText("Ngày bắt đầu");

        txtNgayBatDau.setText(" ");

        lblNgayKetThuc.setText("Ngày kết thúc");

        txtNgayKetThuc.setText(" ");

        lblTienCoc.setText("Tiền cọc");

        txtTienCoc.setText(" ");

        lblTrangThai.setText("Trạng thái");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btnLuu.setText("Lưu thay đổi");
        btnLuu.addActionListener(this::btnLuuActionPerformed);

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(this::btnHuyActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMaHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNgayBatDau)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblTienCoc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTienCoc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblNgayKetThuc)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnLuu)
                        .addGap(57, 57, 57)
                        .addComponent(btnHuy)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMaHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cboKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayBatDau)
                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayKetThuc)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTienCoc)
                    .addComponent(txtTienCoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThai)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnHuy))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed

    String ngayBatDau = txtNgayBatDau.getText().trim();
    String ngayKetThuc = txtNgayKetThuc.getText().trim();
    String tienCoc = txtTienCoc.getText().trim();

    if (ngayBatDau.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Vui lòng nhập ngày bắt đầu!");
        return;
    }

    if (cboPhong.getSelectedItem() == null ||
            cboKhach.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this,
                "Vui lòng chọn phòng và khách thuê!");
        return;
    }

    try {
        int idPhong = Integer.parseInt(
                cboPhong.getSelectedItem().toString().split("\\|")[0].trim());

        int idKhach = Integer.parseInt(
                cboKhach.getSelectedItem().toString().split("\\|")[0].trim());

        java.sql.Date ngayBD = java.sql.Date.valueOf(ngayBatDau);
        java.sql.Date ngayKT = null;

        if (!ngayKetThuc.isEmpty()) {
            ngayKT = java.sql.Date.valueOf(ngayKetThuc);

            if (ngayKT.before(ngayBD)) {
                JOptionPane.showMessageDialog(this,
                        "Ngày kết thúc phải sau ngày bắt đầu!");
                return;
            }
        }

        double coc = tienCoc.isEmpty() ? 0 : Double.parseDouble(tienCoc);

        if (coc < 0) {
            JOptionPane.showMessageDialog(this,
                    "Tiền cọc không được âm!");
            return;
        }

        String trangThai = cboTrangThai.getSelectedItem().toString();

        String sql = "UPDATE hop_dong SET "
                + "id_phong = ?, id_khach = ?, ngay_bat_dau = ?, "
                + "ngay_ket_thuc = ?, tien_coc = ?, trang_thai = ? "
                + "WHERE ma_hop_dong = ?";

        java.sql.Connection conn = KetNoiCSDL.getConnection();
        java.sql.PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, idPhong);
        ps.setInt(2, idKhach);
        ps.setDate(3, ngayBD);
        ps.setDate(4, ngayKT);
        ps.setDouble(5, coc);
        ps.setString(6, trangThai);
        ps.setString(7, maHopDongCu);

        int ketQua = ps.executeUpdate();

        ps.close();
        conn.close();

        if (ketQua > 0) {
            JOptionPane.showMessageDialog(this,
                    "Cập nhật hợp đồng thành công!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Không tìm thấy hợp đồng cần sửa!");
        }

    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this,
                "Ngày phải theo dạng yyyy-MM-dd hoặc tiền cọc không hợp lệ!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
                "Lỗi sửa hợp đồng: " + e.getMessage());
    }

    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new sua_hop_dong().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cboKhach;
    private javax.swing.JComboBox<String> cboPhong;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField lblMaHopDong;
    private javax.swing.JLabel lblNgayBatDau;
    private javax.swing.JLabel lblNgayKetThuc;
    private javax.swing.JLabel lblTienCoc;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JTextField txtMaHopDong;
    private javax.swing.JTextField txtNgayBatDau;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtTienCoc;
    // End of variables declaration//GEN-END:variables
}
