package quanlyphongtro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiCSDL {

    private static final String URL =
            "jdbc:mysql://localhost:3306/quanlyphongtro";

    private static final String USER = "root";

    private static final String PASSWORD = "anh123456";

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(
                    URL, USER, PASSWORD
            );

            System.out.println("Ket noi MySQL thanh cong!");
            return conn;

        } catch (SQLException e) {
            System.out.println("Loi ket noi MySQL: " + e.getMessage());
            return null;
        }
    }
}
