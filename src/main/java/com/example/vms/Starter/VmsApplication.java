package com.example.vms.Starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,SecurityAutoConfiguration.class})
public class VmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VmsApplication.class, args);
    }

}
