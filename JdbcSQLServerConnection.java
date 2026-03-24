import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSQLServerConnection {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:sqlserver://localhost:1433;databaseName=YourDatabase;encrypt=true;trustServerCertificate=true";
        String user = "Rohit Mahale";
        String password = "";

        // Try to establish the connection
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Connected to SQL Server successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
