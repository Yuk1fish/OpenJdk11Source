package com.test.observer;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/7
 * @copyRight:
 */
public class User2 implements Observer{

    @Override
    public void receive(String msg) {
        System.out.println("user2收到消息:" + msg);
    }
}
