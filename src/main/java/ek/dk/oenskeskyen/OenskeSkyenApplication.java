package ek.dk.oenskeskyen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OenskeSkyenApplication {

    public static void main(String[] args) {
        SpringApplication.run(OenskeSkyenApplication.class, args);
    }

}