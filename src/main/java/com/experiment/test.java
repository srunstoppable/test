package com.experiment;

import lombok.Data;

/**
 * @author s r
 * @date 2018/12/19
 */
public class test {
    public static void main(String[] args) {
        Person p = new Person("张三");

        change(p);

        System.out.println(p.name);
    }

    public static void change(Person p) {
        Person person = new Person("李四");
        p.setName(person.getName());
    }

}

@Data
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}