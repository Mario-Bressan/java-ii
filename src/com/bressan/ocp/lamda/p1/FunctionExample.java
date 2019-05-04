package com.bressan.ocp.lamda.p1;

import java.util.Arrays;

public class FunctionExample {
    public static void main(String[] args) {
        Arrays.stream("4, -5, 16".split(", "))
                .map(Integer::parseInt)
                .map(i -> (i<0)? -i : i)
                .forEach(System.out::println);

    }
}
