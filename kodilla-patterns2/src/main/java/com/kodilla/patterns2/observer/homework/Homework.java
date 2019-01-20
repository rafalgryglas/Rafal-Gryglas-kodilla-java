package com.kodilla.patterns2.observer.homework;

public class Homework {
    private final double id;
    private final String title;

    public Homework(double id, String title) {
        this.id = id;
        this.title = title;
    }

    public double getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
