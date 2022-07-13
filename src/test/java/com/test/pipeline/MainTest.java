package com.test.pipeline;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/13
 * @copyRight:
 */
public class MainTest {

    public static void main(String[] args) {
        Integer execute = new Pipeline<>(new IntToStringHandle())
                .addHandler(new StringUpCaseHandle())
                .addHandler(new StringReverseHandle())
                .addHandler(new StringToIntHandler())
                .execute(1234567);
        System.out.println(execute);
    }
}
