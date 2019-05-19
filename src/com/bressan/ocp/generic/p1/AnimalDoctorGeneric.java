package com.bressan.ocp.generic.p1;

import java.util.ArrayList;
import java.util.List;

public class AnimalDoctorGeneric {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        animals.forEach(a -> a.checkup());
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
