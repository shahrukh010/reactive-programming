package com.code.main.reactive_programming;

import java.util.concurrent.Callable;

import com.github.javafaker.Faker;

import reactor.core.publisher.Mono;

public class MonoFromSuplier {

    public static void main(String[] args) {

        // Mono<String> mono = Mono.just(getName());

        Mono<String> mono = Mono.fromSupplier(() -> getName());// fromSupllier() it is functional interface java8

        Callable<String> stringCallable = () -> getName();

        mono.subscribe(Util.onNext(), Util.onError(), Util.onComplete());
        Mono.fromCallable(stringCallable).subscribe(Util.onNext());
    }

    private static String getName() {

        System.out.println("Generating name");

        return Util.getFaker().name().firstName();
    }
}
