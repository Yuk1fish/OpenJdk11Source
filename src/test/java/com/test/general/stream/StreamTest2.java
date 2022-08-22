package com.test.general.stream;

import org.junit.Test;

import java.time.LocalDate;
import java.util.*;
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

    @Test
    public void test5() {
        //获取“书籍”类别中最便宜的产品
        List<Product> products = new ArrayList<>();
        Product p = products.stream()
                .filter(product -> "book".equalsIgnoreCase(product.getName()))
                .sorted(Comparator.comparing(Product::getPrice))
                .findFirst()
                .get();
    }

    @Test
    public void test6() {
        // 获取最近的 3 个订单
        List<Order> orders = new ArrayList<>();
        List<Order> collect = orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }


    @Test
    public void mappingExample() {
        //按年龄group by
        List<Person> list = new ArrayList<>();
        list.add(new Person("Ram", 30));
        list.add(new Person("Shyam", 20));
        list.add(new Person("Shiv", 20));
        list.add(new Person("Mahesh", 30));
        Map<Integer, String> nameByAgeMap = list.stream().collect(
                Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.joining(",", "[", "]"))));
        nameByAgeMap.forEach((k, v) -> System.out.println("Age:" + k + "  Persons: " + v));
    }


}
