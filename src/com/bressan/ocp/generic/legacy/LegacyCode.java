package com.bressan.ocp.generic.legacy;



import java.util.ArrayList;
import java.util.List;

public class LegacyCode {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add(7);
        for(Object s : list)
            System.out.println(s.toString());
    }
}
