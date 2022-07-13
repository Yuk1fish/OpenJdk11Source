package com.test.pipeline;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/13
 * @copyRight:
 */
public class MainTest {

    public static void main(String[] args) {


        Integer execute = new Pipeline<>(new IntToStringHandler())
                .addHandler(new StringUpCaseHandle())
                .addHandler(new StringReverseHandle())
                .addHandler(new StringToIntHandler())
                .execute(123123123);
        System.out.println(execute);
    }
}
