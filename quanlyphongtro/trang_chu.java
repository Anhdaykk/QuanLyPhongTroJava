package quanlyphongtro;
public class trang_chu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(trang_chu.class.getName());

    public trang_chu() {
        initComponents();
        taiDanhSachPhong();
    }

private void taiDanhSachPhong() {

    javax.swing.table.DefaultTableModel model =
            (javax.swing.table.DefaultTableModel)
            tblDanhSachPhong.getModel();

    model.setRowCount(0);

    String sql = "SELECT id_phong, ma_phong, ten_phong, "
            + "gia_thue, dien_tich, trang_thai "
            + "FROM phong_tro ORDER BY id_phong";

    try (
        java.sql.Connection conn = KetNoiCSDL.getConnection();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        java.sql.ResultSet rs = pst.executeQuery()
    ) {

        int stt = 1;

        while (rs.next()) {

            model.addRow(new Object[]{
                stt++,
                rs.getString("ma_phong"),
                rs.getString("ten_phong"),
                rs.getBigDecimal("gia_thue"),
                rs.getBigDecimal("dien_tich"),
                rs.getString("trang_thai"),
                ""
            });
        }

    } catch (Exception e) {

        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Lỗi tải danh sách phòng: " + e.getMessage()
        );
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnQuanLyPhong = new javax.swing.JButton();
        btnQuanLyKhach = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnHopDong = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pnlDanhSachPhong = new javax.swing.JPanel();
        lblDanhSachPhong = new javax.swing.JLabel();
        txtTimKiemPhong = new javax.swing.JTextField();
        btnThemPhong = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachPhong = new javax.swing.JTable();
        btnTrangSau = new javax.swing.JButton();
        btnTrang4 = new javax.swing.JButton();
        btnTrang3 = new javax.swing.JButton();
        btnTrang2 = new javax.swing.JButton();
        btnTrangTruoc = new javax.swing.JButton();
        btnTrang1 = new javax.swing.JButton();
        lblThongTinTrang = new javax.swing.JLabel();
        btnSuaPhong = new javax.swing.JButton();
        btnXoaPhong = new javax.swing.JButton();
        btnXemChiTiet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("QUẢN LÝ PHÒNG TRỌ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Hệ thống quản lý phòng trọ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        btnQuanLyPhong.setBackground(new java.awt.Color(102, 102, 255));
        btnQuanLyPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuanLyPhong.setText("Quản lý phòng");
        btnQuanLyPhong.addActionListener(this::btnQuanLyPhongActionPerformed);

        btnQuanLyKhach.setBackground(new java.awt.Color(102, 102, 255));
        btnQuanLyKhach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuanLyKhach.setText("Quản lý khách thuê");
        btnQuanLyKhach.addActionListener(this::btnQuanLyKhachActionPerformed);

        btnThongKe.setBackground(new java.awt.Color(102, 102, 255));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThongKe.setText("Thống kê");

        btnHopDong.setBackground(new java.awt.Color(102, 102, 255));
        btnHopDong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHopDong.setText("Quản lý hợp đồng");
        btnHopDong.addActionListener(this::btnHopDongActionPerformed);

        btnHoaDon.setBackground(new java.awt.Color(102, 102, 255));
        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHoaDon.setText("Quản lý hợp đồng");
        btnHoaDon.addActionListener(this::btnHoaDonActionPerformed);

        btnDangXuat.setBackground(new java.awt.Color(102, 102, 255));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 0, 0));
        btnDangXuat.setText("Đăng xuất");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuanLyPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuanLyKhach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQuanLyPhong)
                .addGap(18, 18, 18)
                .addComponent(btnQuanLyKhach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThongKe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHopDong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDangXuat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Còn trống");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 153, 255));
        jTextField3.setText("5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Đang thuê");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 153, 255));
        jTextField2.setText("15");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tổng số phòng");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 153, 255));
        jTextField1.setText("20");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Khách thuê");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 153, 255));
        jTextField4.setText("15");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Tổng quan hệ thống");

        pnlDanhSachPhong.setBackground(new java.awt.Color(255, 255, 255));
        pnlDanhSachPhong.setToolTipText("");

        lblDanhSachPhong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDanhSachPhong.setText("DANH SÁCH PHÒNG TRỌ");

        txtTimKiemPhong.setText("Tìm kiếm phòng...");
        txtTimKiemPhong.setToolTipText("Tìm kiếm phòng");
        txtTimKiemPhong.addActionListener(this::txtTimKiemPhongActionPerformed);

        btnThemPhong.setBackground(new java.awt.Color(0, 102, 204));
        btnThemPhong.setForeground(new java.awt.Color(242, 242, 242));
        btnThemPhong.setText("+ Thêm phòng mới");
        btnThemPhong.addActionListener(this::btnThemPhongActionPerformed);

        tblDanhSachPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "P101", "Phòng 101", "2500000", "20", "Đang thuê", null},
                {"2", "P102", "Phòng 102", "2500000", "18", "Đang thuê", null},
                {"3", "P103", "Phòng 103", "2500000", "22", "Đang thuê", null},
                {"4", "P104", "Phòng 104", "1800000", "20", "Đang thuê", null},
                {"5", "P105", "Phòng 105", "2500000", "20", "Đang thuê", null},
                {"6", "P106", "Phòng 106", "2500000", "20", "Còn trống", null}
            },
            new String [] {
                "STT", "Mã phòng", "Tên phòng", "Giá thuê (VNĐ)", "Diện tích (m²)", "Trạng thái", "Thao tác"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDanhSachPhong);
        if (tblDanhSachPhong.getColumnModel().getColumnCount() > 0) {
            tblDanhSachPhong.getColumnModel().getColumn(0).setPreferredWidth(45);
            tblDanhSachPhong.getColumnModel().getColumn(1).setPreferredWidth(85);
            tblDanhSachPhong.getColumnModel().getColumn(2).setPreferredWidth(110);
            tblDanhSachPhong.getColumnModel().getColumn(3).setPreferredWidth(125);
            tblDanhSachPhong.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblDanhSachPhong.getColumnModel().getColumn(5).setPreferredWidth(110);
            tblDanhSachPhong.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        btnTrangSau.setText(">>");

        btnTrang4.setText("4");

        btnTrang3.setText("3");
        btnTrang3.addActionListener(this::btnTrang3ActionPerformed);

        btnTrang2.setText("2");

        btnTrangTruoc.setText("<<");

        btnTrang1.setText("1");

        lblThongTinTrang.setText("Hiển thị 1 đến 6 của 20 phòng");

        btnSuaPhong.setText("Sửa phòng");
        btnSuaPhong.addActionListener(this::btnSuaPhongActionPerformed);

        btnXoaPhong.setText("Xóa phòng");
        btnXoaPhong.addActionListener(this::btnXoaPhongActionPerformed);

        btnXemChiTiet.setText("Xem chi tiết");
        btnXemChiTiet.addActionListener(this::btnXemChiTietActionPerformed);

        javax.swing.GroupLayout pnlDanhSachPhongLayout = new javax.swing.GroupLayout(pnlDanhSachPhong);
        pnlDanhSachPhong.setLayout(pnlDanhSachPhongLayout);
        pnlDanhSachPhongLayout.setHorizontalGroup(
            pnlDanhSachPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachPhongLayout.createSequentialGroup()
                        .addComponent(lblThongTinTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrangTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrang1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrang2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrang3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrang4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrangSau, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachPhongLayout.createSequentialGroup()
                        .addGroup(pnlDanhSachPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDanhSachPhongLayout.createSequentialGroup()
                                .addComponent(txtTimKiemPhong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThemPhong))
                            .addGroup(pnlDanhSachPhongLayout.createSequentialGroup()
                                .addComponent(lblDanhSachPhong)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDanhSachPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXemChiTiet)
                            .addComponent(btnSuaPhong))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaPhong)
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        pnlDanhSachPhongLayout.setVerticalGroup(
            pnlDanhSachPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachPhongLayout.createSequentialGroup()
                .addGroup(pnlDanhSachPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDanhSachPhongLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDanhSachPhong))
                    .addComponent(btnXemChiTiet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDanhSachPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaPhong)
                    .addComponent(btnXoaPhong))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDanhSachPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrangSau)
                    .addComponent(btnTrang4)
                    .addComponent(btnTrang3)
                    .addComponent(btnTrang2)
                    .addComponent(btnTrangTruoc)
                    .addComponent(btnTrang1)
                    .addComponent(lblThongTinTrang))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pnlDanhSachPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(106, 106, 106))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(pnlDanhSachPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrang3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrang3ActionPerformed

    private void btnThemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPhongActionPerformed
them_phong form = new them_phong(
    (javax.swing.table.DefaultTableModel)
    tblDanhSachPhong.getModel()
);

form.setLocationRelativeTo(this);
form.setVisible(true);        
    }//GEN-LAST:event_btnThemPhongActionPerformed

    private void txtTimKiemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemPhongActionPerformed
