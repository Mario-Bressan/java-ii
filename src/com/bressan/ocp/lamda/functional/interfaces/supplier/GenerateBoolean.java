package com.bressan.ocp.lamda.functional.interfaces.supplier;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateBoolean {
    public static void main(String[] args) {
//        The generate() method in Stream interface is a static member
//        that takes a Supplier as the argument
        Random random = new Random();
        Stream.generate(random::nextBoolean)
                .limit(5)
                .forEach(System.out::println);
    }
}
