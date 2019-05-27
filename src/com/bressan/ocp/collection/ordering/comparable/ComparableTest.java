package com.bressan.ocp.collection.ordering.comparable;

import com.bressan.ocp.collection.ordering.LIstUtil;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Film> films = LIstUtil.populateList();

        Collections.sort(films);

        System.out.println(films);
    }
}
