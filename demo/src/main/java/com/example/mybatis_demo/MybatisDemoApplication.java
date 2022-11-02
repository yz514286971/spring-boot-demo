package com.example.mybatis_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MybatisDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDemoApplication.class, args);

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MybatisDemoApplication.class);
    }
}
