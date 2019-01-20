package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observable {
    private final int numberQueue;
    private final KodillaUser kodillaUser;
    private final List<Observer> observers;
    private final ArrayDeque<Homework> homeworksQueue;

    public HomeworkQueue(int numberQueue, KodillaUser kodillaUser) {
        this.numberQueue = numberQueue;
        this.kodillaUser = kodillaUser;
        observers = new ArrayList<>();
        homeworksQueue = new ArrayDeque<>();
    }

    public void addHomeworkToQueue(Homework homework) {
        homeworksQueue.offer(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public KodillaUser getKodillaUser() {
        return kodillaUser;
    }

    public ArrayDeque<Homework> getHomeworksQueue() {
        return homeworksQueue;
    }
}
