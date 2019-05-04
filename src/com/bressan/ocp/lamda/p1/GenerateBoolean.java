package com.bressan.ocp.lamda.p1;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateBoolean {
    public static void main(String[] args) {
        Random random = new Random();
        Stream.generate(random::nextBoolean)
                .limit(5)
                .forEach(System.out::println);
    }
}
