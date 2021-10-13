package com.kodilla.patterns2.observer.homework;

public class Work {
    String number;
    String content;

    public Work(String number, String content) {
        this.number = number;
        this.content = content;
    }

    public String getSignature() {
        return number;
    }

    public String getContent() {
        return content;
    }
}