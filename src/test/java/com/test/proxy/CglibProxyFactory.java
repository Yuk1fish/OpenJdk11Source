package com.test.proxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: cglibProxy
 * @author:Xueyu
 * @date: 2022/7/8
 * @copyRight:
 */
public class CglibProxyFactory implements MethodInterceptor {

    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy ...");
//        Object invoke = methodProxy.invoke(target, objects);
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib proxy end ...");
        return invoke;
    }

    public Object getProxyInstance() {
        //工具类，类似于JDK动态代理的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();

    }
}
