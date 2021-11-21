package lab5;

import java.sql.*;

public class DatabaseOutput {
    static final String DB_URL = "jdbc:sqlserver://127.0.0.1:1434;databaseName=Java_lab5_Human;integratedSecurity=true";
    public static void getTable (String nameOfTable) {
        String query = "SELECT * FROM " + nameOfTable;
        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query);
        ) {
            while(resultSet.next()){
                System.out.println("Name: "+resultSet.getString("Name"));
                System.out.println("Surname: "+resultSet.getString("Surname"));
                System.out.println("Date of birth: "+resultSet.getString("Date of birth"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

