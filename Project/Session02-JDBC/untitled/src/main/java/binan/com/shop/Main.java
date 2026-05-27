package binan.com.shop;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws SQLException {
        Connection conn = null;
        try {

            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=HSF302_SE1910;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "12345";
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, user, pass);
            //System.out.println("Connect to DB successfully");
            //CONNECTION OK, SELECT bằng câu sql (truyền thống )
            String sql = "select * from Fruit";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(); // chạy thật, hứng kết quả trả về
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String desc = rs.getString("description");
                double price = rs.getDouble("price");
                System.out.println(id + "|" + name + "|" + desc + "|" + price);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
