package main.com.myApp.dao;


import main.com.myApp.config.DatabaseConfig;
import main.com.myApp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;

@Component
public class UserDAO {

    DatabaseConfig databaseConfig ;

    @Autowired
    public UserDAO(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }


    public void save(User user) throws SQLException {
        String sql = "INSERT INTO user  VALUES (?,?,?,?,?)";
        PreparedStatement p = databaseConfig.connectDB().prepareStatement(sql);

        p.setString(1, user.getFirstName());
        p.setString(2, user.getLastName());
        p.setString(3, user.getEmail());
        p.setDate(4, user.getDateOfBirth());
        p.setString(5, user.getCity());
        p.executeUpdate();

        p.close();

    }
}
