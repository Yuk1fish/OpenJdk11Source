package com.test.decorator;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/2
 * @copyRight:
 */
public class Egg extends CondimentDecorator {
    public Egg(Pancake pancake){
        super(pancake);
    }

    @Override
    public String getDescription() {
        return pancake.getDescription() + "加鸡蛋";
    }

    @Override
    public double cost() {
        System.out.println("2");
        return pancake.cost() + 1;
    }
}
