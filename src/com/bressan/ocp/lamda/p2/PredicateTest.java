package com.bressan.ocp.lamda.p2;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> notNull = obj -> obj != null;
        System.out.print(notNull.test(null));
    }
}
