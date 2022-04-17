package az.et.part01.lesson05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcApp {
    public static void main(String[] args) {
        Connection conn = getConnection();

    }

    private static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/test",
                    "postgres",
                    "postgres"
            );
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
