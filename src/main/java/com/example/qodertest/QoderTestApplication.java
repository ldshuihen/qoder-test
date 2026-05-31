package com.example.qodertest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.qodertest.mapper")
public class QoderTestApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(QoderTestApplication.class, args);
    }
}
