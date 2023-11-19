package com.kodilla.additional;

public class excersises {
    public void factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("result : " + n );
    }
}
