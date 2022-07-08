package com.test.proxy;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/8
 * @copyRight:
 */
public class MainTest {

    public static void main(String[] args) {

//        Internet proxyInvoke = new JdkProxyFactory(new RealInternet()).getProxyInvoke();
//        proxyInvoke.connectTo("www.baidu.com");
//        proxyInvoke.connectTo("weibo.com");

        RealInternet proxyInstance = (RealInternet) new CglibProxyFactory(new RealInternet()).getProxyInstance();
        proxyInstance.connectTo("www.baidu.com");
    }
}
