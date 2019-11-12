package com.carl.springflux;

import org.springframework.test.web.reactive.server.FluxExchangeResult;
import reactor.core.publisher.Flux;

import java.util.stream.Stream;

/**
 * @ Author     ：Administrator
 * @ Date       ：2019/10/27 20:42
 * @ Description：
 * @Version: $
 */
public class ReactiveTestDemo {
    public static void main(String[] args) {
        Stream.of(0,1,2,3,4,5,6,7,8,9)
                .filter(v->v%2==1)
                .map(v->v+1)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        Flux.just(0,1,2,3,4,5,6,7,8,9)
            .filter(v->v%2==1)
            .map(v->v+1)
            .reduce(Integer::sum)
            .subscribe(System.out::println);
    }
}
