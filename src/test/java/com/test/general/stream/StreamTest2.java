package com.test.general.stream;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author:
 * @CreateTime: 2022-08-20  10:54
 * @Description:
 */
public class StreamTest2 {


    @Test
    public void test1() {
        // 获取属于“书籍”类别且价格 > 100 的产品列表
        List<Product> products = new ArrayList<>();
        List<Product> productList = products.stream()
                .filter(product -> "书籍".equals(product.getName()))
                .filter(product -> product.getPrice() > 100)
                .collect(Collectors.toList());
    }

    @Test
    public void test2() {
        //获取产品属于“宝贝”类别的订单列表
        List<Order> orders = new ArrayList<>();
        List<Order> orderList = orders
                .stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> "宝贝".equals(product.getName())))
                .collect(Collectors.toList());
    }

    @Test
    public void test3() {
        // 获取类别=“玩具”的产品列表，然后应用 10% 的折扣
        List<Product> products = new ArrayList<>();

        List<Product> productList = products.stream()
                .filter(product -> "玩具".equals(product.getName()))
                .peek(product -> product.setPrice(product.getPrice() * 0.9))
                .collect(Collectors.toList());
    }

    @Test
    public void test4() {
        // 获取 2021 年 2 月 1 日至 2021 年 4 月 1 日第 2 层客户订购的产品列表
        List<Order> orders = new ArrayList<>();
        List<Product> products = orders.stream()
                .filter(order -> "2".equals(order.getCustomer().getTier()))
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
                .flatMap(order -> order.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

    }

}
