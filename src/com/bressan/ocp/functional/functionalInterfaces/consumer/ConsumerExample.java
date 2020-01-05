package com.bressan.ocp.functional.functionalInterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

    public static void main(String[] args) {
        printUpperCase.accept("hello");
    }

//    static Consumer<String> printUpperCase() {
//        return str -> System.out.println(str.toUpperCase());
//    }
}
