package com.lombardinternational.classtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.lombardinternational.classtest.springdata"})
public class CLASSTestApplication {


    public static void main(String[] args) {

        SpringApplication.run(CLASSTestApplication.class, args);

    }

}
