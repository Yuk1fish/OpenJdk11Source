package com.test.observer;

/**
 * @description: 观察者接口 订阅消息需要实现这个接口
 * @author:Xueyu
 * @date: 2022/7/7
 * @copyRight:
 */
public interface Observer {

    public void receive(String msg);
}
