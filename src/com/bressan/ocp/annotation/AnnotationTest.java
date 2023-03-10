package com.bressan.ocp.annotation;

import java.time.LocalDate;

public class AnnotationTest {
    public static void main(String[] args) {
        System.out.println("teste feature");
        User user = new User("mario", "123456789", LocalDate.of(1982, 01, 01));
        System.out.println(Validator.validate(user));
    }
}
