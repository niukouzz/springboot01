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

    public static void main(String[] args) {
        int[] arr= new int[]{1,22,57,3,25,2,35,24,24,61,53};
        int max=arr[0];
        int second=0;
        for (int i=0;i<arr.length;i++){
            int currentMax=new Integer(max);
            second=arr[i];
            max = Math.max(max, arr[i]);
            if (max==arr[i]){
                second=currentMax;
            }else  if (arr[i]>second){
                second=arr[i];
            }

        }

        System.out.println(max+"=============="+second);
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
