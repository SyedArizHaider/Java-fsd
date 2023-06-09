package oes.db;


import java.sql.*;

public class Provider {
    public static Connection getMySQLConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Admin";
            String username = "root";
            String password = "root1";

            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
