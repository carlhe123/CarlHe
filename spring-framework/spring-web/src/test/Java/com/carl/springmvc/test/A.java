package com.carl.springmvc.test;

import java.lang.reflect.Method;

/**
 * @ Author     ：Administrator
 * @ Date       ：2019/9/11 22:03
 * @ Description：测试类
 * @Version: 1.0$
 */
public class A {
    private void test() {
        System.out.println(6 + 6 + "(Result)");
    }
    static public void main(String[] a) {
        new A().test();
    }

}
