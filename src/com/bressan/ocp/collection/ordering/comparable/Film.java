package com.bressan.ocp.collection.ordering.comparable;

public class Film implements Comparable<Film>{
    String title;
    String leadActor;

    public Film(String title, String leadActor) {
        this.title = title;
        this.leadActor = leadActor;
    }

    public Film() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    @Override
    public String toString() {
        return title + ", " + leadActor + " \n";
    }

    @Override
    public int compareTo(Film f) {
        return title.compareTo(f.getTitle());
    }
}
