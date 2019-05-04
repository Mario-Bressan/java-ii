package com.bressan.ocp.lamda.functional.interfaces.consumers;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {

        Consumer<String> redOrBlue = color -> {
            if (color.equals("red")) {
                System.out.println("You are colorado");
            } else if (color.equals("blue")) {
                System.out.println("You are gremista");
            }
        };

        redOrBlue.accept("red");
    }
}
