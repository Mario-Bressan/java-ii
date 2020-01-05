package com.bressan.ocp.functional.functionalInterfaces.binaryfunctionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    static BiPredicate<List<Integer>, Integer> listContains = List::contains;

    static List aList = Arrays.asList(10, 20, 30);

    public static void main(String[] args) {
        System.out.println(listContains.test(aList, 20));
    }
}
