package com.test.observer;

import java.time.LocalDateTime;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/7
 * @copyRight:
 */
public class MainTest {
    public static void main(String[] args) {

        WxService wxService = new WxService();
        wxService.addObServer(new User1());
        wxService.addObServer(new User2());
        wxService.notifyMsg("13：00局部阴转阵雨");
    }
}
