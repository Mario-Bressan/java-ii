package com.bressan.ocp.functional.functionalInterfaces.binaryfunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static BiConsumer<List<Integer>, Integer> listAddElement = List::add;

    static List aList = new ArrayList();

    public static void main(String[] args) {
        listAddElement.accept(aList, 10);

        System.out.println(aList);
    }
}
