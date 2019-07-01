package com.bressan.ocp.generic.method;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {
        String s = "test";
        System.out.println(makeArrayList(s));
        Integer i = 1;
        System.out.println(makeArrayList(i));
        Long l = 2L;
        System.out.println(makeArrayListOfNumber(l));
    }

    // nos métodos genéricos é necessário que seja declarado
    // o tipo da variável
    // antes da declaração do tipo de retorno
    static <T> List<T> makeArrayList(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }

    // é possível colocar um limite no tipo da variável
    // neste exemplo somente Number e e seus subtipos sao aceitos
    static <T extends Number> List<T> makeArrayListOfNumber(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }

//    prints:
//    [test]
//    [1]
//    [2]
}
