package com.test.decorator;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/2
 * @copyRight:
 */
public abstract class Pancake {

    String description = "普通煎饼";
    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
