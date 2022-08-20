package com.test.general.stream;

/**
 * @Author:
 * @CreateTime: 2022-08-20  10:52
 * @Description: stream training Customer entity
 */
public class Customer {
    private Long id;

    private String name;
    // 等级
    private Integer tier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }
}
