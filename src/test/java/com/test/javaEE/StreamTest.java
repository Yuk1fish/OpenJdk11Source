package com.test.javaEE;

import cn.hutool.json.JSONUtil;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/5/17
 * @copyRight:
 */
public class StreamTest {


    @Test
    public void test1() {
        List<Integer> i = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("stream.forEach打印结果如下");
        i.stream().forEach(System.out::println);//固定结果 1234567
        System.out.println("parallelStream.forEach打印结果如下");
        i.parallelStream().forEach(System.out::println);//每次的结果都不同
        System.out.println("parallelStream.forEachOrdered打印结果如下");
        i.parallelStream().forEachOrdered(System.out::println);//结果同stream.forEach

    }

    @Test
    public void test2() {
        //模拟10000条数据 循环打印测试
        List<Integer> list = new ArrayList();
        for (int j = 0; j < 10000; j++) {
            list.add(j);
        }
        // 统计并行执行list的线程
        Set<Thread> threadSet = new CopyOnWriteArraySet<>();
        // 并行执行
        list.parallelStream().forEach(integer -> {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + thread.getId() + ">>>" + integer);
            // 统计并行执行list的线程
            threadSet.add(thread);
        });
        System.out.println(threadSet);
        System.out.println("threadSet一共有" + threadSet.size() + "个线程");//打印结果由此证明parallelStream是多管道线程
        System.out.println("系统一个有" + Runtime.getRuntime().availableProcessors() + "个cpu");
    }

    @Test
    public void test3() {
        //模拟10000条数据 forEach打印测试
        List<Integer> list = new ArrayList();
        for (int j = 0; j < 10000; j++) {
            list.add(j);
        }

        //下面测试下各方法执行的时间 检查效率
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);//睡眠1毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("传统for循环运行时间:" + (endTime - startTime) + "ms");

        // 测试单管道stream执行效率
        startTime = System.currentTimeMillis();
        list.stream().forEach(r -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);//睡眠1毫秒
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        long streamendTime = System.currentTimeMillis();
        System.out.println("stream : " + (streamendTime - startTime) + "ms");

        // 测试多管道parallelStream执行效率
        startTime = System.currentTimeMillis();
        list.parallelStream().forEach(r -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);//睡眠1毫秒
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        long parallelStreamendTime = System.currentTimeMillis();
        System.out.println("parallelStream : " + (parallelStreamendTime - startTime) + "ms");
    }


    @Test
    public void streamTest() {
        class Student implements Comparable {
            private String name;
            private Integer age;

            public Student(String name, Integer age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public Integer getAge() {
                return age;
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
        Student s1 = new Student("aa", 10);
        Student s2 = new Student("bb", 20);
        Student s3 = new Student("aa", 30);
        Student s4 = new Student("dd", 40);
        List<Student> studentList = Arrays.asList(s1, s2, s3, s4);


    }


    @Test
    public void reduceTest() {
        //经过测试，当元素个数小于24时，并行时线程数等于元素个数，当大于等于24时，并行时线程数为16
        List<Integer> list = Arrays.asList(1, 2, 3);

        Integer reduce = list.stream().reduce((x, y) -> x + y).get();

        System.out.println(reduce);
    }

    @Test
    public void collectTest() {

        class Student {
            private String name;
            private Integer age;
            private Integer v3;

            public Student(String name, Integer age, Integer v3) {
                this.name = name;
                this.age = age;
                this.v3 = v3;
            }

            public Student() {
            }

            public String getName() {
                return name;
            }

            public Integer getAge() {
                return age;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setAge(Integer age) {
                this.age = age;
            }

            public Integer getV3() {
                return v3;
            }

            public void setV3(Integer v3) {
                this.v3 = v3;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }


        Student s1 = new Student("aa", 10, 1);
        Student s2 = new Student("bb", 20, 2);
        Student s3 = new Student("cc", 10, 3);
        List<Student> list = Arrays.asList(s1, s2, s3);


        Student[] students = list.stream().toArray(new IntFunction<Student[]>() {
            @Override
            public Student[] apply(int value) {
                return new Student[value];
            }
        });
        String s = JSONUtil.toJsonStr(students);
        System.out.println(s);

        Integer collect = list.stream().mapToInt(Student::getAge).sum();
        Double averageAge = list.stream().collect(Collectors.averagingDouble(Student::getAge)); // 13.333333333333334

        DoubleSummaryStatistics statistics = list.stream().collect(Collectors.summarizingDouble(Student::getAge));
        System.out.println(collect);
        System.out.println(averageAge);
        System.out.println("count:" + statistics.getCount() + ",max:" + statistics.getMax() + ",sum:" + statistics.getSum() + ",average:" + statistics.getAverage());
        System.out.println("Min:" + statistics.getMin());

        Map<Integer, Map<String, List<Student>>> collect1 = list.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.groupingBy(Student::getName)));
        System.out.println("groupBy:" + collect1);

        Map<Boolean, List<Student>> partMap = list.stream().collect(Collectors.partitioningBy(v -> v.getAge() > 10));


        System.out.println("分区：" + partMap);
    }


}


