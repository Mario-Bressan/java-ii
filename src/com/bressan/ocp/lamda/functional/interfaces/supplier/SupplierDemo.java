package com.bressan.ocp.lamda.functional.interfaces.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//supplies takes nothing but returns something
public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();

        System.out.println(currentDateTime.get());
    }
}
