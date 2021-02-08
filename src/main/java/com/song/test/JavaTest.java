package com.song.test;

public class JavaTest {

    public  static String array = "abuacdeaudbdfcefhph";

    public static int[] container = new int[128];

    public static void main(String[] args) {

        for (int i = 0; i <array.length() ; i++) {
            int index = Character.valueOf(array.charAt(i)).hashCode();
//            System.out.println("for111:"+index);
            container[index] ++;
//            System.out.println("aaaa:"+container[index] ++);
        }

        for (int i = 0; i <array.length() ; i++) {
            int index = Character.valueOf(array.charAt(i)).hashCode();
//            System.out.println("for222:"+index);
            if (container[index] == 1) {
//                System.out.println("bbbb:"+container[index] ++);
                System.out.println("index: " + i);
                System.out.println("char: " + array.charAt(i));
                break;
            }
        }
    }
}
