package com.test.pipeline;

/**
 * @description: 处理器
 * @author:Xueyu
 * @date: 2022/7/13
 * @copyRight:
 */
public interface Handler<I, O> {

    O process(I input);

}
