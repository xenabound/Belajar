package connection;

import java.sql.*;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            return new DatabaseConnection();
        } else {
            return instance;
        }
    }

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = (Connection)
             DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiswa",
                     "admin", "admin");
            System.out.println("Terkoneksi");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
