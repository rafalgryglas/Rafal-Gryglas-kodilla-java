package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2.0, 1.5);
        } catch (Exception e) {
            System.out.println("Something wrong with exception " + e);
        } finally {
            System.out.println("Second challenge done!");
        }
    }
}
