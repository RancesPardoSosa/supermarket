package com.proyecto.supermarketapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SupermarketApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermarketApiApplication.class, args);
    }

}
