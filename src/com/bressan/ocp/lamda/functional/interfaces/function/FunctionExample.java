package com.bressan.ocp.lamda.functional.interfaces.function;

import java.util.Arrays;

// A Function<T, R> “operates” on something and returns something:
// it takes one argument (of generic type T) and returns an object (of generic type R).
public class FunctionExample {
    public static void main(String[] args) {
        Arrays.stream("4, -5, 16".split(", "))
                .map(Integer::parseInt)
                .map(i -> (i<0)? -i : i)
                .forEach(System.out::println);

    }
}
