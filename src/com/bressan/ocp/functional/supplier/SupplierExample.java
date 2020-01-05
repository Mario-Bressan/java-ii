package com.bressan.ocp.functional.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();

    public static void main(String[] args) {
        System.out.println(currentDateTime.get());
    }
}
