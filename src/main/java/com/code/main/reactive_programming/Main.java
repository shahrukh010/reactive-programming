package com.code.main.reactive_programming;

import java.util.stream.Stream;

import reactor.core.publisher.Mono;

public class Main {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1).map(
				i -> {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					return i * 2;
				});

		Mono<Integer> mono = Mono.just(02);
		System.out.println(stream);
		stream.forEach(System.out::println);
		System.out.println(mono);

		// until unless subscribe we can to print data
		mono.subscribe(i -> System.out.println(i));

	}

}
