Sure, here's a simple 
Java application that demonstrates how to perform JDBC operations (specifically, insertion and retrieval) on a product table:

import java.sql.*;

public class ProductJDBC {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/my_db";
    private static final String USER = "root";
    private static final String PASSWORD = "admin@123";

    // JDBC variables for opening, closing and managing connection
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        try {
            // Connect to the MySQL database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Create a statement
            statement = connection.createStatement();

            // Insert a new product into the product table
            String insertQuery = "INSERT INTO product (name, price) VALUES ('Product A', 50.00)";
            int rowsAffected = statement.executeUpdate(insertQuery);
            if (rowsAffected > 0) {
                System.out.println("Product inserted successfully!");
            }

            // Retrieve the inserted data from the product table and display it to the user
            String selectQuery = "SELECT * FROM product";
            resultSet = statement.executeQuery(selectQuery);

            // Print the retrieved data
            System.out.println("ID\tName\t\tPrice");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                System.out.println(id + "\t" + name + "\t\t" + price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection, statement, and result set
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

Before writing the code, we must have below requirements in our machine available:

1. MySQL server installed and running locally.
2. Created a database with the name `my_db`.
3. Created a table named `product` with columns `id` (INT, auto-increment), `name` (VARCHAR), and `price` (DOUBLE).

Replace `"your_database_name"`, `"your_username"`, and `"your_password"` with your actual MySQL database name, username, and password.

This code performs the following steps:
1. Connects to the MySQL database.
2. Inserts a new product into the product table.
3. Retrieves all products from the product table and displays them to the user.

Ensure you have the MySQL JDBC driver added to your project dependencies.
