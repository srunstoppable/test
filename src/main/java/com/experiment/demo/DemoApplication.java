package com.experiment.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/*
 Spring boot 启动类，内置tomcat
 */


@SpringBootApplication
@ServletComponentScan(basePackages = {"com.experiment.filter","com.experiment.shiro"})
@MapperScan("com.experiment.mapper")
@ComponentScan(basePackages = {"com.experiment.Utils","com.experiment.controller","com.experiment.service","com.experiment.shiro","com.experiment.exception"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
