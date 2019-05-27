package com.bressan.ocp.collection.ordering.comparator;


import com.bressan.ocp.collection.ordering.LIstUtil;
import com.bressan.ocp.collection.ordering.comparable.Film;

import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Film> films = LIstUtil.populateList();

        System.out.println(films);
        Collections.sort(films);
        ActorSort actorSort = new ActorSort();
        Collections.sort(films, actorSort);
        System.out.println(films);
    }
}
