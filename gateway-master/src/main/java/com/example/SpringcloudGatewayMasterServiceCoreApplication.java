package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/3/24 17:35
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGatewayMasterServiceCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayMasterServiceCoreApplication.class, args);
    }
}
