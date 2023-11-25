package com.kodilla.spring.portfolio;

public class Fibonacci {
    public int fibonacciSequence(int n) {
        int result = 0;
        int first = 0;
        int second = 1;
        if(n == 0 || n == 1) {
            return n;
        } else {
            for(int i = 2; i <= n; i++) {
                result = first + second;
                first = second;
                second = result;
            }
            return result;
        }
    }
}
