package com.test.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/6
 * @copyRight:
 */
public class StrategyContext {

    public Map<String, Function<String, String>> checkResultDispatcher = new HashMap<>();

    public void init(){
        checkResultDispatcher.put("1",order -> new Strategy1().doStrategy(order));
        checkResultDispatcher.put("2",order -> new Strategy2().doStrategy(order));
    }
}
