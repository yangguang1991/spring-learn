package com.example.boot.proxy;

import com.example.boot.inter.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: kevin yang
 * @Description:
 * @Date: create in 2021/1/28 21:52
 */
public class JdkProxy implements InvocationHandler {

    private UserService target;

    // 反射获取，实现接口的话可以使用这个来获取
    public UserService getInstance(UserService target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (UserService) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    //利用反射来调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("结束");
    }

    private void before() {
        System.out.println("开始");
    }
}
