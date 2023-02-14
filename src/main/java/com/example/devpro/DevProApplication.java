package com.example.devpro;

import com.example.devpro.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevProApplication {

    public static void main(String[] args) {

        SpringApplication.run(DevProApplication.class, args);
        SpringApplication.run(new Class<?>[] {Application.class, JpaConfig.class}, args);
    }

}
