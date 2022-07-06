package com.test.strategy;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/6
 * @copyRight:
 */
public class MainTest {

    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext();
        strategyContext.init();
        String apply = strategyContext.checkResultDispatcher.get("2").apply("1");
        System.out.println(apply);
    }
}
