import java.sql.*;
import java.util.Scanner;

public class ProductCRUD {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/fullstackdb";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        Scanner scanner = new Scanner(System.in);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connected to the MySQL Database");

//            addProduct(connection, scanner);
//            deleteProduct(connection, scanner);
            updateProduct(connection, scanner);
            viewProducts(connection);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(connection !=null){
                    connection.close();
                    System.out.println("Connection closed");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void updateProduct(Connection connection, Scanner scanner) {
        System.out.println("Enter product title: ");
        String title = scanner.nextLine();
        System.out.println("Enter product category: ");
        String category = scanner.nextLine();
        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter the product id to update: ");
        int id = scanner.nextInt();
        PreparedStatement preparedStatement = null;
        String query = "update products set title=?, category=?, price=? where id=?";
        try{
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, category);
            preparedStatement.setDouble(3, price);
            preparedStatement.setInt(4, id);
            int rowsUpdated = preparedStatement.executeUpdate();
            System.out.println(rowsUpdated + " product updated");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void deleteProduct(Connection connection, Scanner scanner) {
        System.out.println("Enter the product id to delete: ");
        int id = scanner.nextInt();
        PreparedStatement preparedStatement = null;
        String query = "delete from products where id=?";
        try{
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            int rowsDeleted = preparedStatement.executeUpdate();
            System.out.println(rowsDeleted + " product deleted");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void viewProducts(Connection connection) {
        String query = "select * from products";
        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+"\t"+resultSet.getString("title")+"\t"+ resultSet.getString("category")+"\t"+resultSet.getString("price"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void addProduct(Connection connection, Scanner scanner) {
        System.out.println("Enter product title: ");
        String title = scanner.nextLine();
        System.out.println("Enter product category: ");
        String category = scanner.nextLine();
        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();
        PreparedStatement preparedStatement = null;
        String query = "insert into products (title, category, price) values(?,?,?)";
        try{
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, category);
            preparedStatement.setDouble(3, price);
            int rowsInserted = preparedStatement.executeUpdate();
            System.out.println(rowsInserted + " product inserted");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
