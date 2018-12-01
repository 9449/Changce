package com.fourteam.changce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.fourteam.changce.dao")
public class ChangceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChangceApplication.class, args);
    }
}
