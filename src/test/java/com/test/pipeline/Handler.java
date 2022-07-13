package com.test.pipeline;

/**
 * @description: 处理器接口
 * @Author: Xueyu
 * @Date: 2022/7/12 20:05
 * @Description:
 */
public interface Handler<I,k> {

   public k process(I input);
}
