package com.test.javaEE;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/5/27
 * @copyRight:
 */
public class IoTest {

    @Test
    public void InputStreamTest() throws IOException {
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("G:\\Project\\OpenJdk11Source\\src\\main\\resources\\static\\Test.txt"));
            byte[] bytes = bufferedInputStream.readAllBytes();
        } finally {
            bufferedInputStream.close();
        }
    }
}
