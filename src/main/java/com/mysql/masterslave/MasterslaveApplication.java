package com.mysql.masterslave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mysql.masterslave.*"})
@Configuration
public class MasterslaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasterslaveApplication.class, args);
    }

}
