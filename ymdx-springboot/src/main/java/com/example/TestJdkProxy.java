package com.example;

import com.example.boot.inter.UserService;
import com.example.boot.inter.impl.UserService2Impl;
import com.example.boot.inter.impl.UserServiceImpl;
import com.example.boot.proxy.JdkProxy;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/1/28 21:54
 */
public class TestJdkProxy {

    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();
        UserService u1 = jdkProxy.getInstance(new UserServiceImpl());
        u1.add();
        UserService u2 = jdkProxy.getInstance(new UserService2Impl());
        u2.add();
    }
}
