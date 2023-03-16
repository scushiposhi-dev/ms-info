package com.example.msinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsInfoApplication.class, args);
    }

}
