package com.test.decorator;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/2
 * @copyRight:
 */
public class Battercake extends Pancake {

    String description = "煎饼果子";


    public Battercake() {
        this.description = description;
    }

    @Override
    public double cost() {
        System.out.println("1");
        return 8;
    }



}
