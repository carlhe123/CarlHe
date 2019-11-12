package com.carl.springcloudzuul.demo;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @ Author     ：Administrator
 * @ Date       ：2019/10/27 20:21
 * @ Description：
 * @Version: $
 */
public class Test {

    public static void main(String[] args) {
        Stream.of(0,1,2,3,4,5,6,7,8,9)
                .filter(v->v%2==0)
                .map(v->v+1)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
//                .forEach(System.out::println);

    }
}
