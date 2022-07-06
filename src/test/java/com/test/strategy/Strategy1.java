package com.test.strategy;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/6
 * @copyRight:
 */
public class Strategy1 implements Strategy {
    @Override
    public String doStrategy(String order) {
        return "执行逻辑1";
    }
}
