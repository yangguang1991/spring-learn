package com.example.boot.config;

import com.example.boot.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/1/25 15:31
 */
@Configuration
@ComponentScan("com.example.boot.bean")
public class Config {
    public Config() {
        System.out.println("TestConfig容器初始化...");
    }

//    @Bean(name = "car")
//    public Car getCar() {
//        Car c = new Car();
//        c.setName("duankun");
//        return c;
//    }
}
