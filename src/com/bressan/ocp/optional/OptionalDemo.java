package com.bressan.ocp.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noValue = Optional.empty();
        Optional<String> hasValue = Optional.of("ABCD");

        if (noValue.isPresent())
            System.out.println("This won't be displayed");
        else
            System.out.println("noValue has no value");

        if (hasValue.isPresent())
            System.out.println("The string in hasValue is: " + hasValue.get());

        System.out.println(noValue.orElse("Default String"));
    }
}
