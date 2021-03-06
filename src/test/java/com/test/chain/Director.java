package com.test.chain;

import java.util.Random;

/**
 * @description: 部门主任处理类
 * @author:Xueyu
 * @date: 2022/7/5
 * @copyRight:
 */
public class Director extends Handler {

    public Director(String name) {
        super(name);
    }

    @Override
    public boolean process(LeaveRequest leaveRequest) {
        boolean result = (new Random().nextInt(10)) > 3; // 随机数大于3则为批准，否则不批准
        String log = "主管<%s> 审批 <%s> 的请假申请，请假天数： <%d> ，审批结果：<%s> ";
        System.out.println(String.format(log, this.name, leaveRequest.getName(), leaveRequest.getLeaveDays(), result ? "批准" : "不批准"));

        if (!result) {  // 不批准
            return false;
        } else if (leaveRequest.getLeaveDays() < 3) { // 批准且天数小于3，返回true
            return true;
        }
        return nextHandler.process(leaveRequest);   // 批准且天数大于等于3，提交给下一个处理者处理
    }
}
