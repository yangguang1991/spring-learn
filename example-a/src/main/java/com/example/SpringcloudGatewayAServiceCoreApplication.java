package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/3/24 17:17
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGatewayAServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayAServiceCoreApplication.class, args);
    }

}