package com.song.stream;

import java.io.Serializable;

/**
 * @author King
 * @description api
 * @date 2021/4/12
 **/
public class Person implements Serializable {

    private static final long serialVersionUID = -8002966873087151368L;

    private String name;
    private String age;
    private String sex;

    public Person(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
