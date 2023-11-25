package dbSample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseManager {
    // データベース接続と結果取得のための変数
    private static Connection con;


    public static Connection getConnection() throws SQLException, ClassNotFoundException {
     // 1. ドライバのクラスをJava上で読み込む
        Class.forName("com.mysql.jdbc.Driver");
     // 2. DBと接続する
        con = DriverManager.getConnection(
            "jdbc:mysql://localhost/world?useSSL=false",
            "root",
            "rootroot"
            );
        return con;
    }

    public static void close() {
     // 7. 接続を閉じる
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
    }

}
