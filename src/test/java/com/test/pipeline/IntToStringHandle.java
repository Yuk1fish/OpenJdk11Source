package com.test.pipeline;

/**
 * @description: 转换字符串处理器
 * @author:Xueyu
 * @date: 2022/7/13
 * @copyRight:
 */
public class IntToStringHandle implements Handler<Integer,String> {


    @Override
    public String process(Integer input) {
        return String.valueOf(input);
    }
}
