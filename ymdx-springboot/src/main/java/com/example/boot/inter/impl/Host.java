package com.example.boot.inter.impl;

import com.example.boot.inter.Rent;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/1/27 10:58
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("我是房东，我要租房");
    }
}
