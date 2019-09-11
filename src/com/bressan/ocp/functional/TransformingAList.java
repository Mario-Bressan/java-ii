package com.bressan.ocp.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransformingAList {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        oldStyle(friends);
        functionalStyle(friends);
    }

    static void oldStyle(List<String> list) {
        final List<String> uppercaseNames = new ArrayList<>();
        for (String name : list) {
            uppercaseNames.add(name.toUpperCase());
        }
        System.out.println(uppercaseNames);
     }

    static void functionalStyle(List<String> list) {
        final List<String> uppercaseNames = new ArrayList<>();
        list.forEach(name -> uppercaseNames.add(name.toUpperCase()));
        System.out.println(uppercaseNames);
    }
}
