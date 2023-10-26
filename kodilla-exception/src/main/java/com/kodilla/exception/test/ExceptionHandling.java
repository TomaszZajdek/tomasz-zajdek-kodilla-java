package com.kodilla.exception.test;

public class ExceptionHandling {
    public void probablyIWillThrowException(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        } finally {
            System.out.println("Exception handled");
        }
    }
}
