package com.bressan.ocp.lamda.p1;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        list.removeIf(str -> str.startsWith("w"));
        list.forEach(System.out::println);
    }
}
