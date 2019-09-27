package com.bressan.ocp.generic.legacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(2);
        myList.add(4);
        myList.add(6);

        Adder adder = new Adder();
        int total = adder.addAll(myList);
        System.out.println(total);
    }
}

class Adder {
    int addAll(List list) throws IllegalArgumentException {
        int total = 0;
        /**
         *  codigo anterior ao Java 5 (sem generics)
         *  verifica se a collection e do tipo Integer
         *  uma vez que nao era possivel especificar o tipo de objetos na lista
         */
        if ((list.size() > 0) && (list.get(0) instanceof Integer)) {
            Iterator it = list.iterator();
            while(it.hasNext()) {
                int i = ((Integer)it.next()).intValue();
                total += i;
            }
            return total;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
