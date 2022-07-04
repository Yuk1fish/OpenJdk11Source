package com.test.decorator;

/**
 * @description:  装饰者模式 demo
 * @author:Xueyu
 * @date: 2022/7/2
 * @copyRight:
 */
public class MainTest {

    public static void main(String[] args) {
//        //买一个普通的煎饼果子
//        Pancake battercake = new Battercake();
//        System.out.println(battercake.getDescription() + "花费："+battercake.cost() + "元");

        //买一个加双蛋的煎饼果子
//        Pancake doubleEgg = new Battercake();
//
//        doubleEgg = new Egg(doubleEgg);
//        doubleEgg = new Egg(doubleEgg);
//        System.out.println(doubleEgg.getDescription() + "花费" + doubleEgg.cost() + "元");

        //加火腿和鸡蛋
        Pancake battercakePlus = new Battercake();
        System.out.println(battercakePlus.getDescription() + "花费" + battercakePlus.cost() + "元");
        battercakePlus = new Sausage(battercakePlus);
        System.out.println(battercakePlus.getDescription() + "花费" + battercakePlus.cost() + "元");
        battercakePlus = new Egg(battercakePlus);
        System.out.println(battercakePlus.getDescription() + "花费" + battercakePlus.cost() + "元");
//        battercakePlus = new Sausage(battercakePlus);
//        System.out.println(battercakePlus.getDescription() + "花费" + battercakePlus.cost() + "元");
//        battercakePlus = new Egg(battercakePlus);
//        System.out.println(battercakePlus.getDescription() + "花费" + battercakePlus.cost() + "元");
    }
}
