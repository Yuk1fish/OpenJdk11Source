package com.test.javaEE;

import org.junit.Test;


public class IntegerTest {


    @Test
    public void test() throws ClassNotFoundException {
//        Byte a = -123;
//
//        Long i = Byte.toUnsignedLong(a);
//        System.out.println(i);
//        Integer a = 1235767;
//        String a = "123457";
//        int b = 12155;
//        int parseInt = Integer.parseInt(a);
//        int code = Integer.hashCode(b);
//        Integer integer1 = Integer.getInteger("123");
//        System.out.println(integer1);
//        Integer integer = Integer.valueOf(b);
//        System.out.println(integer);
//        System.out.println(code);

        Integer decode = Integer.decode("10010");
        System.out.println(decode);

        int i = Integer.remainderUnsigned(10, -1);
        System.out.println(i);
        int i1 = Integer.lowestOneBit(10);
        System.out.println(i1);

        int i2 = Integer.numberOfLeadingZeros(1324651);

    }


    @Test
    public void reverseTest() {

        Integer a = 91;

        System.out.println("二进制= " + Integer.toBinaryString(a));
        System.out.println("八进制= "+ Integer.toOctalString(a));
        System.out.println("十六进制= "+ Integer.toHexString(a));
        int i = Integer.bitCount(a);
        System.out.println(i);

        int reverse = Integer.reverse(a);
        System.out.println("反转=" + reverse);
        System.out.println("反转后的二进制="+Integer.toBinaryString(reverse));
    }

    @Test
    public void reverseTest1() {
        int n = 2;
        int result = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            result <<= 1;
            result |= n & 1;
            n >>>= 1;
        }
        System.out.println(Integer.toBinaryString(n));
        System.out.println("结果="+result);
    }

}
