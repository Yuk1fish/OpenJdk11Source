package com.test.proxy;

/**
 * @description:
 * @Author: Xueyu
 * @Date: 2022/7/9 18:08
 * @Description:
 */
public class FastaClassTest {
    public static void main(String[] args) {
        Test tt = new Test();
        Test2 fc = new Test2();
        int index = fc.getIndex("f()V");
        fc.invoke(index, tt, null);
    }

    static class Test {
        public void f() {
            System.out.println("f method");
        }

        public void g() {
            System.out.println("g method");
        }
    }

    static class Test2 {
        public Object invoke(int index, Object o, Object[] ol) {
            Test t = (Test) o;
            switch (index) {
                case 1:
                    t.f();
                    return null;
                case 2:
                    t.g();
                    return null;
            }
            return null;
        }

        public int getIndex(String signature) {
            switch (signature.hashCode()) {
                case 3078479:
                    return 1;
                case 3108270:
                    return 2;
            }
            return -1;
        }
    }
}

