package com.test.chain;

/**
 * @description: 责任链 处理抽象类
 * @author:Xueyu
 * @date: 2022/7/5
 * @copyRight:
 */
public abstract class Handler {
    // 处理者姓名
    protected String name;
    // 下一个处理者
    protected Handler nextHandler;

    public Handler(String name) {
        this.name = name;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 处理请假
    public abstract boolean process(LeaveRequest leaveRequest);
}
