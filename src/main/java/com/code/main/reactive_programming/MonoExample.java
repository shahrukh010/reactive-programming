package com.code.main.reactive_programming;

import java.nio.file.attribute.UserDefinedFileAttributeView;

import reactor.core.publisher.Mono;

public class MonoExample {

    public static void main(String[] args) {

        userRepository(333).subscribe(

                Util.onNext(),
                Util.onError(),
                Util.onComplete());
    }

    private static Mono<String> userRepository(int userId) {

        if (userId == 1)

            return Mono.just(Util.getFaker().name().firstName());

        if (userId == 2)
            return Mono.empty();// null you can not pass because of Mono<String> can not accept null

        else
            return Mono.error(new RuntimeException("User Id Not Found"));
    }

}
