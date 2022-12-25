package com.code.main.reactive_programming;

import java.util.function.Consumer;

import com.github.javafaker.Faker;

public class Util {

    private static final Faker FAKER = Faker.instance();

    public static Consumer<Object> onNext() {

        return o -> System.out.println("Recived: " + o);
    }

    public static Consumer<Throwable> onError() {

        return e -> System.out.println("Error: " + e.getMessage());
    }

    public static Runnable onComplete() {

        return () -> System.out.println("Completed");
    }

    public static Faker getFaker() {

        return FAKER;
    }

    public static void sleepSecond(int value) {

        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
