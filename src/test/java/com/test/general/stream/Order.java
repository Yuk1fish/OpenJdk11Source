package com.test.general.stream;

import java.time.LocalDate;
import java.util.List;

/**
 * @Author:
 * @CreateTime: 2022-08-20  10:51
 * @Description: stream training Order entity
 */
public class Order {

    private Long id;

    private String status;

    private LocalDate orderDate;

    //产品
    private List<Product> products;
    //交货日期
    private LocalDate deliveryDate;

    private Customer customer;

    public Order(Long id, String status, LocalDate orderDate, List<Product> products, LocalDate deliveryDate, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.products = products;
        this.deliveryDate = deliveryDate;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
