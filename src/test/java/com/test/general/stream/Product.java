package com.test.general.stream;

/**
 * @Author:
 * @CreateTime: 2022-08-20  10:49
 * @Description: stream training product entity
 */
public class Product {

    private Long id;

    private String name;
    //类别
    private String category;

    private Double price;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
