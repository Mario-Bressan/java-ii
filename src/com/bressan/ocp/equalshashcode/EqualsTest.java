package com.bressan.ocp.equalshashcode;

public class EqualsTest {
    public static void main(String[] args) {
        Person p1 = new Person(1L, "Bressan");
        Person p2 = new Person(2L, "Bressan");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}
