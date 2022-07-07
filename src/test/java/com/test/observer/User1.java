package com.test.observer;

/**
 * @description: 具体观察者
 * @author:Xueyu
 * @date: 2022/7/7
 * @copyRight:
 */
public class User1 implements Observer {

    @Override
    public void receive(String msg) {
        System.out.println("user1收到消息:" + msg);
    }
}
