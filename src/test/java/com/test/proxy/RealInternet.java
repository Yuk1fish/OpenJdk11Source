package com.test.proxy;

/**
 * @description: 目标类接口实现类
 * @author:Xueyu
 * @date: 2022/7/8
 * @copyRight:
 */
public class RealInternet implements Internet{

    @Override
    public void connectTo(String host) {
        System.out.println("访问网站"+host);
    }
}
