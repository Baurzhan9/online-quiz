package online.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[]{ Application.class }, args);
        //localhost:9000
        //admin/admin
    }
}