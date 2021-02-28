package com.example.boot.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: kevin yang
 * @Description:
 *  这个是spring的代理，没有接口的话可以使用这个代理类
 *  当Bean有实现接口时，Spring就会用JDK动态代理。
 *  当Bean没有实现接口时，Spring会选择CGLib代理
 *
 * @Date: create in 2021/1/28 14:54
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target)
    {
        this.target = target;
        //Cglib中的加强器，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        //设置要创建动态代理的类
        enhancer.setSuperclass(this.target.getClass());
        //设置回调，这里相当于是对于代理类上所有方法的调用，都会调用Callback，而Callback则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);
        Object obj = enhancer.create();
        return obj;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable
    {
        System.out.println("I'm Proxy, I'm invoking...");
        Object object = proxy.invoke(obj, args);
        System.out.println(object);
        return object;
    }
}
