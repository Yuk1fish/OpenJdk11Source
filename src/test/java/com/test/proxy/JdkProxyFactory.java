package com.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 原生jdk动态代理
 * @author:Xueyu
 * @date: 2022/7/8
 * @copyRight:
 */
public class JdkProxyFactory {

    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("bilibili.com");
        bannedSites.add("youtube.com");
        bannedSites.add("weibo.com");
        bannedSites.add("qq.com");
    }

    private Internet target;

    public JdkProxyFactory(Internet internet) {
        this.target = internet;
    }


    public Internet getProxyInvoke() {
        /**
         被代理对象target通过参数传递进来，
         通过target.getClass().getClassLoader()获取ClassLoader对象，
         然后通过target.getClass().getInterfaces()获取它实现的所有接口，
         再将target包装到实现了InvocationHandler接口的对象中。
         通过newProxyInstance函数我们就获得了一个动态代理对象。
         */
        return (Internet) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (bannedSites.contains(args[0].toString().toLowerCase())) {
                    throw new Exception("Access Denied:" + args[0]);
                }
                //反射机制调用目标对象的方法
                return method.invoke(target, args);
            }
        });
    }
}
