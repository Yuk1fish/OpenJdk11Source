package com.test.pipeline;

/**
 * @description: 字符串转Int
 * @author:Xueyu
 * @date: 2022/7/13
 * @copyRight:
 */
public class StringToIntHandler implements Handler<String,Integer> {
    @Override
    public Integer process(String input) {
        return Integer.parseInt(input);
    }
}
