package com.bressan.ocp.lamda.functional.interfaces.suppliers;

import java.util.Map;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {

        Supplier<String> userSupplier = () -> {
            Map<String, String> env = System.getenv();
            return env.get("USERNAME");
        };

        System.out.println("User is: " + userSupplier.get());
    }
}
