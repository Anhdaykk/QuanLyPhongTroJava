package quanlyphongtro;
public class them_hop_dong extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(them_hop_dong.class.getName());
    public them_hop_dong() {
        initComponents();
taiDanhSachPhong();
taiDanhSachKhach();
    }
private void taiDanhSachPhong() {
    cboPhong.removeAllItems();

    String sql = "SELECT id_phong, ma_phong FROM phong_tro";

    try {
        java.sql.Connection conn = KetNoiCSDL.getConnection();
        java.sql.PreparedStatement ps = conn.prepareStatement(sql);
        java.sql.ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            cboPhong.addItem(
                rs.getInt("id_phong") + " | " + rs.getString("ma_phong")
            );
        }

        rs.close();
        ps.close();
        conn.close();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Lỗi tải danh sách phòng: " + e.getMessage());
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
        javax.swing.JOptionPane.showMessageDialog(this,
                "Lỗi tải danh sách khách: " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        cboPhong = new javax.swing.JComboBox<>();
        cboKhach = new javax.swing.JComboBox<>();
        txtMaHopDong = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ccc = new javax.swing.JLabel();
        vvvvv = new javax.swing.JLabel();
        dddd = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNgayBatDau = new javax.swing.JTextField();
        txtNgayKetThuc = new javax.swing.JTextField();
        txtTienCoc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLuu.setText("Lưu hợp đồng");
        btnLuu.addActionListener(this::btnLuuActionPerformed);

        btnHuy.setText("Hủy");

        cboPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        txtMaHopDong.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtMaHopDong.setText("Mã hợp đồng");

        jLabel1.setText("Phòng thuê");

        jLabel2.setText("Khách thuê");

        ccc.setText("Ngày bắt đầu");

        vvvvv.setText("Ngày kết thúc");

        dddd.setText("Tiền cọc");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang hiệu lực", "Đã kết thúc", "Đã hủy" }));

        jLabel3.setText("Trạng thái");

        txtNgayBatDau.setText(" ");
        txtNgayBatDau.addActionListener(this::txtNgayBatDauActionPerformed);

        txtNgayKetThuc.setText(" ");

        txtTienCoc.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dddd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(vvvvv, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                        .addComponent(ccc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTienCoc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(txtMaHopDong))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnLuu)
                        .addGap(122, 122, 122)
                        .addComponent(btnHuy)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccc)
                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vvvvv)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dddd)
                    .addComponent(txtTienCoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnHuy))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed

    String maHopDong = txtMaHopDong.getText().trim();
    String ngayBatDau = txtNgayBatDau.getText().trim();
    String ngayKetThuc = txtNgayKetThuc.getText().trim();
    String tienCoc = txtTienCoc.getText().trim();

if (maHopDong.isEmpty() || ngayBatDau.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Vui lòng nhập mã hợp đồng và ngày bắt đầu!");
    return;
}

if (cboPhong.getSelectedItem() == null ||
        cboKhach.getSelectedItem() == null) {
    javax.swing.JOptionPane.showMessageDialog(this,
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
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ngày kết thúc phải sau ngày bắt đầu!");
            return;
        }
    }

    double coc = tienCoc.isEmpty() ? 0 : Double.parseDouble(tienCoc);

    if (coc < 0) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Tiền cọc không được âm!");
        return;
    }

    String trangThai = cboTrangThai.getSelectedItem() == null
            ? "Đang hiệu lực"
            : cboTrangThai.getSelectedItem().toString();

    String sql = "INSERT INTO hop_dong "
            + "(ma_hop_dong, id_phong, id_khach, ngay_bat_dau, "
            + "ngay_ket_thuc, tien_coc, trang_thai) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?)";

    java.sql.Connection conn = KetNoiCSDL.getConnection();
    java.sql.PreparedStatement ps = conn.prepareStatement(sql);

    ps.setString(1, maHopDong);
    ps.setInt(2, idPhong);
    ps.setInt(3, idKhach);
    ps.setDate(4, ngayBD);
    ps.setDate(5, ngayKT);
    ps.setDouble(6, coc);
    ps.setString(7, trangThai);

    ps.executeUpdate();

    ps.close();
    conn.close();

    javax.swing.JOptionPane.showMessageDialog(this,
            "Thêm hợp đồng thành công!");

    this.dispose();

} catch (IllegalArgumentException e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Ngày phải theo dạng yyyy-MM-dd hoặc tiền cọc không hợp lệ!");
} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Lỗi thêm hợp đồng: " + e.getMessage());
}

    }//GEN-LAST:event_btnLuuActionPerformed

    private void txtNgayBatDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayBatDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayBatDauActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new them_hop_dong().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cboKhach;
    private javax.swing.JComboBox<String> cboPhong;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel ccc;
    private javax.swing.JLabel dddd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txtMaHopDong;
    private javax.swing.JTextField txtNgayBatDau;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtTienCoc;
    private javax.swing.JLabel vvvvv;
    // End of variables declaration//GEN-END:variables
}
