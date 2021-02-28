package com.example.boot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/1/25 15:31
 */
@Component
public class Car {

    @Value("duankun")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
