package main.com.myApp.service;

import lombok.AllArgsConstructor;
import main.com.myApp.dao.UserDAO;
import main.com.myApp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class UserService {

    @Autowired
    UserDAO userDAO;
   public void saveUser(User user) throws SQLException {
       userDAO.save(user);
   }

}
