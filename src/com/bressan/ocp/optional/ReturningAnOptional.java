package com.bressan.ocp.optional;

import java.util.Optional;

public class ReturningAnOptional {
    public static void main(String[] args) throws Throwable{
        Optional average = average(90, 100);
        Optional average2 = average();

        printAverage(average);
        printAverage(average2);
    }

    static Optional<Double> average(int... scores) {
        if (scores.length == 0)
            return Optional.empty();
        int sum = 0;
        for (int score : scores)
            sum += score;
        return Optional.of((double) sum/scores.length);
    }

    static void printAverage(Optional average) throws Throwable {
        average.ifPresent(System.out::println);
        System.out.println(average.orElse(Double.NaN));
        System.out.println(average.orElseGet(() -> Math.random()));
        System.out.println(average.orElseThrow(() -> new IllegalStateException()));
    }
}
