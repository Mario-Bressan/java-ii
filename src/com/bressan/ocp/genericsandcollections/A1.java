package com.bressan.ocp.genericsandcollections;

import java.util.SortedMap;
import java.util.TreeMap;

public class A1 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("a", "apple");
        map.put("e", "egg");
        map.put("g", "gear");
        SortedMap<String, String> sortedMap = map.subMap("a", "e");
        sortedMap.put("b", "ball");
        try {
            sortedMap.put("f", "fish");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            sortedMap.put("c", "coat");
        }

        System.out.println(sortedMap);
        System.out.println(map);
    }
    // prints:
    //java.lang.IllegalArgumentException: key out of range
    //	at java.util.TreeMap$NavigableSubMap.put(TreeMap.java:1516)
    //	at com.bressan.ocp.genericsandcollections.Clazz1.main(Clazz1.java:16)
    //{a=apple, b=ball, c=coat}
    //{a=apple, b=ball, c=coat, e=egg, g=gear}

    // o range do sub map é "a" ate "e" (exclusivo)
    // e ao tentar inserir um objeto com uma chave "f"
    // vai causar uma "key out of range" exception
    // no bloco catch inserimos um objeto com a chave "c"
    // a qual está dentro do range
}
