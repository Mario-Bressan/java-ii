package com.bressan.ocp.equalshashcode;

import java.util.*;
import java.util.List;

public class PerformanceTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new HashSet<>();
        Person person = null;

        long id = 1L;
        for (int i = 0; i < 1000000; i++) {
            person = new Person(id, "name"+ id);
            id++;
            personList.add(person);
            personSet.add(person);
        }

        long i = 999999;
        Person person1 = new Person(i, "name"+i);
        System.out.println("find in set:");
        Date inicioSet = new Date();
        if (personSet.contains(person1))
            System.out.println("objeto localizado em " + (new Date().getTime() - inicioSet.getTime()) + " milisegundos");

        Date inicioList = new Date();
        if (personList.contains(person1))
            System.out.println("objeto localizado em " + (new Date().getTime() - inicioList.getTime()) + " milisegundos");
    }
}
