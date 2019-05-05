package com.bressan.ocp.lamda.functional.interfaces.consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (x, y) -> {
            System.out.print(x);
            System.out.print(y);
        };

        biConsumer.accept("Mario ", "Bressan");
    }
}
