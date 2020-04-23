package com.common.nodelist;

import java.text.ParseException;
import java.util.*;
import java.util.regex.PatternSyntaxException;

/**
 * @Author: nxw
 * @Date: 2020/4/19 19:29
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("321");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        Iterator<String> iterator1 = list.iterator();
//        while (iterator1.hasNext()){
//            String s = iterator1.next();
//            if (s.equals("123")){
//                iterator1.remove();
//            }
//        }
//        Iterator<String> iterator2 = list.iterator();
//        while (iterator2.hasNext()){
//            System.out.println(iterator2.next());
//        }

//        Map<String,String> map = new HashMap<>();
//        map.put("1", "qwe");
//        map.put("2", "qwe3");
//        map.put("3", "qwe2");
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        map.replace("2", "qed");
//
//        List<Map<String,String>> mapList = new ArrayList<>();
        try {
            
            int n = 1/0;

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
