package com.test.chain;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/5
 * @copyRight:
 */
public class MainTest {
    public static void main(String[] args) {
        Handler zhangsan = new Director("张三");
        Handler lisi = new Manager("李四");

        // 创建责任链
        zhangsan.setNextHandler(lisi);

        // 发起请假申请
        boolean result1 = zhangsan.process(new LeaveRequest("小旋锋", 1));
        System.out.println("最终结果：" + result1 + "\n");

        boolean result2 = zhangsan.process(new LeaveRequest("小旋锋", 4));
        System.out.println("最终结果：" + result2 + "\n");
    }
}
