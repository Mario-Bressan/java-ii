package com.bressan.ocp.functional.functionalInterfaces.function;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, Integer> strLength = str -> str.length();


    public static void main(String[] args) {
        System.out.println(strLength.apply("Inconstitucionalicimamente"));
    }

}
