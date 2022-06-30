package com.test.general;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/5/19
 * @copyRight:
 */
public class doubleTest {


    @Test
    public void test(){
        String a = "114456";

        String b = "1416";

//        Integer value = Integer.valueOf(a);
//
//        BigDecimal bigDecimal = new BigDecimal(value);
//        BigDecimal bigDecimal1 = bigDecimal.movePointLeft(2);
//
//        BigDecimal bigDecimal2 = new BigDecimal(Integer.parseInt(b)).movePointLeft(2);
//
//        System.out.println(bigDecimal1);
//        System.out.println(bigDecimal2);
        BigDecimal bigDecimal = new BigDecimal(a).movePointLeft(2);
        BigDecimal bigDecimal1 = new BigDecimal(b).movePointLeft(2);
        BigDecimal add = bigDecimal.add(bigDecimal1);

        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);
        System.out.println(add);
//        System.out.println(bigDecimal1.add(bigDecimal2).to);

//        System.out.println(String.format("%.2f", aDouble));


    }

}



