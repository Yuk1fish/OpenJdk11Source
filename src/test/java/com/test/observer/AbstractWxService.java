package com.test.observer;

import java.util.Vector;

/**
 * @description: 微信服务端   被观察者对象
 * @author:Xueyu
 * @date: 2022/7/7
 * @copyRight:
 */
public abstract class AbstractWxService {

    private static Vector<Observer> observers = new Vector<>();


    public String addObServer(Observer observer) {
        return observers.add(observer) ? "添加成功" : null;
    }

    public String rmObServer(Observer observer) {
        return observers.remove(observer) ? "删除成功" : null;
    }

    protected Vector<Observer> getObServers() {
        return observers;
    }


    public abstract void notifyMsg(String msg);
}
