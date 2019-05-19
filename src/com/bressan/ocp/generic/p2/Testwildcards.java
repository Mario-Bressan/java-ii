package com.bressan.ocp.generic.p2;

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


abstract class Animal {
    public abstract void checkup();
}

class Dog extends Animal {
    @Override
    public void checkup() {
        System.out.println("Dog checkup");
    }
}

class Cat extends Animal {
    @Override
    public void checkup() {
        System.out.println("Cat checkup");
    }
}

class Bird extends Animal {
    @Override
    public void checkup() {
        System.out.println("Bird checkup");
    }
}
