package com.bressan.ocp.generic.p1;

import com.bressan.ocp.generic.model.Animal;
import com.bressan.ocp.generic.model.Bird;
import com.bressan.ocp.generic.model.Cat;
import com.bressan.ocp.generic.model.Dog;

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

