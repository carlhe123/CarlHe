package com.carl.springmvc.test;

import com.carl.util.code.StringToUnicodeUtils;
import sun.nio.cs.UnicodeEncoder;

import java.io.UnsupportedEncodingException;

/**
 * @Description 测试类
 * @Author carl.he
 * @Date 2019/7/11 10:56
 * @Version 1.0
 **/
public class TestDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        System.out.println(StringToUnicodeUtils.stringToUnicode("中文"));
//        System.out.println(StringToUnicodeUtils.unicodeToString("\\u4e2d\\u6587"));

        String A = "B";
        switch (A){
            case "A" :
                System.out.println("111111111");
            case "B":
                System.out.println("222222222");
                break;
            default:
                System.out.println("3333333333");
        }
    }
}
