package com.test.decorator;

/**
 * @description:装饰器接口
 * @author:Xueyu
 * @date: 2022/7/2
 * @copyRight:
 */
public abstract class CondimentDecorator extends Pancake {

    // 持有组件对象
    protected Pancake pancake;

    public CondimentDecorator(Pancake pancake){
        this.pancake = pancake;
    }

    public abstract String getDescription();

}
