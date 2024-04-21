package ex15_javaStream.ConnectDB;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "1234";

        try (Connection connection = DatabaseUtils.getConnection(url, username, password)) {
            DatabaseOperations databaseOperations = new DatabaseOperations(connection);
            databaseOperations.getAllProductNames().forEach(System.out::println);
            System.out.println("-----------");
            databaseOperations.getNameBYCategory("a").forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
