package com.bressan.ocp.lamda.functional.interfaces.consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample {
    public static void main(String[] args) {
        Stream<Integer> ints = Stream.of(1, 2, 3);
        Consumer<Integer> printInts = System.out::println;
        ints.forEach(printInts);
    }
}
