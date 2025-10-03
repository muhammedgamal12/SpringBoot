import com.app.config.Config;
import com.app.models.CarModel;
import com.app.models.Vehicles;
import com.app.service.ModelsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ModelsService service = (ModelsService) context.getBean("modelsService");
        Vehicles vehicles =new CarModel("Hyundai","Tuson","2024",5402154.0,"110 km/h");

    }
}