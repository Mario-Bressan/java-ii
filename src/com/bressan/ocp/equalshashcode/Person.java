package com.bressan.ocp.equalshashcode;

public class Person {

    private Long id;
    private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof  Person))
            return false;
        Person person = (Person) o;
        return id.equals(person.id) &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return HashUtil.generateHash(name + id);
    }
}
