import com.app.config.Config;
import com.app.models.CarModel;
import com.app.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        CarService carService = (CarService) context.getBean("carService");
        carService.save(new CarModel("Hyundai","Tuson","2025",2500.0));
    }
}