package com.bressan.ocp.functional.functionalInterfaces.binaryfunctionalinterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {

    static BiFunction<String, String, String> concatStr = (x, y) -> x + y;

    public static void main(String[] args) {
        System.out.println(concatStr.apply("Olá ", "Mundo!"));
    }
}
