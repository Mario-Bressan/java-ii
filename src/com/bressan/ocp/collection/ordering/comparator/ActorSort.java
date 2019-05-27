package com.bressan.ocp.collection.ordering.comparator;

import com.bressan.ocp.collection.ordering.comparable.Film;

import java.util.Comparator;

public class ActorSort implements Comparator<Film> {

    @Override
    public int compare(Film one, Film two) {
        return one.getLeadActor().compareTo(two.getLeadActor());
    }
}
