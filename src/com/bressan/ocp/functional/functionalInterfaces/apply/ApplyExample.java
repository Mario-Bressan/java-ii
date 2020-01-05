package com.bressan.ocp.functional.functionalInterfaces.apply;

import java.util.function.Function;

public class ApplyExample {
    public static void main(String[] args) {
        System.out.println(converter().apply(1).length());
        System.out.println(converter().apply(300).length());
        System.out.println(half().apply(2));
        System.out.println(cube().apply(2));
    }

    static Function<Integer, String> converter() {
        return (i) -> Integer.toString(i);
    }

    static Function<Integer, Double> half() {
        return (i) -> i / 2.0;
    }

    static Function<Integer, Integer> cube() {
        return (i) -> i*i*i;
    }
}
