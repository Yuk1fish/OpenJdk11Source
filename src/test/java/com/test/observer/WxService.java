package com.test.observer;

import java.util.Vector;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/7
 * @copyRight:
 */
public class WxService extends AbstractWxService {

    @Override
    public void notifyMsg(String msg) {
        Vector<Observer> obServers = getObServers();
        for (Observer obServer : obServers) {
            obServer.receive(msg);
        }
    }
}
