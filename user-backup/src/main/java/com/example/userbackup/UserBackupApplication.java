package com.example.userbackup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserBackupApplication.class, args);
    }

}
