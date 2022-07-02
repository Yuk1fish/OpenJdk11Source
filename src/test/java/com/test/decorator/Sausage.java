package com.test.decorator;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/2
 * @copyRight:
 */
public class Sausage extends CondimentDecorator {
    public Sausage(Pancake pancake){
        super(pancake);
    }
    @Override
    public String getDescription() {
        return pancake.getDescription() + "加火腿";
    }

    @Override
    public double cost() {
        System.out.println("3");
        return pancake.cost() + 2;
    }
}
