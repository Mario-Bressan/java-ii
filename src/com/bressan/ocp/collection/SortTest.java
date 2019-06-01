package com.bressan.ocp.collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Paul", "01011980"));
        list.add(new Student("Peter", "01011990"));
        list.add(new Student("Patrick", "01012002"));

        // use lambda expression as a Comparator
        Collections.sort(list, (one, two) ->
                one.name.compareTo(two.name));

        PrintStream p = System.out;
        list.forEach(s -> p.println(s.name));
    }
}

class Student {
    String name;
    String dob;

    public Student(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }
}
