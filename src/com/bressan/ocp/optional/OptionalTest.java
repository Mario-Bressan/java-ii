package com.bressan.ocp.optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> nullValue = Optional.ofNullable(null);

        System.out.println(nullValue.orElse("new value"));
    }
}
