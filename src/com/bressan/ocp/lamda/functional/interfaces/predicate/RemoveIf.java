package com.bressan.ocp.lamda.functional.interfaces.predicate;

import java.util.ArrayList;
import java.util.List;

//The default method removeIf() added in the Collection interface in Java 8 takes a Predicate as an argument:
public class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        list.removeIf(str -> str.startsWith("w"));
        list.forEach(System.out::println);
    }
}
