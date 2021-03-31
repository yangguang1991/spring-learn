package com.example.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/3/24 13:56
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringcloudGatewayRegistryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayRegistryServiceApplication.class, args);
    }

}
