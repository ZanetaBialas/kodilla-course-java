package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2.0, 1.0);
        } catch (Exception e) {
            System.out.println("We have new problem: " + e);
        } finally {
            System.out.println("I am gonna be here... always");
        }
    }
}
