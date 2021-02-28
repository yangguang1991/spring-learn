package com.example.boot.proxy;

import com.example.boot.inter.UserService;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/1/28 14:10
 */
public class UserProxy implements UserService {

    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
    }

    @Override
    public void delete() {
        userService.delete();
    }

    @Override
    public void update() {
        userService.update();
    }
}
