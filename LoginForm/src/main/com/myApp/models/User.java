package main.com.myApp.models;


import lombok.*;
import org.springframework.stereotype.Component;
import java.sql.Date;

@Component
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private String city;


}
