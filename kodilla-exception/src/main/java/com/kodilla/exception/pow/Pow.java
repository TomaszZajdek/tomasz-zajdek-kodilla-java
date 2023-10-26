package com.kodilla.exception.pow;

public class Pow {

    public int exponentiationCalc(int base, int exponent) {
        int result = 1;
        if(exponent > 0) {
        result = base;
        }
        for(int i = 1; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        Pow pow = new Pow();
        System.out.println(pow.exponentiationCalc(0, 3));
        System.out.println(pow.exponentiationCalc(2,0));
        System.out.println(pow.exponentiationCalc(3,1));
        System.out.println(pow.exponentiationCalc(3,3));
    }
}
