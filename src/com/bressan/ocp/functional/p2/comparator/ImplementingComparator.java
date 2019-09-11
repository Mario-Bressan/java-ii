package com.bressan.ocp.functional.p2.comparator;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class ImplementingComparator {
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35));

        List<Person> ascendingAge = people
                .stream()
                .sorted((p1, p2) -> p1.ageDifference(p2))
                .collect(toList());

        printPeople("Sorted in descending order by age:", ascendingAge);
    }

    static void printPeople(final String message, final List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
    }
}
