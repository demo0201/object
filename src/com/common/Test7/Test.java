package com.common.Test7;

import java.util.Scanner;

/**
 * @Author: nxw
 * @Date: 2020/4/17 19:37
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ref = "^[\\u4e00-\\u9fa5]+$";
        String chineseName = sc.nextLine();
        if(!chineseName.matches(ref)){
            System.out.println("中文名字错误");
            return;
        }
        String tele = sc.nextLine();
        String ref1 = "^1(3|4|5|6|7|8|9)\\d{9}$";
        if (!tele.matches(ref1)){
            System.out.println("手机号格式错误");
            return;
        }
        User user1 = new User("asd","qwe","asd", "指向", "132132", "1110@qq.com");
        System.out.println(user1.getPasswd());
    }
}
