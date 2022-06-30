package com.test.general;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;


/**
 * @description:
 * @author:Xueyu
 * @date: 2022/5/18
 * @copyRight:
 */
public class SystemTest {


    @Test
    public void PropertiesTest(){
        Properties properties = System.getProperties();
        properties.entrySet().stream().forEach(o -> System.out.println(String.format("%s ----------- > %s",o.getKey(),o.getValue())));

    }

    @Test
    public void IpTest() throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost());




    }
}