String tuKhoa = txtTimKiemPhong.getText().trim();

javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter =
        new javax.swing.table.TableRowSorter<>(
                (javax.swing.table.DefaultTableModel) tblDanhSachPhong.getModel());

tblDanhSachPhong.setRowSorter(sorter);

if (tuKhoa.isEmpty() || tuKhoa.equals("Tìm kiếm phòng...")) {
    sorter.setRowFilter(null);
} else {
    sorter.setRowFilter(
            javax.swing.RowFilter.regexFilter(
                    "(?i)" + java.util.regex.Pattern.quote(tuKhoa), 1, 2));
}

    }//GEN-LAST:event_txtTimKiemPhongActionPerformed

    private void btnSuaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPhongActionPerformed
int dong = tblDanhSachPhong.getSelectedRow();

if (dong == -1) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Vui lòng chọn phòng cần sửa!");
    return;
}

int dongModel = tblDanhSachPhong.convertRowIndexToModel(dong);

javax.swing.table.DefaultTableModel model =
        (javax.swing.table.DefaultTableModel)
        tblDanhSachPhong.getModel();

sua_phong form = new sua_phong(model, dongModel);

form.setLocationRelativeTo(this);
form.setVisible(true);
    }//GEN-LAST:event_btnSuaPhongActionPerformed

    private void btnXoaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhongActionPerformed

