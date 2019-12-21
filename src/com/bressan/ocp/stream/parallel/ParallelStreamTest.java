package com.bressan.ocp.stream.parallel;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamTest {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 100000000; ++i) {
            ints.add(Integer.valueOf(i));
        }
        calculaTotal(ints);
        calculaTotalMultiThread(ints);

    }

    static void calculaTotalMultiThread(List<Integer> ints) {
        System.out.println("Calculo multi thread");
        long inicio = System.currentTimeMillis();
        Integer total = ints.stream()
                .parallel()
                .map(i -> i*2)
                .reduce(0, Integer::sum);
        System.out.println("Total: " + total);
        System.out.println("Tempo decorrido mt: " + (System.currentTimeMillis() - inicio) + " ms");
    }

    static void calculaTotal(List<Integer> ints) {
        System.out.println("Calculo single thread");
        long inicio = System.currentTimeMillis();
        Integer total = ints.stream()
                .map(i -> i*2)
                .reduce(0, Integer::sum);
        System.out.println("Total: " + total);
        System.out.println("Tempo decorrido mt: " + (System.currentTimeMillis() - inicio) + " ms");
    }


}
