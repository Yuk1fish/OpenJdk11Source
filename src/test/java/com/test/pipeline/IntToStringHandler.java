package com.test.pipeline;

/**
 * @description:
 * @Author: Xueyu
 * @Date: 2022/7/13 21:12
 * @Description:
 */
public class IntToStringHandler implements Handler<Integer,String> {
    @Override
    public String process(Integer input) {
        return String.valueOf(input);
    }
}
