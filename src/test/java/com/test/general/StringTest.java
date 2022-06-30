package com.test.general;


import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/5/7
 * @copyRight:
 */
public class StringTest {


   @Test
    public void toUpperCase() {
        String str="hello,jack!";
        String upperCase = str.toUpperCase();
        Assert.assertTrue("HELLO,JACK!".equals(upperCase));
        System.out.println(upperCase);
//        ArrayList<Object> objects = new ArrayList<>();
    }


    @Test
    public void test(){
       String a =  "hello world";
        System.out.println(a.length());
       String zhStr = "阿萨大";
        System.out.println(zhStr.length());
        System.out.println(zhStr.charAt(1));
        char[] characters = new char[]{'a','b','c'};
        String s = new String(characters);

        int i = s.codePointAt(2);
        System.out.println(s);
        System.out.println(i);

        System.out.println("比较字符串");
        String compareStr1 = "123";

        String compareStr2 = "456";

        int i1 = compareStr1.compareTo(compareStr2);
        System.out.println(i1);
        System.out.println("比较字符串特定区域是否相等");
        boolean b = compareStr1.regionMatches(1, compareStr2, 1, 2);
        System.out.println(b);
        System.out.println("查找对应索引");
        int i2 = compareStr1.indexOf("3");
        System.out.println(i2);
    }
}
