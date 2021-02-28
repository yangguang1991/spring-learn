package com.example.boot.inter.impl;

import com.example.boot.inter.UserService;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/1/28 14:13
 */
public class UserService2Impl implements UserService {

    @Override
    public void add() {
        System.out.println("add UserService2Impl");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }
}
