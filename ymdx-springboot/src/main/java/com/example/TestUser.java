package com.example;

import com.example.boot.inter.UserService;
import com.example.boot.inter.impl.RealSubjectCglib;
import com.example.boot.inter.impl.UserService2Impl;
import com.example.boot.proxy.CglibProxy;
import com.example.boot.proxy.UserProxy;

/**
 * @Author: kevin yang
 * @Description: 代理模式，面向接口编程，解耦
 * @Date: create in 2021/1/28 14:08
 */
public class TestUser {
    public static void main(String[] args) throws Throwable {
        UserService userService = new UserService2Impl();
        //------------------
        UserProxy userProxy = new UserProxy();
        userProxy.setUserService(userService);
        userProxy.add();
        //------------------
        UserService userService1 = new UserService2Impl();
        CglibProxy cglibProxy = new CglibProxy();
        UserService userService2 = (UserService) cglibProxy.getInstance(userService1);

        CglibProxy proxy = new CglibProxy();
        RealSubjectCglib cglib = (RealSubjectCglib)proxy.getInstance(new RealSubjectCglib());
        cglib.operate("123");

//      BuyHouseImpl buyHouseCglibProxy = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
//      buyHouseCglibProxy.buyHosue();
    }
}
