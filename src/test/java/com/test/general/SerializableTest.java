package com.test.general;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/5/27
 * @copyRight:
 */
public class SerializableTest {

    @Test
    public void SerializableTest() throws IOException {
        FileOutputStream f = new FileOutputStream("tmp.o");
        ObjectOutput s = new ObjectOutputStream(f);
        s.writeObject("test");
        s.writeObject(new ArrayList());
        s.flush();

    }
    @Test
    public void AntiSerializableTest() throws Exception {
        FileInputStream in = new FileInputStream("tmp.o");
        ObjectInputStream s = new ObjectInputStream(in);
        String test = (String)s.readObject();
        List list = (ArrayList)s.readObject();

        System.out.println(test);
        System.out.println(list);
    }
}
