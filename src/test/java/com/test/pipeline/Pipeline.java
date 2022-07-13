package com.test.pipeline;

/**
 * @description: 管道
 * @author:Xueyu
 * @date: 2022/7/13
 * @copyRight:
 */
public class Pipeline<I, O> {

    private final Handler<I, O> currentHandler;

    Pipeline(Handler<I, O> currentHandler) {
        this.currentHandler = currentHandler;
    }

    O execute(I input) {
        return currentHandler.process(input);
    }

    <M> Pipeline<I, M> addHandler(Handler<O, M> newHandler) {
        return new Pipeline<>(input -> newHandler.process(currentHandler.process(input)));
    }


}
