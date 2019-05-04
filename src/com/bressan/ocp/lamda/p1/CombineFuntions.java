package com.bressan.ocp.lamda.p1;

import java.util.Arrays;
import java.util.function.Function;

public class CombineFuntions {
    public static void main(String[] args) {
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> abs = Math::abs;
        Function<String, Integer> parseAndAbs = parseInt.andThen(abs);

        Arrays.stream("4, -5, 16".split(", "))
                .map(parseAndAbs)
                .forEach(System.out::println);
    }
}
