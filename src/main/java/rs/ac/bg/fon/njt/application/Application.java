package rs.ac.bg.fon.njt.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rs.ac.bg.fon.njt.application.service.HelloService;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final HelloService helloService;

    public Application(HelloService helloService) {
        this.helloService = helloService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(helloService.sayHallo("FON"));
    }

}
