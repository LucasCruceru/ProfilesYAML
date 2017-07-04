package ro.fortech;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.fortech.config.ServerProperties;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ServerProperties properties;

    @Override
    public void run(String... args) throws Exception{
        System.out.println(properties);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
