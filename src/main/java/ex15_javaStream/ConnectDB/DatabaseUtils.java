package ex15_javaStream.ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {

    public static Connection getConnection(String url, String username, String
                                           password) throws SQLException{
        return DriverManager.getConnection(url, username, password);
    }
}
