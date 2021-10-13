package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Follower implements Observable{

    private Queue<Work> taskQueue;
    private List<Observer> observerList;
    private String name;
    private String surname;

    public Follower(String name, String surname) {
        this.taskQueue = new ArrayDeque<Work>();
        this.observerList = new ArrayList<>();
        this.name = name;
        this.surname = surname;
    }

    public void putToQueue(Work work) {
        taskQueue.offer(work);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer mentor : observerList) {
            mentor.update(this);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public Queue<Work> getTaskQueue() {
        return taskQueue;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}