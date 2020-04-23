package com;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: nxw
 * @Date: 2020/4/16 11:26
 */
public class demo {

    public static String addtion(String a,String b){
        String reg = "^[0-9]+(\\.[0-9]+)?$";

        if(a.matches(reg) && b.matches(reg) ){
            BigDecimal bigDecimal1 = new BigDecimal(a);
            BigDecimal bigDecimal2 = new BigDecimal(b);
            return bigDecimal1.add(bigDecimal2).toString();
        }
        else {
            return "no";
        }
    }

    public static double addtion(double a ,double b ){
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(a));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(b));
        return bigDecimal1.add(bigDecimal2).doubleValue();
    }

    public static void main(String[] args) throws ParseException {
//        int[] a = {1,23,4,5,67,32,43};
//        int[] b = Arrays.copyOf(a, a.length);
//        System.out.println(Arrays.toString(b));
//        b = Arrays.copyOfRange(a, 2, 3);
//        System.out.println(Arrays.toString(b));
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));

//        Integer integer1 = new Integer(123);
////        System.out.println(integer1.compareTo(123));
//        double dou1 = integer1.doubleValue();
////        System.out.println(dou1);
//        System.out.println(Integer.compare(1222, 123));
//        System.out.println(addtion("1.123132", "0.231321"));

//        StringBuffer buffer1 = new StringBuffer("asdasd");
//        String s2 = buffer1.reverse().toString();
//        System.out.println(s2);
        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String now1 = sdf.format(now);
        System.out.println(now1);
        String time = "2020-5-06 08:00:12";
        Date date1 = sdf.parse(time);
        System.out.println(date1);
        Set<Integer> hashSet = new HashSet<>();

    }
}
