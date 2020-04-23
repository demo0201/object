package com.common.Test8;

import java.util.Scanner;

/**
 * @Author: nxw
 * @Date: 2020/4/17 19:56
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("----------   购买彩票   -----------");
        System.out.print("身份证号：");
        String idNum = sc1.nextLine();
        String ref = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$|^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";
        if (!idNum.matches(ref)){
            System.out.println("身份证格式有误");
            return;
        }
        System.out.println("购买号码：（输入（1-35）的7个数字以逗号间隔）");
        String buyNum = sc1.nextLine();
//        String ref1 = "^(\\d|[1-2][0-9]|3[0-5]),$";
        String ref1 = "^\\d{1,2},\\d{1,2},\\d{1,2},\\d{1,2},\\d{1,2},\\d{1,2},\\d{1,2}$";

        if (!buyNum.matches(ref1)){
            System.out.println("号码输入有误");
            return;
        }
        System.out.println("------------   彩票开奖  -------------");
        int[] a = new int[]{13,5,33,28,4,26,1};
        System.out.print("[");
        for (int i = 0; i < a.length ; i++) {
            if (i == a.length-1){
                System.out.print(a[i]);
                break;
            }
            System.out.print(a[i]+",");
        }
        System.out.println("]");
        System.out.println("-------------   兑奖信息  -------------");
        int sum = 0;
        String[] b = buyNum.split(",");
        for (String s : b) {
            int t = Integer.parseInt(s);
            for (int i : a) {
                if (i == t){
                    sum++;
                    break;
                }
            }
        }
        System.out.println("中奖数字个数："+sum);
        System.out.println("中奖金额："+sum*2.5);
        //330421199902013216
        //4,8,12,17,21,27,33
    }
}
