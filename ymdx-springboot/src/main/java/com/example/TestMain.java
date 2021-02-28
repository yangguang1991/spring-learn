package com.example;

import com.example.boot.bean.Car;
import com.example.boot.config.Config;
import com.example.boot.inter.impl.Host;
import com.example.boot.proxy.RentProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/1/25 15:42
 */
public class TestMain {
    public void testConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        //Car car = (Car) context.getBean(Car.class);
        Car car = (Car) context.getBean("car");//自动注入生成的名字
        System.out.println(car.getName());
    }

    public static void main(String[] args) {
        TestMain tm = new TestMain();
        tm.testConfig();
        Host host = new Host();
        RentProxy rentProxy = new RentProxy(host);
        rentProxy.rent();
    }
}
