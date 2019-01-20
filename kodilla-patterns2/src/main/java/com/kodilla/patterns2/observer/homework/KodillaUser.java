package com.kodilla.patterns2.observer.homework;

public class KodillaUser {
    private final String name;
    private final String lastname;

    public KodillaUser(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return  " " + name + " " + lastname;

    }
}
