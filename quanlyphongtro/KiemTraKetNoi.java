package quanlyphongtro;
import java.sql.Connection;
public class KiemTraKetNoi {

    public static void main(String[] args) {

        Connection conn = KetNoiCSDL.getConnection();

        if (conn != null) {
            System.out.println("KET NOI THANH CONG!");
        } else {
            System.out.println("KET NOI THAT BAI!");
        }
    }
}
    