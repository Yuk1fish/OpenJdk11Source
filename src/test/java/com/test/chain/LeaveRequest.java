package com.test.chain;

/**
 * @description: 责任链  请假请求
 * @author:Xueyu
 * @date: 2022/7/5
 * @copyRight:
 */
public class LeaveRequest {
    //请假人姓名
    private String name;
    //请假时间
    private Integer leaveDays;

    public LeaveRequest(String name, Integer leaveDays) {
        this.name = name;
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }
}
