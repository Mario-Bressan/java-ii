package com.bressan.ocp.generic.p2;

import com.bressan.ocp.generic.model.Animal;
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
    }

    static void checkupAnimals(List<? extends Animal> list) {
        list.forEach(a -> a.checkup());
    }
}

