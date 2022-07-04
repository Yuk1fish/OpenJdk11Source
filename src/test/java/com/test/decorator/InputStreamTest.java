package com.test.decorator;

import java.io.FileInputStream;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/4
 * @copyRight:
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {
            InputStreamDecorator decorator = new InputStreamDecorator(new FileInputStream("G:\\Project\\OpenJdk11Source\\src\\main\\resources\\static\\Test.txt"));
            int logging = decorator.read();
            System.out.println(logging);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
