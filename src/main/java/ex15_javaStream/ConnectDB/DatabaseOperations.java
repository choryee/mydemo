package ex15_javaStream.ConnectDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class DatabaseOperations {
    private Connection connection;

    public DatabaseOperations(Connection connection) {
        this.connection = connection;
    }

    public Stream<String> getAllProductNames() throws SQLException {
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT title FROM tbl_board")) {

            List<String> productNames = new ArrayList<>();
            while (resultSet.next()) {
                productNames.add(resultSet.getString("title"));
            }
            return productNames.stream();
        }
    }

    public Stream<String> getNameBYCategory(String category) throws SQLException{
        return getAllProductNames()
                .filter(title->title.contains(category));
    }
}
