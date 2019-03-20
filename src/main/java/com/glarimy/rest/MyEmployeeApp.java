package com.glarimy.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@EnableEurekaClient
@SpringBootApplication
@EnableMongoRepositories
//@EnableDiscoveryClient
public class MyEmployeeApp {
    public static void main(String[] args) {
        SpringApplication.run(MyEmployeeApp.class, args);
    }
}