int dong = tblDanhSachPhong.getSelectedRow();

if (dong == -1) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Vui lòng chọn phòng cần xóa!");
    return;
}

int xacNhan = javax.swing.JOptionPane.showConfirmDialog(this,
        "Bạn có chắc chắn muốn xóa phòng này không?",
        "Xác nhận xóa",
        javax.swing.JOptionPane.YES_NO_OPTION);

if (xacNhan != javax.swing.JOptionPane.YES_OPTION) {
    return;
}

int dongModel = tblDanhSachPhong.convertRowIndexToModel(dong);

javax.swing.table.DefaultTableModel model =
        (javax.swing.table.DefaultTableModel) tblDanhSachPhong.getModel();

String maPhong = model.getValueAt(dongModel, 1).toString();

try {
    String sql = "DELETE FROM phong_tro WHERE ma_phong = ?";

    java.sql.Connection conn = KetNoiCSDL.getConnection();
    java.sql.PreparedStatement ps = conn.prepareStatement(sql);

    ps.setString(1, maPhong);

    int ketQua = ps.executeUpdate();

    if (ketQua > 0) {
        model.removeRow(dongModel);

        javax.swing.JOptionPane.showMessageDialog(this,
                "Xóa phòng thành công!");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Không tìm thấy phòng trong cơ sở dữ liệu!");
    }

    ps.close();
    conn.close();

} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Lỗi khi xóa phòng: " + e.getMessage());
}

    }//GEN-LAST:event_btnXoaPhongActionPerformed

    private void btnXemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietActionPerformed
int dong = tblDanhSachPhong.getSelectedRow();

if (dong == -1) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Vui lòng chọn phòng cần xem!");
    return;
}

int dongModel = tblDanhSachPhong.convertRowIndexToModel(dong);

javax.swing.table.DefaultTableModel model =
        (javax.swing.table.DefaultTableModel) tblDanhSachPhong.getModel();

String maPhong = model.getValueAt(dongModel, 1).toString();
String tenPhong = model.getValueAt(dongModel, 2).toString();
String giaThue = model.getValueAt(dongModel, 3).toString();
String dienTich = model.getValueAt(dongModel, 4).toString();
String trangThai = model.getValueAt(dongModel, 5).toString();

javax.swing.JOptionPane.showMessageDialog(this,
        "MÃ PHÒNG: " + maPhong
        + "\nTÊN PHÒNG: " + tenPhong
        + "\nGIÁ THUÊ: " + giaThue
        + "\nDIỆN TÍCH: " + dienTich
        + "\nTRẠNG THÁI: " + trangThai,
        "CHI TIẾT PHÒNG",
        javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnXemChiTietActionPerformed

    private void btnQuanLyPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyPhongActionPerformed
taiDanhSachPhong();

javax.swing.JOptionPane.showMessageDialog(this,
        "Đã cập nhật danh sách phòng!");
    }//GEN-LAST:event_btnQuanLyPhongActionPerformed

    private void btnQuanLyKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyKhachActionPerformed
quan_ly_khach_thue form = new quan_ly_khach_thue();
form.setLocationRelativeTo(this);
form.setVisible(true);
    }//GEN-LAST:event_btnQuanLyKhachActionPerformed

    private void btnHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHopDongActionPerformed
quan_ly_hop_dong form = new quan_ly_hop_dong();
form.setLocationRelativeTo(this);
form.setVisible(true);
    }//GEN-LAST:event_btnHopDongActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
quan_ly_hop_dong form = new quan_ly_hop_dong();
form.setLocationRelativeTo(this);
form.setVisible(true);
    }//GEN-LAST:event_btnHoaDonActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new trang_chu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnHopDong;
    private javax.swing.JButton btnQuanLyKhach;
    private javax.swing.JButton btnQuanLyPhong;
    private javax.swing.JButton btnSuaPhong;
    private javax.swing.JButton btnThemPhong;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTrang1;
    private javax.swing.JButton btnTrang2;
    private javax.swing.JButton btnTrang3;
    private javax.swing.JButton btnTrang4;
    private javax.swing.JButton btnTrangSau;
    private javax.swing.JButton btnTrangTruoc;
    private javax.swing.JButton btnXemChiTiet;
    private javax.swing.JButton btnXoaPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblDanhSachPhong;
    private javax.swing.JLabel lblThongTinTrang;
    private javax.swing.JPanel pnlDanhSachPhong;
    private javax.swing.JTable tblDanhSachPhong;
    private javax.swing.JTextField txtTimKiemPhong;
    // End of variables declaration//GEN-END:variables


    }

