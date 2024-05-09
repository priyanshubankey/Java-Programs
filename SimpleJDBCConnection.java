import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleJDBCConnection {

    public static void main(String[] args) {

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "password");

            // Create statement
            Statement statement = connection.createStatement();

            // Execute query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            // Iterate through the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

            // Clean up resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}