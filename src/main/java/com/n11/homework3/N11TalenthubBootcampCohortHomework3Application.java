package com.n11.homework3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class N11TalenthubBootcampCohortHomework3Application {

    public static void main(String[] args) {
        SpringApplication.run(N11TalenthubBootcampCohortHomework3Application.class, args);
    }

}
