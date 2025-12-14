package gm.ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VentaLibrosApplication {

    public static void main(String[] args) {
        SpringApplication.run(VentaLibrosApplication.class, args);
    }

}
