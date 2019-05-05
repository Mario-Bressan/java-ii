package com.bressan.ocp.lamda.functional.interfaces.predicate;

import java.util.function.Predicate;

//A Predicate<T> “affirms” something as true or false:
// it takes an argument of type T, and returns a boolean value.
public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<String> nullCheck = arg -> arg != null;
        Predicate<String> emptyCheck = arg -> arg.length() > 0;
        Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);

        String nullStr = null;
        String emptyStr = "";
        String str = "java";

        System.out.println(nullAndEmptyCheck.test(nullStr));
        System.out.println(nullAndEmptyCheck.test(emptyStr));
        System.out.println(nullAndEmptyCheck.test(str));
    }
}
