import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fullstackdb";
        String username = "root";
        String password = "root";

        Connection connection = null;
        try{
            // Step 1: Load and Register the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to MySQL Database");

            // Step 3: Create a statement
            Statement statement = connection.createStatement();

            // Step 4: Execute a query
            String query = "select version()";
            ResultSet resultSet = statement.executeQuery(query);

            // Step 5: Process the result set
            if(resultSet.next()){
                System.out.println("MySQL Version: "+ resultSet.getString(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
