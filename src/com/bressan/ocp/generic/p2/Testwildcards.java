package com.bressan.ocp.generic.p2;

import com.bressan.ocp.generic.model.Animal;
import com.bressan.ocp.generic.model.Bird;
import com.bressan.ocp.generic.model.Cat;
import com.bressan.ocp.generic.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class Testwildcards {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        checkupAnimals(dogs);
        checkupAnimals(cats);

        List<Object> objects = new ArrayList<>();
        objects.add(new Bird());
        doInsert(objects);
    }

    static void checkupAnimals(List<? extends Animal> list) {
        list.forEach(a -> a.checkup());
    }

    static void doInsert(List<Object> list) {
        list.add(new Dog());
        list.add(new Cat());
        list.add("test");
        list.add(new Integer(1));

        list.forEach(e -> System.out.println(e.getClass()));

    }
}

