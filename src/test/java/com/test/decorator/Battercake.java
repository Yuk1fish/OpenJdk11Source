package com.test.decorator;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/2
 * @copyRight:
 */
public class Battercake extends Pancake {

    String description = "煎饼果子";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 8;
    }



}
