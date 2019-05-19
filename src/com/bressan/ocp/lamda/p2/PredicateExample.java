package com.bressan.ocp.lamda.p2;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicateContains = "Estudando para OCP"::contains;

        checkString("OCP", predicateContains);
    }

    static void checkString(String str, Predicate<String> predicate) {
        System.out.println(predicate.test(str) ? "contains" : "doesn't contain");
    }
}
