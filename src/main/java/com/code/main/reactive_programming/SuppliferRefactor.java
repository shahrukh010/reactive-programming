package com.code.main.reactive_programming;

import com.github.javafaker.Faker;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class SuppliferRefactor {

    public static void main(String[] args) {

        getName()
                .subscribeOn(Schedulers.boundedElastic()).subscribe(Util.onNext());
        getName();
    }

    private static Mono<String> getName() {

        return Mono.fromSupplier(() -> {

            System.out.println("Generate name......");
            Util.sleepSecond(3000);
            return Faker.instance().name().fullName();
        }).map(String::toUpperCase);
    }
}
