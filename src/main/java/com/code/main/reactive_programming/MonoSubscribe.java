package com.code.main.reactive_programming;

import reactor.core.publisher.Mono;

public class MonoSubscribe {

    public static void main(String... strings) {

        Mono<String> mono = Mono.just("Hello");

        mono.subscribe(
                item -> System.out.println(item),
                erro -> System.out.println(erro.getMessage()),
                () -> System.out.println("completed"));

        Mono<Integer> mono2 = Mono.just("Hi annie!").map(String::length).map(i -> i / 0);

        mono2.subscribe(
                item -> System.out.println(item),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("task completed")

        );

    }
}
