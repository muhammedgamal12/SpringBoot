package com.vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseOperations {
    public static String url;
    public static String username;
    public static String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static Connection con = null;

    public static Connection connectDB()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,"");
            return con;

        }

        catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
            return null;
        }
    }

    public static Vehicles saveData(Vehicles vehicles,String sql) throws SQLException {

        preparedStatement.execute();

        return null;
    }
}
