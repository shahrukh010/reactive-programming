package com.code.main.reactive_programming;

import com.github.javafaker.Faker;

public class FackerDemo {

    public static void main(String... strings) {

        for (int index = 0; index < 10; index++) {

            System.out.println(Faker.instance().name().firstName() + " " + Faker.instance().name().lastName());
        }
    }
}
