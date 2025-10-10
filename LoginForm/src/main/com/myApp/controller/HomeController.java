package main.com.myApp.controller;

import main.com.myApp.models.User;
import main.com.myApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController
{

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String showHomePage()
    {
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) throws SQLException {

        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String email = request.getParameter("email");
        String date = request.getParameter("date");
        String city = request.getParameter("city");

        model.addAttribute("fname" , firstName);

        User user =new User(firstName,lastName,email,getSqlDate(date),city);
        userService.saveUser(user);

        return "resultPage";
    }

    public java.sql.Date getSqlDate( String date) throws SQLException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date sqlDate = null;
        try {
           java.util.Date utilDate = format.parse(date);
           sqlDate = new java.sql.Date(utilDate.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sqlDate;

    }

}


