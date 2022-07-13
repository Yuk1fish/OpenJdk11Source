package com.test.pipeline;

/**
 * @description: 字符串处理器
 * @author:Xueyu
 * @date: 2022/7/13
 * @copyRight:
 */
public class StringUpCaseHandle implements Handler<String, String> {

    @Override
    public String process(String input) {
        return input.toUpperCase();
    }
}
