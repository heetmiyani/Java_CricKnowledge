package database;
import java.sql.*;
public class DBUtil {
    private static Connection connection = null;

    private DBUtil() {} // Constructor

    public static Connection getConnection() throws SQLException
    {
        if (connection == null)
        {
            String username = "Chaitanya@888";
            String password = "987654321";
            String url = "jdbc:mysql://localhost:3306/cricket_questions";
            // Creating the connection
            connection = DriverManager.getConnection(url, username, password);

        }
        return connection;
    }
}
