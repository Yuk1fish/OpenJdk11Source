package com.test.pipeline;

/**
 * @description: 字符串反转处理器
 * @author:Xueyu
 * @date: 2022/7/13
 * @copyRight:
 */
public class StringReverseHandle implements Handler<String, String> {

    @Override
    public String process(String input) {
        return String.valueOf(new StringBuilder(input).reverse());
    }
}
