
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static final String URL =
        "jdbc:mysql://localhost:3306/db_inventori_vnia";

    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getKoneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                URL, USER, PASS
            );

            System.out.println("Koneksi berhasil!");
            return conn;

        } catch (Exception e) {
    e.printStackTrace();
    return null;
}
    }
}
