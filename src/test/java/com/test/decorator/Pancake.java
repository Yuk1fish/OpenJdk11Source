package com.test.decorator;

/**
 * @description:组件对象的接口
 * @author:Xueyu
 * @date: 2022/7/2
 * @copyRight:
 */
public abstract class Pancake {

    String description = "普通煎饼";

    //描述方法
    public String getDescription(){
        return description;
    }
    //购买方法
    public abstract double cost();

}
