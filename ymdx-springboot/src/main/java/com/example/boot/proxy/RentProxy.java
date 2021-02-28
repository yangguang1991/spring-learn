package com.example.boot.proxy;

import com.example.boot.inter.impl.Host;

/**
 * @Author: kevin yang
 * @Description: 代理模式
 * @Date: create in 2021/1/27 11:00
 */
public class RentProxy {
    Host host;

    public RentProxy(Host host) {
        this.host = host;
    }

    public void rent() {
        System.out.println("我是代理，我要租房");
        checkHouse();
        sign();
    }

    //一些公用方法可以重复使用
    public void checkHouse() {
        System.out.println("我是代理，我带你看房");
    }

    public void sign() {
        System.out.println("我是代理，我签合同");
    }

}
