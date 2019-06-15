package com.bressan.ocp.collection.set;

public class Dog implements Comparable<Dog> {

    int size;

    public Dog(int s) {
        size = s;
    }

    @Override
    public String toString() {
        return "" + size;
    }

    @Override
    public int compareTo(Dog o) {
        return size - o.size;
    }

}
