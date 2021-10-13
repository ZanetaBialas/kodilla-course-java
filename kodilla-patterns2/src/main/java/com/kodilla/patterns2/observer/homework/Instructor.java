package com.kodilla.patterns2.observer.homework;

public class Instructor implements Observer{

    public final String instruktorName;
    private int updateCount;

    public Instructor(String mentorName) {
        this.instruktorName = mentorName;
    }

    @Override
    public void update(Follower follower) {
        System.out.println(instruktorName + ": You`ve got new work in queue done by " + follower.getName() + " "
                + follower.getSurname() + "\n" + "Total: " + follower.getTaskQueue().size() + " tasks.");
        updateCount++;
    }

    public String getMentorName() {
        return instruktorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
