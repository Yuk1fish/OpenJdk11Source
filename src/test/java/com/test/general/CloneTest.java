package com.test.general;

import org.junit.Test;

import java.time.LocalDateTime;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/5/28
 * @copyRight:
 */
public class CloneTest {


    @Test
    public void test(){
        class Person implements Cloneable {

            public int age;

            public String bir;

            public String name;

            public LocalDateTime date;

            public Person(int age, String bir, String name, LocalDateTime date) {
                this.age = age;
                this.bir = bir;
                this.name = name;
                this.date = date;
            }

            public Person clone() {
                Person o = null;
                try {
                    o = (Person) super.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                return o;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getBir() {
                return bir;
            }

            public void setBir(String bir) {
                this.bir = bir;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public LocalDateTime getDate() {
                return date;
            }

            public void setDate(LocalDateTime date) {
                this.date = date;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "age=" + age +
                        ", bir='" + bir + '\'' +
                        ", name='" + name + '\'' +
                        ", date=" + date +
                        '}';
            }
        }

        Person p1 = new Person(12, "2000-11-11", "xxx", LocalDateTime.now());

        System.out.println("原对象 = "+p1.toString());

        Person p2 = p1.clone();

        System.out.println("克隆对象 = "+p2.toString());

        p2.setAge(13);
        p2.setBir("2022-11-11");
        p2.setName("yyy");
        p2.setDate(LocalDateTime.of(2022,12,12,12,12));
        System.out.println("被修改后的原对象 = "+ p1.toString());
        System.out.println("被修改后的clone对象 = " + p2.toString() );

    }
}
