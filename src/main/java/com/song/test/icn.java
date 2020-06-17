package com.song.test;

import java.util.Calendar;

/**
 * @author King
 * @description api
 * @date 2020/4/22
 **/
public class icn {
    public static String NumberChange(String type, String number){
        String newNo = "001";

        if(number != null && !number.isEmpty()){
            int newNumber = Integer.parseInt(number) + 1;
            newNo = String.format(type + "%03d", newNumber);
        }

        return newNo;
    }

    public static void main(String[] args) {
        String sp2020 = icn.NumberChange("SP2020", "001");
        System.out.println("生成SP编号："+sp2020);
        String s = "SP2020001";
        String substring = s.substring(s.length() - 3);
        System.out.println("截取后："+substring);


        //生成SP编号
        //ChannelCarShop carShop = channelCarShopDao.selectLastData();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        StringBuilder sb = new StringBuilder();
//        String sp = sb.append("SP").append(year).toString();
//        String x = NumberChange(sp, "000");
//        System.out.println("编号生成："+x);
        String x = "SP2020088";
        String y = x.substring(x.length() - 3);
        String sp = sb.append("SP").append(year).toString();
        String v = NumberChange(sp, y);
        System.out.println("编号生成："+v);


//        if (carShop.getCarShopCode() == null) {
//            String sp = sb.append("SP").append(year).toString();
//            String s = NumberChange(sp, "000");
//            System.out.println("编号生成："+s);
//        }else{
//            String x = chanSp.getSpCode();
//            String y = x.substring(x.length() - 3);
//            String sp = sb.append("SP").append(year).toString();
//            String s = NumberChange(sp, y);
//            System.out.println("编号生成："+s);
//        }



    }
}
