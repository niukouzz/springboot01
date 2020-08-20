package com.song.test;

/**
 * @author King
 * @description api
 * @date 2020/6/22
 **/
public class UUID {
    public static void main(String[] args) {
//        int hashCode = java.util.UUID.randomUUID().toString().hashCode();
//        StringBuffer num = new StringBuffer();
//        String substring = num.append(String.format("%010d", hashCode)).toString();
//        String substring2 = num.append(String.format("%010d", hashCode)).toString().substring(0, 6);
//        System.out.println("结果1:"+hashCode);
//        System.out.println("结果2:"+substring);
//        System.out.println("结果3:"+substring2);
        System.out.println("结果3:"+genNum());
    }
    public static String genNum() {
        int hashCode = java.util.UUID.randomUUID().toString().hashCode();
        StringBuffer num = new StringBuffer();
        if (hashCode < 0) {
            hashCode = 0 - hashCode;
            num.append("0");
        } else {
            num.append("1");
        }
        return num.append(String.format("%010d", hashCode)).toString().substring(0, 6);
    }
}
