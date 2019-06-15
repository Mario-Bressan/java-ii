package com.bressan.ocp.collection.map;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
       Map<Integer, Boolean> booleanMap = generateMap();
       booleanMap.forEach((k, v) -> System.out.println(k + ":" + (Objects.nonNull(v)? v : false)));
    }

    static Map generateMap(){
        Random random = new Random();
        Map<Integer, Boolean> booleanMap = new HashMap<>();
        for (int i = 1; i < 20; i++) {
            booleanMap.put(Integer.valueOf(i), random.nextBoolean());

        }
        booleanMap.put(19, null);
        return booleanMap;
    }
}
