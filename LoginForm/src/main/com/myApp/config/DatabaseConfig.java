package main.com.myApp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
@Scope("singleton")
public class DatabaseConfig
{

    @Value("${database.url}")
    private   String url;
    @Value("${database.username}")
    private String username;
    @Value("${database.password}")
    private   String password;
    static Connection con = null;

    DatabaseConfig databaseConfig = null;

    private DatabaseConfig() {
    }

   public  DatabaseConfig getObject(){
        if (databaseConfig == null)
            databaseConfig = new DatabaseConfig();
        return  databaseConfig;
   }

    @PostConstruct
    public  Connection connectDB() throws SQLException {
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
    @PreDestroy
    public static void closeConnection(){
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
