package com.bressan.ocp.collection.ordering;

import com.bressan.ocp.collection.ordering.comparable.Film;

import java.util.Arrays;
import java.util.List;

public class LIstUtil {

    public static List<Film> populateList() {
        Film f1 = new Film("Black Mask", "Jet Li");
        Film f2 = new Film("The Storm Riders", "Aaron Kwok");
        Film f3 = new Film("Young and Dangerous", "Ekin Cheng");
        Film f4 = new Film("Dragon Tiger Gate", "Donnie Yen");

        List<Film> films = Arrays.asList(f1, f2, f3, f4);
        return films;
    }
}
